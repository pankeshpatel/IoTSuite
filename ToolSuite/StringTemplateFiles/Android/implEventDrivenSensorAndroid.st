package $SensorDriver.deviceImplPackageName$;

import framework.*;
import logic.*;
import android.content.Context;
import android.content.Intent;
import iotsuite.android.sensingframework.*;
import com.google.gson.JsonObject;
import iotsuite.android.sensingframework.ProbeKeys.*;
import iotsuite.android.sensingmiddleware.ISensorListener;
import iotsuite.android.sensingmiddleware.PubSubsSensingFramework;


public class Android$SensorDriver.name$ implements I$SensorDriver.name$, 
$SensorDriver.name$Keys, ISensorListener  {
	
	private PubSubsSensingFramework pubSubSensingFramework = null;
	private static boolean proximityCondition=true;
	private static JsonObject $SensorDriver.name$Data = new JsonObject();
	
	
	
	 $SensorDriver.allGeneratedInfo:{ generatedInfo | 
		   	   
      private Listener$generatedInfo.name; format="avoidCapital"$ listener$generatedInfo.name; format="avoidCapital"$ = null;
	};separator="\n"$
    
  
   public Android$SensorDriver.name$(Context context, Logic$SensorDriver.name$ obj) {
	   
	   // Register the client
		pubSubSensingFramework = PubSubsSensingFramework.getInstance();
		pubSubSensingFramework.registerForSensorData(this, $SensorDriver.name$Event);
		
		// Start the service
		Intent intent = new Intent(context, $SensorDriver.name$Probe.class);
		context.startService(intent);

	
	}
  
   $SensorDriver.allGeneratedInfo:{ generatedInfo | 
   
   /*@Override
   public  $generatedInfo.type.name$ get$generatedInfo.name; format="avoidCapital"$(){
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
   public void get$generatedInfo.name; format="avoidCapital"$(Listener$generatedInfo.name$ handler){
	   listener$generatedInfo.name$ = handler;
   }   
      
}; separator="\n"$
  
  @Override
  public boolean isEventDriven() {
    return true;
  }

    @Override
    public void onDataReceived(String eventName, JsonObject dataEvent) {
    	
    	//TODO: Device Developer writes code here.
    	// Sample code for reference.
		//listener.onNewtempMeasurement(new TempStruct(Double.parseDouble(dataEvent.get(DISTANCE).toString()), "C"));
		$SensorDriver.name$Data = dataEvent;
    	proximityCondition=(Double.parseDouble(dataEvent.get(DISTANCE).toString()) >1);
    	System.out.println("Proximity Condition"+proximityCondition);
    	if(proximityCondition)
    	{
    		listenerproximityMeasurement.onNewproximityMeasurement(new Proximitystruct(Double.parseDouble(dataEvent.get(DISTANCE).toString())));
    	}
    	else{
    		System.out.println("Dont Send data");
    	}
    	
    }




}
