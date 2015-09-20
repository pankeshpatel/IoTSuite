package $CS.logicPackageName$;
import iotsuite.localmiddleware.PubSubsSensingFramework;
import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.content.Context;
import iotsuite.semanticmodel.*;
import factory.*;  
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import $CS.PackageName$.*;

public class  Logic$CS.name$ extends $CS.name$  {     
    
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
      public  void onNew$consumedInfo.name; format="capital"$( $consumedInfo.type.name$ arg){     
      //TODO : write code here.
            }
     };        
    }; separator="\n"$
    
     $CS.allConsumedInfo:{ consumedInfo |
     @Override
    public void onNew$consumedInfo.name; format="capital"$( $consumedInfo.type.name$ arg)
    {
     //Wrapping of data is performed
         JSONObject obj = new JSONObject();
           try {
             $CS.allStructFields:{field | 
      obj.put("$field.name$",arg.get$field.name$());
       }$
        //obj.put("value",arg.gettempValue());
        //obj.put("getunitOfMeasurement", arg.getunitOfMeasurement());
      } 
         
      catch (JSONException e) {
        // TODO Auto-generated catch block
       System.out.println("Exception is " +e.getMessage());
      }
             JSONArray data = new JSONArray();
             data.put(obj);          
     pubSubSensingFramework.publish("$CS.operation$-REQUEST", data);
    }
    
     }; separator="\n"$ 
    
    $CS.allDataAccess:{ dataAccess |     
      public void onNew$dataAccess.dataAccessName; format="capital"$Received( $CS.allGeneratedInfo:{ generatedInfo |$generatedInfo.type.name$}$ arg)
      {     
        //TODO : write code here        
      }     
  }$
    
}