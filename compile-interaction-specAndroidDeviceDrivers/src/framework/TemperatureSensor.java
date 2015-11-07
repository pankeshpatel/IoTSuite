package framework;
import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;

public abstract class  TemperatureSensor implements Runnable { 
   
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	public TemperatureSensor(PubSubMiddleware pubSubM,  Device deviceInfo) {      
	  this.myPubSubMiddleware = pubSubM;
	  this.myDeviceInfo = deviceInfo;	  
    } 	
	
	private TempStruct tempMeasurement;	
			
	    protected void setTempMeasurement( TempStruct newValue) {
	      if (tempMeasurement != newValue) {
	        tempMeasurement = newValue; 
	       
	        Logger.log(myDeviceInfo.getName(), "TemperatureSensor",
					"Publishing tempMeasurement");   
	        
	        this.myPubSubMiddleware.publish("tempMeasurement", newValue, myDeviceInfo);
			}
	    } 
	    /*   
	    public  TempStruct getTempMeasurement() {
	      return  tempMeasurement;
	    }*/  

 
		
		public void run() {
		
	}
		
            
}