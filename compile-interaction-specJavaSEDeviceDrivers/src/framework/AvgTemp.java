package framework;
import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;
import java.util.List;
import java.util.ArrayList;


public abstract class  AvgTemp implements Subscriber, Runnable{ 
			
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	
	
	public AvgTemp(PubSubMiddleware pubSubM, Device deviceInfo) {   
		
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
    		  postInitialize();
    } 
	
	protected void postInitialize() {
      subscribeTempMeasurement(); 
           
    }
    
		
	
		


        private TempStruct roomAvgTempMeasurement;
        protected void setroomAvgTempMeasurement( TempStruct newValue) {
         
          if (roomAvgTempMeasurement != newValue) {
            roomAvgTempMeasurement = newValue; 
            
            Logger.log(myDeviceInfo.getName(),"AvgTemp", "Publishing roomAvgTempMeasurement");     
         
            this.myPubSubMiddleware.publish("roomAvgTempMeasurement", newValue, myDeviceInfo);		
           
          }
        } 
        /*   
        protected  TempStruct getRoomAvgTempMeasurement() {
          return  roomAvgTempMeasurement;
        } */
           

		

        
        public void notifyReceived(String eventName, Object arg, Device deviceInfo) { 
        try {	
        

                      if (eventName.equals("tempMeasurement"))  
                     { 
                    Logger.log(myDeviceInfo.getName(),"AvgTemp",
                     "Notification Received tempMeasurement");
                   
                    onNewtempMeasurement((TempStruct) arg); 
                    
                  //  onNewTempMeasurementReceived((TempStruct) arg);
                 }
                   
          
        
        
        	 } catch (Exception e) {
                 e.printStackTrace();
           }
        }
	  

	    	   
	    	    public abstract void onNewtempMeasurement(TempStruct arg);	   		
	    	  
	    	   
	    	   	public void subscribeTempMeasurement() {
	    	   		    
	    	   		
	    					
	    			List<String> regionInfo = new ArrayList<String>(); 
	    			regionInfo.add("*");	
	    				
	    	   		this.myPubSubMiddleware.subscribe(this,"tempMeasurement", regionInfo);
	    		}
	    		 	
		
		
		public void run() {	
		}	
        
 
}