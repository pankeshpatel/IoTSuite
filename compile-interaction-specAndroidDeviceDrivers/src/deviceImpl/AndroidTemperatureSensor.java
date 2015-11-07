package deviceImpl;

import framework.*;
import logic.*;
import android.content.Context;
import android.content.Intent;
import iotsuite.android.sensingframework.*;
import com.google.gson.JsonObject;
import iotsuite.android.sensingframework.ProbeKeys.*;
import iotsuite.android.sensingmiddleware.ISensorListener;
import iotsuite.android.sensingmiddleware.PubSubsSensingFramework;
import java.util.Random;


public class AndroidTemperatureSensor implements ITemperatureSensor, 
TemperatureSensorKeys, ISensorListener  {
	
	private PubSubsSensingFramework pubSubSensingFramework = null;
	//TODO : Device developer will configure values  here.
	private static int  SAMPLE_PERIOD =1000;
	private static  int SAMPLE_DURATION = 6000000;
	private static int  duration=0;
	private static JsonObject TemperatureSensorData = new JsonObject();
	
	
	

	 		   	   
	       private ListenertempMeasurement listenertempMeasurement = null;
	 	
    
  
   public AndroidTemperatureSensor(Context context, LogicTemperatureSensor obj) {
	   
	   // Register the client
		pubSubSensingFramework = PubSubsSensingFramework.getInstance();
		pubSubSensingFramework.registerForSensorData(this, TemperatureSensorEvent);
		
		// Start the service
		Intent intent = new Intent(context, TemperatureSensorProbe.class);
		context.startService(intent);

	
	}
  

      
           
      @Override
      public void gettempMeasurement(ListenertempMeasurement handler){
   	   //listenertempMeasurement = handler;
   	    while (duration <= SAMPLE_DURATION) {
                 try {
                     handler.onNewtempMeasurement(this.gettempMeasurement());
                     Thread.sleep(SAMPLE_PERIOD);
      				duration  = duration  + SAMPLE_PERIOD;
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                     // continueFlag = false;
                 } 
             }
      }   
         

  
  @Override
  public boolean isEventDriven() {
    return false;
  }

    @Override
    public void onDataReceived(String eventName, JsonObject dataEvent) {
    	
        	TemperatureSensorData = dataEvent;
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

    private TempStruct gettempMeasurement() {

        int START = 20;
        int END = 40;
        Random random = new Random();
        double tempValue = showRandomInteger(START, END, random);
        return new TempStruct(tempValue, "C");
    }

}