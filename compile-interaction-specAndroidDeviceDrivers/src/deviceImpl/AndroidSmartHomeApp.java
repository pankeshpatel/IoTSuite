package deviceImpl;

import logic.*;
import framework.*;
import android.content.Context;
import android.app.Activity;
import iotsuite.android.localmiddleware.IDataListener;
import iotsuite.android.localmiddleware.PubSubsSensingFramework;



public class AndroidSmartHomeApp implements ISmartHomeApp, IDataListener {


			  private ListenerSmartHomeApp  listenerOffCommand = null;    
	 
	  

			  private ListenerSmartHomeApp  listenerSetTempCommand = null;    
	 
	  


              private ListenerSmartHomeApp  listenerProfileRequest = null;   
        
    
     public static PubSubsSensingFramework pubSubSensingFramework;
   private Context appContext;
   public static Activity appActivity;
 
	public AndroidSmartHomeApp(Context context, LogicSmartHomeApp obj) {
	
	  this.appContext = context;
    appActivity = (Activity) appContext;
	 pubSubSensingFramework = PubSubsSensingFramework.getInstance();
	 

	        pubSubSensingFramework.registerForSensorData(this, "profileResponse");
	      
    

              pubSubSensingFramework.registerForSensorData(this, "displayTempNotify");  
            
    
 
	}
	


		
		   @Override
		   public void OffGUI(ListenerSmartHomeApp handler){
		     listenerOffCommand = handler;
		   }
	 
	  

		
		   @Override
		   public void SetTempGUI(ListenerSmartHomeApp handler){
		     listenerSetTempCommand = handler;
		   }
	 
	  
  
  

	           @Override
	           public void ProfileGUI(ListenerSmartHomeApp handler) {
	                listenerProfileRequest = handler; 
	           }    
	      
    
    @Override
    public void onDataReceived(String eventName, Object data) {
    // TODO : Developer will write Device Driver code.
    // This method will get data from Logic method
    

                    if(eventName.equals("profileResponse")){
                    
                      }
                      
            
            

                 if(eventName.equals("displayTempNotify")){
                 
                 }
                  
    }  
}