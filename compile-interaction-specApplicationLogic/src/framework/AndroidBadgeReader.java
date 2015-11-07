package deviceImpl;

import framework.*;
import logic.*;
import android.content.Context;
import android.content.Intent;
import com.google.gson.JsonObject;
import iotsuite.android.sensingmiddleware.ISensorListener;
import iotsuite.android.sensingmiddleware.PubSubsSensingFramework;
import iotsuite.android.extended.sensingframework.BadgeReaderKeys;
import iotsuite.android.extended.sensingframework.BadgeReaderSensorProbe;



public class AndroidBadgeReader implements IBadgeReader, 
BadgeReaderKeys, ISensorListener  {
	
	private PubSubsSensingFramework pubSubSensingFramework = null;
	

			   	   
	      private static boolean badgeDetectedCondition= false;
		

			   	   
	      private static boolean badgeDisappearedCondition= false;
		
	private static JsonObject BadgeReaderData = new JsonObject();
	
	
	

	 		   	   
	       private ListenerbadgeDetected listenerbadgeDetected = null;
	 	

	 		   	   
	       private ListenerbadgeDisappeared listenerbadgeDisappeared = null;
	 	
    
  
   public AndroidBadgeReader(Context context, LogicBadgeReader obj) {
	   
	   // Register the client
		pubSubSensingFramework = PubSubsSensingFramework.getInstance();
		

		           
		           
		           pubSubSensingFramework.registerForSensorData(this, BadgeDetectedEvent);
		           
		           

		           
		           
		           pubSubSensingFramework.registerForSensorData(this, BadgeDisappearedEvent);
		           
		            
      
		
		
		
		// Start the service
		Intent intent = new Intent(context, BadgeReaderSensorProbe.class);
		context.startService(intent);

	
	}
  

      
      /*@Override
      public  BadgeStruct getbadgeDetected(){
   	   //TODO: Device Developer write here device logic.
   	   //Sample code for reference.   
   	   //if(TemperatureSensorData != null) {
   	   //		return new TempStruct(Double.parseDouble(TemperatureSensorData.get(DISTANCE).toString()), "C");
   	 	// }else{
   			// if data is null, then return a Default value
   		//	return new TempStruct(-5 , "C");
   		// }	
   		
   	   
          return null;
      }*/
         
      @Override
      public void getbadgeDetected(ListenerbadgeDetected handler){
   	   listenerbadgeDetected = handler;
      }   
         


      
      /*@Override
      public  BadgeStruct getbadgeDisappeared(){
   	   //TODO: Device Developer write here device logic.
   	   //Sample code for reference.   
   	   //if(TemperatureSensorData != null) {
   	   //		return new TempStruct(Double.parseDouble(TemperatureSensorData.get(DISTANCE).toString()), "C");
   	 	// }else{
   			// if data is null, then return a Default value
   		//	return new TempStruct(-5 , "C");
   		// }	
   		
   	   
          return null;
      }*/
         
      @Override
      public void getbadgeDisappeared(ListenerbadgeDisappeared handler){
   	   listenerbadgeDisappeared = handler;
      }   
         

  
  @Override
  public boolean isEventDriven() {
    return true;
  }

    @Override
    public void onDataReceived(String eventName, JsonObject dataEvent) {
    	
    		BadgeReaderData = dataEvent;

    		     		 
    		     		 if (eventName.equals("badgeDetectedEvent")) {
    		           listenerbadgeDetected.onNewbadgeDetected(new BadgeStruct("1",
    		           "badgeDetected"));
    		     }
    		     		 
    		     		 

    		     		 
    		     		 if (eventName.equals("badgeDisappearedEvent")) {
    		           listenerbadgeDisappeared.onNewbadgeDisappeared(new BadgeStruct("1",
    		           "badgeDisappeared"));
    		     }
    		     		 
    		     		  
    	
    }




}