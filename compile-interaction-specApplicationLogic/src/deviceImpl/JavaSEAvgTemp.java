package deviceImpl;

import framework.*;
import iotsuite.computational.factory.ComputationalFactory;
import iotsuite.localmiddleware.IDataListener;
import iotsuite.localmiddleware.PubSubsSensingFramework;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.JsonObject;


public class JavaSEAvgTemp implements IAvgTemp, IDataListener{ 
 
   
  static double tempValue;
   
    
  static String unitOfMeasurement;
   
    
  static double tempValue;
   
    

      public  ListenertempMeasurement listenertempMeasurement = null ;
        
  private PubSubsSensingFramework pubSubSensingFramework = null;

 public JavaSEAvgTemp() {
    pubSubSensingFramework = PubSubsSensingFramework.getInstance();
    pubSubSensingFramework.registerForSensorData(this,"AVG-RESULT");  
    ComputationalFactory.initializeCompuatioanlComponent("AVG-CALCULATE");    
  }  
  

       @Override
         public  void gettempMeasurement( ListenertempMeasurement handler){     
         this.listenertempMeasurement = handler;
          }   
    
 
  @Override
      
       public void onDataReceived(String eventName, JsonObject data) {
    
         

                if(eventName.equals("AVG-RESULT"))
                {
                  
                    
                              tempValue=data.get("tempValue").getAsDouble() ; 
                              
                              unitOfMeasurement=data.get("unitOfMeasurement").getAsString() ; 
                              
                              tempValue=data.get("tempValue").getAsDouble() ; 
                             
               listenertempMeasurement.onNewtempMeasurement(new TempStruct(tempValue ,unitOfMeasurement ,tempValue ));
                  } 
                    
              
  
      }
 }