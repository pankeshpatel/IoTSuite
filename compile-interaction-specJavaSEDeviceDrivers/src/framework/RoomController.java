package framework;
import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;
import java.util.List;
import java.util.ArrayList;


public abstract class  RoomController implements Subscriber, Runnable{ 
			
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	
	
	public RoomController(PubSubMiddleware pubSubM, Device deviceInfo) {   
		
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
    		  postInitialize();
    } 
	
	protected void postInitialize() {
      subscribeRoomAvgTempMeasurement(); 
          subscribeTempPref(); 
           
    }
    
		

		    protected  void SetTemp(TempStruct arg ) {
		  	    Logger.log( myDeviceInfo.getName() ,"RoomController" , "Sending command SetTemp");
		    	this.myPubSubMiddleware.publish("SetTemp",  arg   , myDeviceInfo );     
		    }


		    protected  void Off() {
		  	    Logger.log( myDeviceInfo.getName() ,"RoomController" , "Sending command Off");
		    	this.myPubSubMiddleware.publish("Off",  null  , myDeviceInfo );     
		    }
	
		

		

        
        public void notifyReceived(String eventName, Object arg, Device deviceInfo) { 
        try {	
        

                      if (eventName.equals("roomAvgTempMeasurement"))  
                     { 
                    Logger.log(myDeviceInfo.getName(),"RoomController",
                     "Notification Received roomAvgTempMeasurement");
                   
                    onNewroomAvgTempMeasurement((TempStruct) arg); 
                    
                  //  onNewRoomAvgTempMeasurementReceived((TempStructTempStruct) arg);
                 }
                 
                      if (eventName.equals("tempPref"))  
                     { 
                    Logger.log(myDeviceInfo.getName(),"RoomController",
                     "Notification Received tempPref");
                   
                    onNewtempPref((TempStruct) arg); 
                    
                  //  onNewTempPrefReceived((TempStructTempStruct) arg);
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
	    		
	    	   
	    	    public abstract void onNewtempPref(TempStruct arg);	   		
	    	  
	    	   
	    	   	public void subscribeTempPref() {
	    	   		    
	    	   		
	    					
	    			List<String> regionInfo = new ArrayList<String>(); 
	    			regionInfo.add("*");	
	    				
	    	   		this.myPubSubMiddleware.subscribe(this,"tempPref", regionInfo);
	    		}
	    		 	
		
		
		public void run() {	
		}	
        
 
}