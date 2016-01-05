package $SensorDriver.deviceImplPackageName$;

import framework.*;
import logic.*;
import android.content.Context;
import android.content.Intent;
import iotsuite.android.sensingframework.*;
import iotsuite.android.sensingframework.ProbeKeys.TemperatureSensorKeys;
import iotsuite.android.extended.sensingframework.*;
import com.google.gson.JsonObject;
import iotsuite.android.sensingmiddleware.ISensorListener;
import iotsuite.android.sensingmiddleware.PubSubsSensingFramework;
import java.util.Random;


public class Android$SensorDriver.name$ implements I$SensorDriver.name$, 
$SensorDriver.name$Keys, ISensorListener  {
	
	private PubSubsSensingFramework pubSubSensingFramework = null;
	//TODO : Device developer will configure values  here.
	private static int  SAMPLE_PERIOD =$SensorDriver.samplePeriod$;
	private static  int SAMPLE_DURATION = $SensorDriver.sampleDuration$;
	private static int  duration=0;
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
   
        
   @Override
   public void get$generatedInfo.name; format="avoidCapital"$(Listener$generatedInfo.name$ handler){
	   //listener$generatedInfo.name$ = handler;
	    while (duration <= SAMPLE_DURATION) {
              try {
                  handler.onNew$generatedInfo.name; format="avoidCapital"$(this.get$generatedInfo.name; format="avoidCapital"$());
                  Thread.sleep(SAMPLE_PERIOD);
   				duration  = duration  + SAMPLE_PERIOD;
              } catch (InterruptedException e) {
                  e.printStackTrace();
                  // continueFlag = false;
              } 
          }
   }   
      
}; separator="\n"$
  
  @Override
  public boolean isEventDriven() {
    return false;
  }

    @Override
    public void onDataReceived(String eventName, JsonObject dataEvent) {
    	
        	$SensorDriver.name$Data = dataEvent;
    }
    
     private static double showRandomInteger(int aStart, int aEnd, Random aRandom) {
        if (aStart > aEnd) {
            throw new IllegalArgumentException("Start cannot exceed End.");
        }
        double range = (double) aEnd - (double) aStart + 1;
        double fraction = (long) (range * aRandom.nextDouble());
        double randomNumber = (double) (fraction + aStart);
        return randomNumber;
    }
 $SensorDriver.allGeneratedInfo:{ generatedInfo | 
    private $generatedInfo.type$ get$generatedInfo.name; format="avoidCapital"$() {

        int START = 20;
        int END = 40;
        Random random = new Random();
        double tempValue = showRandomInteger(START, END, random);
        return new $generatedInfo.type$(tempValue, "C");
    }
    }; separator="\n"$

}
