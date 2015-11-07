package deviceImpl;

import framework.*;
import java.util.Random;


public class JavaSETemperatureSensor implements ITemperatureSensor {

	private static int  SAMPLE_PERIOD = 1000;
	private static  int SAMPLE_DURATION =6000000;
	private static int  temp=0;
	

      
      @Override
      public void gettempMeasurement(ListenertempMeasurement handler){	   
     
   	   while (temp <= SAMPLE_DURATION) {
              try {
                  handler.onNewtempMeasurement(this.gettempMeasurement());
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

   private TempStruct gettempMeasurement(){

       int START = 20;
       int END = 40;
       Random random = new Random();
       double tempValue = showRandomInteger(START, END, random);
       return new  TempStruct(tempValue, "C");
   }
      
         

  
		@Override
		  public boolean isEventDriven() {
		    return false;
		  }
}