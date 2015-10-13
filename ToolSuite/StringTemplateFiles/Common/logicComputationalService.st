package $CS.logicPackageName$;
import iotsuite.localmiddleware.PubSubsSensingFramework;
import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.content.Context;
import iotsuite.semanticmodel.*;

import $CS.PackageName$.*;
public class  Logic$CS.name$ extends $CS.name$  {     
    
  //  I$CS.name$ obj$CS.name$;
    //public static PubSubsSensingFramework pubSubSensingFramework;
   public Logic$CS.name$(PubSubMiddleware pubSubM, Device deviceInfo, Object ui,Context myContext) {
    super(pubSubM, deviceInfo);
    
   }   
      $CS.allConsumedInfo:{ consumedInfo |
    //  Listener$consumedInfo.name$ $consumedInfo.name$Event = new Listener$consumedInfo.name$(){
      @Override
      public  void onNew$consumedInfo.name; format="capital"$( $consumedInfo.type$ arg){     
      //TODO : write code here. Saurabh
      }
      //};  
    }; separator="\n"$ 
    
    $CS.allDataAccess:{ dataAccess |     
      public void onNew$dataAccess.dataAccessName; format="capital"$Received( $CS.allGeneratedInfo:{ generatedInfo |$generatedInfo.type$}$ arg)
      {
        //TODO : write code here        
      }     
  }$
}