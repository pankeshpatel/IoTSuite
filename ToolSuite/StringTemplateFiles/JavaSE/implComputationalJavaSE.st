package deviceImpl;

import framework.*;
import iotsuite.computational.factory.ComputationalFactory;
import iotsuite.localmiddleware.IDataListener;
import iotsuite.localmiddleware.PubSubsSensingFramework;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



public class JavaSE$CS.name$ implements I$CS.name$, IDataListener{ 
 
  $CS.allStructFields:{field |  
static $field.type$ $field.name$;
 
 }$ 
    $CS.allConsumedInfo:{ consumedInfo |
  public  Listener$consumedInfo.name$ listener$consumedInfo.name$ = null ;
   }; separator="\n"$ 
  private PubSubsSensingFramework pubSubSensingFramework = null;

 public JavaSE$CS.name$() {
    pubSubSensingFramework = PubSubsSensingFramework.getInstance();
    pubSubSensingFramework.registerForSensorData(this,"$CS.operation$-RESULT");  
    ComputationalFactory.initializeCompuatioanlComponent("$CS.operation$-CALCULATE");    
  }  
  
   $CS.allConsumedInfo:{ consumedInfo |
    @Override
      public  void get$consumedInfo.name; format="avoidCapital"$( Listener$consumedInfo.name$ handler){     
      this.listener$consumedInfo.name$ = handler;
       }   
 }; separator="\n"$
 
  @Override
      
       public void onDataReceived(String eventName, JSONArray data) {
    
          JSONObject obj = new JSONObject();
        $CS.allConsumedInfo:{ consumedInfo |
        if(eventName.equals("$consumedInfo.name$"))
        {
          try {
           obj=data.getJSONObject(0);
           $CS.allStructFields:{field |  
           $field.name$=($field.type ; format="capital"$) obj.get("$field.name$") ; 
          }$
       
        } catch (JSONException e) {
          System.out.println("Exception is "+ e.getMessage());
             }  
           
              listener$consumedInfo.name$.onNew$consumedInfo.name$(new $consumedInfo.type$($CS.allStructFields:{field|$field.name$ }; separator=","$));
          } 
            
      }; separator="\n"$
  
      }
 }
