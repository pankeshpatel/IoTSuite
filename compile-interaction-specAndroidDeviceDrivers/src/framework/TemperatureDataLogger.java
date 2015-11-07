package framework;
import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;
import java.util.List;
import java.util.ArrayList;


public abstract class  TemperatureDataLogger implements Subscriber, Runnable{ 
			
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	
	
	public TemperatureDataLogger(PubSubMiddleware pubSubM, Device deviceInfo) {   
		
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
    		  postInitialize();
    } 
	
	protected void postInitialize() {
      subscribeTempMeasurement(); 
           
    }
    
		

		    protected  void InsertProfileData(ProfileStruct arg ) {
		  	    Logger.log( myDeviceInfo.getName() ,"TemperatureDataLogger" , "Sending command InsertProfileData");
		    	this.myPubSubMiddleware.publish("InsertProfileData",  arg   , myDeviceInfo );     
		    }
	
		

		

        
        public void notifyReceived(String eventName, Object arg, Device deviceInfo) { 
        try {	
        

                      if (eventName.equals("tempMeasurement"))  
                     { 
                    Logger.log(myDeviceInfo.getName(),"TemperatureDataLogger",
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