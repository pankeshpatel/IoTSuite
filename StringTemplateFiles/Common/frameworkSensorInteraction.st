package $SensorDriver.packageName$;
import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;
import com.google.gson.Gson;

public abstract class  $SensorDriver.name$ implements Runnable { 
   
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	Gson gson = new Gson();
	public $SensorDriver.name$(PubSubMiddleware pubSubM,  Device deviceInfo) {      
	  this.myPubSubMiddleware = pubSubM;
	  this.myDeviceInfo = deviceInfo;	  
    } 	
	
	$SensorDriver.allGeneratedInfo:{ generatedInfo | private $generatedInfo.type$ $generatedInfo.name; format="avoidCapital"$;	
		
    protected void set$generatedInfo.name; format="capital"$( $generatedInfo.type$ newValue) {
      if ($generatedInfo.name; format="avoidCapital"$ != newValue) {
        $generatedInfo.name; format="avoidCapital"$ = newValue; 
       
        Logger.log(myDeviceInfo.getName(), "$SensorDriver.name$",
				"Publishing $generatedInfo.name$");   
          String data = gson.toJson(newValue);          
        this.myPubSubMiddleware.publish("$generatedInfo.name; format="avoidCapital"$", data);
		}
    } 
    /*   
    public  $generatedInfo.type$ get$generatedInfo.name; format="capital"$() {
      return  $generatedInfo.name; format="avoidCapital"$;
    }*/  
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