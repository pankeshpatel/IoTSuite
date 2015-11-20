package $CS.logicPackageName$;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.content.Context;
import iotsuite.semanticmodel.*;

import $CS.PackageName$.*;
public class  Logic$CS.name$ extends $CS.name$  {  

   public Logic$CS.name$(PubSubMiddleware pubSubM, Device deviceInfo, Object ui,Context myContext) {
    super(pubSubM, deviceInfo);
    
   }   
      $CS.allConsumedInfo:{ consumedInfo |
    
      @Override
      public  void onNew$consumedInfo.name$( $consumedInfo.type$ arg){     
      //TODO : write code here. 
      }
      
    }; separator="\n"$ 
    
    $CS.allDataAccess:{ dataAccess |     
      public void onNew$dataAccess.dataAccessName; format="avoidCapital"$Received( $CS.allGeneratedInfo:{ generatedInfo |$generatedInfo.type$}$ arg)
      {
        //TODO : write code here        
      }     
  }$
}