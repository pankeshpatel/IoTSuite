package $SensorDriver.deviceImplPackageName$;

import framework.*;
import java.util.Random;
import iotsuite.semanticmodel.Device;



public class JavaSE$SensorDriver.name$ implements I$SensorDriver.name$ {

	private static int  SAMPLE_PERIOD = $SensorDriver.samplePeriod$;
	private static  int SAMPLE_DURATION =$SensorDriver.sampleDuration$;
	private static int  temp=0;

	
	 public JavaSE$SensorDriver.name$(Device deviceInfo) { 

	  } 
	
	
   $SensorDriver.allGeneratedInfo:{ generatedInfo | 
   
   @Override
   public void get$generatedInfo.name; format="avoidCapital"$(Listener$generatedInfo.name$ handler){	   
  
	   while (temp <= SAMPLE_DURATION) {
		   
		   
			    try {
		               handler.onNew$generatedInfo.name$(this.get$generatedInfo.name$());
		               Thread.sleep(SAMPLE_PERIOD);
						temp  = temp  + SAMPLE_PERIOD;
		           } catch (InterruptedException e) {
		               e.printStackTrace();
		               }   
		}
   
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

private $generatedInfo.type$ get$generatedInfo.name; format="avoidCapital"$(){

    int START = 20;
    int END = 40;
    Random random = new Random();
    double tempValue = showRandomInteger(START, END, random);
    return new  $generatedInfo.type$(tempValue, "C");
}
   
      
}; separator="\n"$
  
		@Override
		  public boolean isEventDriven() {
		    return false;
		  }
}
