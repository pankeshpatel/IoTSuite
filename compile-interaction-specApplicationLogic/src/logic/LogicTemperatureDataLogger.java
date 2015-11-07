package logic;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.content.Context;
import iotsuite.semanticmodel.*;

import framework.*;
public class  LogicTemperatureDataLogger extends TemperatureDataLogger  {  

   public LogicTemperatureDataLogger(PubSubMiddleware pubSubM, Device deviceInfo, Object ui,Context myContext) {
    super(pubSubM, deviceInfo);
    
   }   

          
            @Override
            public  void onNewtempMeasurement( TempStruct arg){     
            //TODO : write code here. 
            }
            
           
    
}