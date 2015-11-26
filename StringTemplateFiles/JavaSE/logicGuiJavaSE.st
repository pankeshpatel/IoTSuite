package $GUIdriver.logicPackageName$;

import com.google.gson.JsonObject;
import iotsuite.common.GlobalVariable;
import iotsuite.localmiddleware.PubSubsSensingFramework;
import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.app.Activity;
import android.content.Context;
import iotsuite.semanticmodel.*;
import $GUIdriver.PackageName$.*;
import factory.*;
import deviceImpl.*;
  
   
public  class  Logic$GUIdriver.name$ extends $GUIdriver.name$  {  

  I$GUIdriver.name$ obj$GUIdriver.name$;
  Activity ui;
  public Logic$GUIdriver.name$ obj=this;
   public String deviceType;
   JavaSE$GUIdriver.name$ objJavaSE$GUIdriver.name$ = null;
     public static PubSubsSensingFramework pubSubSensingFramework;
   
  

  public Logic$GUIdriver.name$(PubSubMiddleware myPubSubMiddleware, final Device deviceInfo, final Object ui, Context myContext) {
    super(myPubSubMiddleware, deviceInfo);
     deviceType = deviceInfo.getType();
     pubSubSensingFramework = PubSubsSensingFramework.getInstance();
    
     if (deviceType.equals(GlobalVariable.deviceJAVASEType)) {
     
        obj$GUIdriver.name$ = $GUIdriver.name$Factory.get$GUIdriver.name$Driver(deviceInfo.getType(),(Activity) ui,obj);
      $GUIdriver.commands:{ command |
       obj$GUIdriver.name$.$command.name; format="capital"$GUI(handlerCommand);    

      }; separator="\n"$
      
      $GUIdriver.allDataAccess:{ dataAccess |
             obj$GUIdriver.name$.$dataAccess.dataAccessName; format="capital"$GUI(handlerCommand); 
    }$      
    
    }
    
  
    

}
  
  Listener$GUIdriver.name$  handlerCommand =  new  Listener$GUIdriver.name$() {
  $GUIdriver.commands:{ command |
   @Override
    public void onNew$command.name; format="capital"$Command($command.allParameter:{ param | $param.type$ newValue}; separator=" , "$) {
      $command.name; format="capital"$FromGUI($command.allParameter:{ param | newValue}; separator=" , "$);
    }     
  };separator="\n"$
  
  $GUIdriver.allDataAccess:{ dataAccess |
         @Override
         public void onNew$dataAccess.dataAccessName; format="capital"$Request(String request) {
             $dataAccess.dataAccessName; format="capital"$Request(request);
         }    
    }$
  
  
  

  };
  
   $GUIdriver.allDataAccess:{ dataAccess |
     public void onNew$dataAccess.dataAccessName; format="capital"$Response($GUIdriver.AllDataAccess:{ dataAcc |$dataAcc.GeneratedInfo.type$}$ arg){
          //  objJavaSE$GUIdriver.name$.$dataAccess.dataAccessName; format="capital"$ResponseReceived(arg);
          // wrap the data in to Json Object
         JsonObject obj$dataAccess.dataAccessName; format="capital"$ = new JsonObject();
          $GUIdriver.allStructFields:{field | 
               obj$dataAccess.dataAccessName; format="capital"$.addProperty("$field.name$",arg.get$field.name$());}$
               
         pubSubSensingFramework.publish("$dataAccess.dataAccessName; format="avoidCapital"$Response", obj$dataAccess.dataAccessName; format="capital"$);
    
    }  }$
    
     $GUIdriver.allNotifyMeasurement:{notifyMeasurement | 
     
     public  void onNew$notifyMeasurement; format="capital"$Notify($GUIdriver.AllNotifyStructName:{ notifyStructName |$notifyStructName$}$ arg){
     //wrap the data in to Json Object
     
     JsonObject obj$notifyMeasurement; format="capital"$ = new JsonObject();
      $GUIdriver.AllStructFieldsForNotify:{fieldsForNotify | 
      obj$notifyMeasurement; format="capital"$.addProperty("$fieldsForNotify.name$",arg.get$fieldsForNotify.name$());}$
      pubSubSensingFramework.publish("$notifyMeasurement; format="avoidCapital"$Notify", obj$notifyMeasurement; format="capital"$);
     } 
    }$
    
   
}
