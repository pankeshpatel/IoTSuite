package logic;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.content.Context;
import iotsuite.semanticmodel.*;

import framework.*;
public class  LogicProximity extends Proximity  {  

   public LogicProximity(PubSubMiddleware pubSubM, Device deviceInfo, Object ui,Context myContext) {
    super(pubSubM, deviceInfo);
    
   }   

          
            @Override
            public  void onNewbadgeDisappeared( BadgeStruct arg){     
            //TODO : write code here. 
            }
            
          

          
            @Override
            public  void onNewbadgeDetected( BadgeStruct arg){     
            //TODO : write code here. 
            }
            
           
    
        
          public void onNewprofileReceived( TempStruct arg)
          {
            //TODO : write code here        
          }     
      
}