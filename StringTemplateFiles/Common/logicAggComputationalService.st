package $CS.logicPackageName$;
import iotsuite.localmiddleware.PubSubsSensingFramework;
import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.content.Context;
import iotsuite.semanticmodel.*;
import factory.*;  
import com.google.gson.JsonObject;
import $CS.PackageName$.*;

public class  Logic$CS.name$ extends $CS.name$  {     
    
    public static int sampleValue=$CS.sampleValue$;
    I$CS.name$ obj$CS.name$;
    public static PubSubsSensingFramework pubSubSensingFramework;
   public Logic$CS.name$(PubSubMiddleware pubSubM, Device deviceInfo, Object ui,Context myContext) {
    super(pubSubM, deviceInfo);
    
      pubSubSensingFramework = PubSubsSensingFramework.getInstance();
      obj$CS.name$ = $CS.name$Factory.get$CS.name$(
        deviceInfo.getType(), null, null);
          $CS.allConsumedInfo:{ consumedInfo |
    obj$CS.name$.get$consumedInfo.name$($consumedInfo.name$Event);    
      }; separator="\n"$ 
  } 
  
 
   
        $CS.allConsumedInfo:{ consumedInfo |
     Listener$consumedInfo.name$ $consumedInfo.name$Event = new Listener$consumedInfo.name$(){
    @Override
      public  void onNew$consumedInfo.name; format="avoidCapital"$( $consumedInfo.type$ arg){     
      $CS.allGeneratedInfo:{ generatedInfo |set$generatedInfo.name$(arg);}; separator="\n"$ 
     }       
     };        
    }; separator="\n"$
    
     $CS.allConsumedInfo:{ consumedInfo |
     @Override
    public void onNew$consumedInfo.name$( $consumedInfo.type$ arg)
    {

            JsonObject obj = new JsonObject();
             $CS.allStructFields:{field | 
               obj.addProperty("$field.name$",arg.get$field.name$());}$
              obj.addProperty("sampleValue",$CS.sampleValue$);
      
           
     pubSubSensingFramework.publish("$CS.operation$-REQUEST", obj);
    }
    
     }; separator="\n"$ 
    
    $CS.allDataAccess:{ dataAccess |     
      public void onNew$dataAccess.dataAccessName; format="capital"$Received( $CS.allGeneratedInfo:{ generatedInfo |$generatedInfo.type$}$ arg)
      {     
        
      }     
  }$
    
}