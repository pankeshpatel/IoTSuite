package $SensorDriver.deviceImplPackageName$;

import framework.*;
import logic.*;
import android.content.Context;
import android.content.Intent;
import com.google.gson.JsonObject;
import iotsuite.android.sensingmiddleware.ISensorListener;
import iotsuite.android.sensingmiddleware.PubSubsSensingFramework;
import iotsuite.android.extended.sensingframework.*;



public class Android$SensorDriver.name$ implements I$SensorDriver.name$, 
$SensorDriver.name$Keys, ISensorListener  {
	
	private PubSubsSensingFramework pubSubSensingFramework = null;
	
	 $SensorDriver.ConsumeInfoFieldsForSensor:{ consumeInfoFieldsForSensor |
          
            $consumeInfoFieldsForSensor.consumeInfoStructFieldType$ $consumeInfoFieldsForSensor.consumeInfoStructField$ ;
          
          }; separator="\n"$ 
  
	$SensorDriver.allGeneratedInfo:{ generatedInfo | 
		   	   
      private static boolean $generatedInfo.name; format="avoidCapital"$Condition= false;
	};separator="\n"$
	private static JsonObject $SensorDriver.name$Data = new JsonObject();
	
	
	
	 $SensorDriver.allGeneratedInfo:{ generatedInfo | 
		   	   
      private Listener$generatedInfo.name; format="avoidCapital"$ listener$generatedInfo.name; format="avoidCapital"$ = null;
	};separator="\n"$
    
  
   public Android$SensorDriver.name$(Context context, Logic$SensorDriver.name$ obj) {
	   
	   // Register the client
		pubSubSensingFramework = PubSubsSensingFramework.getInstance();
		
		  $SensorDriver.allGeneratedInfo:{ generatedInfo |
         
         
         pubSubSensingFramework.registerForSensorData(this, $generatedInfo.name; format="capital"$Event);
         
         }; separator="\n"$ 
      
		
		
		
		// Start the service
		Intent intent = new Intent(context, $SensorDriver.name$SensorProbe.class);
		context.startService(intent);

	
	}
  
   $SensorDriver.allGeneratedInfo:{ generatedInfo | 
   
   /*@Override
   public  $generatedInfo.type$ get$generatedInfo.name; format="avoidCapital"$(){
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
    	
    		$SensorDriver.name$Data = dataEvent;
    		 $SensorDriver.allGeneratedInfo:{ generatedInfo |
    		 
    		   		 
    		 
    		 if (eventName.equals("$generatedInfo.name$Event")) {
          listener$generatedInfo.name$.onNew$generatedInfo.name$(new $generatedInfo.type$( $SensorDriver.ConsumeInfoFieldsForSensor:{ consumeInfoFieldsForSensor |
            $consumeInfoFieldsForSensor.consumeInfoStructField$};separator="," $));
    }
    		 
    		 }; separator="\n"$ 
    	
    }




}
