package framework;
import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;

public abstract class  BadgeReader implements Runnable { 
   
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	public BadgeReader(PubSubMiddleware pubSubM,  Device deviceInfo) {      
	  this.myPubSubMiddleware = pubSubM;
	  this.myDeviceInfo = deviceInfo;	  
    } 	
	
	private BadgeStruct badgeDetected;	
			
	    protected void setBadgeDetected( BadgeStruct newValue) {
	      if (badgeDetected != newValue) {
	        badgeDetected = newValue; 
	       
	        Logger.log(myDeviceInfo.getName(), "BadgeReader",
					"Publishing badgeDetected");   
	        
	        this.myPubSubMiddleware.publish("badgeDetected", newValue, myDeviceInfo);
			}
	    } 
	    /*   
	    public  BadgeStruct getBadgeDetected() {
	      return  badgeDetected;
	    }*/  

	private BadgeStruct badgeDisappeared;	
			
	    protected void setBadgeDisappeared( BadgeStruct newValue) {
	      if (badgeDisappeared != newValue) {
	        badgeDisappeared = newValue; 
	       
	        Logger.log(myDeviceInfo.getName(), "BadgeReader",
					"Publishing badgeDisappeared");   
	        
	        this.myPubSubMiddleware.publish("badgeDisappeared", newValue, myDeviceInfo);
			}
	    } 
	    /*   
	    public  BadgeStruct getBadgeDisappeared() {
	      return  badgeDisappeared;
	    }*/  

 
		
		public void run() {
		
	}
		
            
}