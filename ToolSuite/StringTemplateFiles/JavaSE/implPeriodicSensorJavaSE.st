package $SensorDriver.deviceImplPackageName$;

import framework.*;
import java.util.Random;




public class JavaSE$SensorDriver.name$ implements I$SensorDriver.name$ {


  //TODO:Device developer will configure following parameters according to requirement
	private static int  SAMPLE_PERIOD = 1000;
	private static  int SAMPLE_DURATION = 10000;
	private static int  temp=0;
	
	
   /*public JavaSE$SensorDriver.name$() { 
  
  
  }*/


  
   $SensorDriver.allGeneratedInfo:{ generatedInfo | 
   
  /* @Override
   public  $generatedInfo.type.name$ get$generatedInfo.name; format="avoidCapital"$(){
		   return null;
   }*/
      
   @Override
   public void get$generatedInfo.name; format="avoidCapital"$(Listener$generatedInfo.name$ handler){
	   
	   
	   while (temp <= SAMPLE_DURATION) {
           try {
               handler.onNewtempMeasurement(this.gettempMeasurement());
               Thread.sleep(SAMPLE_PERIOD);
				temp  = temp  + SAMPLE_PERIOD;
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
