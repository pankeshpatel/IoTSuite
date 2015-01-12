package $SensorDriver.packageName$;
import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;

public abstract class  $SensorDriver.name$ implements Runnable { 
   
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	public $SensorDriver.name$(PubSubMiddleware pubSubM,  Device deviceInfo) {      
	  this.myPubSubMiddleware = pubSubM;
	  this.myDeviceInfo = deviceInfo;	  
    } 	
	
	$SensorDriver.allGeneratedInfo:{ generatedInfo | private $generatedInfo.type.name$ $generatedInfo.name; format="avoidCapital"$;	
		
    protected void set$generatedInfo.name; format="capital"$( $generatedInfo.type.name$ newValue) {
      if ($generatedInfo.name; format="avoidCapital"$ != newValue) {
        $generatedInfo.name; format="avoidCapital"$ = newValue; 
       
        Logger.log(myDeviceInfo.getName(), "$SensorDriver.name$",
				"Publishing $generatedInfo.name$");
      
        
        this.myPubSubMiddleware.publish("$generatedInfo.name; format="capital"$", newValue, myDeviceInfo);
		}
    }    
    public  $generatedInfo.type.name$ get$generatedInfo.name; format="capital"$() {
      return  $generatedInfo.name; format="avoidCapital"$;
    }  
}; separator="\n"$
	 $if(SensorDriver.consumedInfo)$
	      $SensorDriver.allConsumedInfo:{ consumedInfo | protected abstract void $consumedInfo.name$();}; separator="\n"$
    		public final Object commandReceived(String methodName, Object arg) {
    		$SensorDriver.allConsumedInfo:{ consumedInfo |
    		if (methodName.equals("$consumedInfo.name$")) {
		   $consumedInfo.name$(); 
         return null;
      }}; separator=" else "$
} $endif$ 
		
		public void run() {
		
	}
		
            
}