package $Actuatordriver.factoryDeviceImplActuator$;

import framework.*;
import iotsuite.java.extended.sensor.factory.SensorFactory;
import iotsuite.localmiddleware.PubSubsSensingFramework;
import com.google.gson.JsonObject;


public class JavaSE$Actuatordriver.name$ implements I$Actuatordriver.name$ {

 private PubSubsSensingFramework pubSubSensingFramework = null;
  
  public JavaSE$Actuatordriver.name$() {
  
    pubSubSensingFramework = PubSubsSensingFramework.getInstance();

     
      SensorFactory.initializeSensingFramework("$Actuatordriver.name$");
  
  }

  $Actuatordriver.allActions:{ action |   
  
  @Override
  public void $action.name$($action.allParameter:{ param | $param.type$ arg }; 
   separator=", "$) {
   
   JsonObject publishData = new JsonObject();
    pubSubSensingFramework.publish("$action.name$",publishData);
   //jlabel1.setText("Heater is $action.name$ "+$Actuatordriver.allFieldName:{ fieldName | arg.get$fieldName$() };separator="+" $);
  
   } 
    
   }; separator="\n"$ 
 
}


