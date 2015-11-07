package logic;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.content.Context;
import iotsuite.semanticmodel.*;

import framework.*;
public class  LogicDisplayTempController extends DisplayTempController  {  

   public LogicDisplayTempController(PubSubMiddleware pubSubM, Device deviceInfo, Object ui,Context myContext) {
    super(pubSubM, deviceInfo);
    
   }   

          
            @Override
            public  void onNewroomAvgTempMeasurement( TempStruct arg){     
            //TODO : write code here. 
            }
            
           
    
}