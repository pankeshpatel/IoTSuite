package framework;
import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;
import java.util.List;
import java.util.ArrayList;


public abstract class  DisplayTempController implements Subscriber, Runnable{ 
			
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	
	
	public DisplayTempController(PubSubMiddleware pubSubM, Device deviceInfo) {   
		
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
    		  postInitialize();
    } 
	
	protected void postInitialize() {
      subscribeRoomAvgTempMeasurement(); 
           
    }
    
		

		    protected  void DisplayTemp(TempStruct arg ) {
		  	    Logger.log( myDeviceInfo.getName() ,"DisplayTempController" , "Sending command DisplayTemp");
		    	this.myPubSubMiddleware.publish("DisplayTemp",  arg   , myDeviceInfo );     
		    }
	
		

		

        
        public void notifyReceived(String eventName, Object arg, Device deviceInfo) { 
        try {	
        

                      if (eventName.equals("roomAvgTempMeasurement"))  
                     { 
                    Logger.log(myDeviceInfo.getName(),"DisplayTempController",
                     "Notification Received roomAvgTempMeasurement");
                   
                    onNewroomAvgTempMeasurement((TempStruct) arg); 
                    
                  //  onNewRoomAvgTempMeasurementReceived((TempStruct) arg);
                 }
                   
          
        
        
        	 } catch (Exception e) {
                 e.printStackTrace();
           }
        }
	  

	    	   
	    	    public abstract void onNewroomAvgTempMeasurement(TempStruct arg);	   		
	    	  
	    	   
	    	   	public void subscribeRoomAvgTempMeasurement() {
	    	   		    
	    	   		
	    					
	    			List<String> regionInfo = new ArrayList<String>(); 
	    			regionInfo.add("*");	
	    				
	    	   		this.myPubSubMiddleware.subscribe(this,"roomAvgTempMeasurement", regionInfo);
	    		}
	    		 	
		
		
		public void run() {	
		}	
        
 
}