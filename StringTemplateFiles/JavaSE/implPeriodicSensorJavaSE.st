package $SensorDriver.deviceImplPackageName$;

import framework.*;
import com.google.gson.JsonObject;
import iotsuite.java.extended.sensor.factory.SensorFactory;
import iotsuite.localmiddleware.IDataListener;
import iotsuite.localmiddleware.PubSubsSensingFramework;
import iotsuite.semanticmodel.Device;


public class JavaSE$SensorDriver.name$ implements I$SensorDriver.name$,IDataListener {

  private PubSubsSensingFramework pubSubSensingFramework = null;  
	private static int  SAMPLE_PERIOD = $SensorDriver.samplePeriod$;
	private static  int SAMPLE_DURATION =$SensorDriver.sampleDuration$;
	private static int  temp=0;

	  $SensorDriver.allGeneratedInfo:{ generatedInfo | 
	public static Listener$generatedInfo.name$ listener$generatedInfo.name$;
	}; separator="\n"$
	
	
	
	$SensorDriver.ConsumeInfoFieldsForSensor:{ consumeInfoFieldsForSensor |
          
            $consumeInfoFieldsForSensor.consumeInfoStructFieldType$ $consumeInfoFieldsForSensor.consumeInfoStructField$ ;
          
          }; separator="\n"$ 
	
	/*  $SensorDriver.allPeriodicFields:{periodicField | 
  $periodicField.type;format="capital"$ $periodicField.name$;
  }$ */ 

	
	 public JavaSE$SensorDriver.name$(Device deviceInfo) { 

    pubSubSensingFramework = PubSubsSensingFramework.getInstance();
    pubSubSensingFramework.registerForSensorData(this,  "$SensorDriver.name$-Result");
    SensorFactory.initializeSensingFramework("$SensorDriver.name$");
    JsonObject publishData = new JsonObject();
    publishData.addProperty("SAMPLE_PERIOD", SAMPLE_PERIOD);
    publishData.addProperty("SAMPLE_DURATION", SAMPLE_DURATION);
    publishData.addProperty("temp", temp);
    pubSubSensingFramework.publish("$SensorDriver.name$-Parameter", publishData);
	  } 
	
	
   $SensorDriver.allGeneratedInfo:{ generatedInfo | 
   
   @Override
   public void get$generatedInfo.name; format="avoidCapital"$(Listener$generatedInfo.name$ handler){	   
  	
		listener$generatedInfo.name$ = handler;
    pubSubSensingFramework.publish("startPeriodic$SensorDriver.name$Sampling", null);   
   }      
    
}; separator="\n"$
  
		@Override
		  public boolean isEventDriven() {
		    return false;
		  }		  
		  
		  
		  @Override
  public void onDataReceived(String eventName, JsonObject data) {

$SensorDriver.allGeneratedInfo:{ generatedInfo | 
    if (eventName.equals("$SensorDriver.name$-Result")) {
    
    $SensorDriver.ConsumeInfoFieldsForSensor:{ consumeInfoFieldsForSensor |
          
    $consumeInfoFieldsForSensor.consumeInfoStructField$=data.get("$consumeInfoFieldsForSensor.consumeInfoStructField$").getAs$consumeInfoFieldsForSensor.consumeInfoStructFieldType;format="capital"$();
          
          }; separator="\n"$ 
    
    listener$generatedInfo.name$.onNew$generatedInfo.name$(new $generatedInfo.type$(  $SensorDriver.ConsumeInfoFieldsForSensor:{ consumeInfoFieldsForSensor | $consumeInfoFieldsForSensor.consumeInfoStructField$} ;separator=","$ ));   
    
    /* $SensorDriver.allPeriodicFields:{periodicField | 
    $periodicField.name$=data.get("$periodicField.name$").getAs$periodicField.type;format="capital"$();
    }$ 
    
    
       listener$generatedInfo.name$.onNew$generatedInfo.name$(new $generatedInfo.type$( $SensorDriver.allPeriodicFields:{periodicField |$periodicField.name$} ;separator=","$ )); */ 
    

    }
  
   }; separator="\n"$
}

}
