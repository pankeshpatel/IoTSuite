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
      //TODO : write code here.
            }
     };        
    }; separator="\n"$
    
     $CS.allConsumedInfo:{ consumedInfo |
     @Override
    public void onNew$consumedInfo.name$( $consumedInfo.type$ arg)
    {
     //Wrapping of data is performed
         JSONObject obj = new JSONObject();
           try {
             $CS.allStructFields:{field | 
               obj.put("$field.name$",arg.get$field.name$());}$
              obj.put("sampleValue",$CS.sampleValue$);
      
      } 
         
      catch (JSONException e) {
       
       System.out.println("Exception is " +e.getMessage());
      }
             JSONArray data = new JSONArray();
             data.put(obj);          
     pubSubSensingFramework.publish("$CS.operation$-REQUEST", data);
    }
    
     }; separator="\n"$ 
    
    $CS.allDataAccess:{ dataAccess |     
      public void onNew$dataAccess.dataAccessName; format="capital"$Received( $CS.allGeneratedInfo:{ generatedInfo |$generatedInfo.type$}$ arg)
      {     
        //TODO : write code here        
      }     
  }$
    
}