package deviceImpl;

import framework.*;
import iotsuite.computational.factory.ComputationalFactory;
import iotsuite.localmiddleware.IDataListener;
import iotsuite.localmiddleware.PubSubsSensingFramework;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.JsonObject;


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
      
       public void onDataReceived(String eventName, JsonObject data) {
    
         
        $CS.allConsumedInfo:{ consumedInfo |
        if(eventName.equals("AVG-RESULT"))
        {
          
           $CS.allStructFields:{field |  
           $field.name$=data.get("$field.name$").getAs$field.type ; format="capital"$() ; 
          }$
       listener$consumedInfo.name$.onNew$consumedInfo.name$(new $consumedInfo.type$($CS.allStructFields:{field|$field.name$ }; separator=","$));
          } 
            
      }; separator="\n"$
  
      }
 }
