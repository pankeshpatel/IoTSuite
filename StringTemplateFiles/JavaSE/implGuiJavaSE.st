package $GUIdriver.deviceImplPackageName$;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import logic.*;
import framework.*;
import android.content.Context;
import iotsuite.localmiddleware.IDataListener;
import com.google.gson.JsonObject;
import iotsuite.localmiddleware.PubSubsSensingFramework;


public class JavaSE$GUIdriver.name$ implements I$GUIdriver.name$,IDataListener {
 
  public static PubSubsSensingFramework pubSubSensingFramework;
  String request;
   $GUIdriver.allStructFields:{field | 
             $field.type$ $field.name$;               
               }$
  
  $GUIdriver.commands:{ command |
      private Listener$GUIdriver.name$  listener$command.name$Command = null;    
 
  }; separator="\n"$
  
   $GUIdriver.allDataAccess:{ dataAccess |
          private Listener$GUIdriver.name$  listener$dataAccess.dataAccessName; format="capital"$Request = null;
        }$       


  public JavaSE$GUIdriver.name$(Context context, Logic$GUIdriver.name$ obj) { 
   
    
    pubSubSensingFramework = PubSubsSensingFramework.getInstance();
    
     $GUIdriver.allDataAccess:{ dataAccess |
    pubSubSensingFramework.registerForSensorData(this, "$dataAccess.dataAccessName; format="avoidCapital"$Response");
     }; separator="\n"$
     
      $GUIdriver.allNotifyMeasurement:{notifyMeasurement | 
       pubSubSensingFramework.registerForSensorData(this, "$notifyMeasurement; format="avoidCapital"$Notify");
      }; separator="\n"$
  }  

  $GUIdriver.commands:{ command |
  
     @Override
     public void $command.name$GUI(Listener$GUIdriver.name$ handler){
       listener$command.name$Command = handler;
     }
 
  }; separator="\n"$
  
    $GUIdriver.allDataAccess:{ dataAccess |
         @Override
         public void $dataAccess.dataAccessName; format="capital"$GUI(Listener$GUIdriver.name$ handler) {
              listener$dataAccess.dataAccessName; format="capital"$Request = handler; 
         }    
    }$
    
    @SuppressWarnings("unused") 
    @Override
      public void onDataReceived(String eventName, JsonObject data) {
        
          $GUIdriver.allDataAccess:{ dataAccess |
          if(eventName.equals("$dataAccess.dataAccessName; format="avoidCapital"$Response")){
           $GUIdriver.allStructFields:{field | 
            $field.type$ $field.name$=data.get("$field.name$").getAs$field.type;format="capital"$();
            }$
            }
            }$
            
         
            $GUIdriver.allNotifyMeasurement:{notifyMeasurement | 
            if(eventName.equals("$notifyMeasurement; format="avoidCapital"$Notify")){
              $GUIdriver.AllStructFieldsForNotify:{fieldsForNotify | 
            $fieldsForNotify.type$ $fieldsForNotify.name$=data.get("$fieldsForNotify.name$").getAs$fieldsForNotify.type;format="capital"$(); 
            }$            
            }
            }$ 
        
      }  
      
      $GUIdriver.commands:{ command |      
      public void $command.name$CommandInterface(){
      listener$command.name$Command.onNew$command.name$Command($command.allParameter:{ param | new $param.type$( 
      $GUIdriver.allStructFields:{field |$field.name$}; separator=","$)}; separator=" , "$);
      }
       }; separator="\n"$
       
       
       
   $GUIdriver.allDataAccess:{ dataAccess |
      public void $dataAccess.dataAccessName; format="capital"$RequestInterface(){
      listener$dataAccess.dataAccessName; format="capital"$Request.onNew$dataAccess.dataAccessName; format="capital"$Request(request);
      }
       }; separator="\n"$
      
   /*  $GUIdriver.allDataAccess:{ dataAccess |
         public void $dataAccess.dataAccessName; format="capital"$ResponseReceived($GUIdriver.AllDataAccess:{ dataAcc |$dataAcc.GeneratedInfo.type$}$ response){
            }  
    }$ */ 
    
      $GUIdriver.commands:{ command |
     private class  $command.name;format="avoidCapital"$ButtonClickListener implements ActionListener{
     @Override
    public void actionPerformed(ActionEvent arg0) {
      
         $command.name;format="capital"$CommandInterface();
    }
     }
     
     }; separator="\n"$
     
     
     $GUIdriver.allDataAccess:{ dataAccess |
     private class request$dataAccess.dataAccessName;format="capital"$ButtonClickListener implements ActionListener{
     @Override
     public void actionPerformed(ActionEvent arg0){
     $dataAccess.dataAccessName;format="capital"$RequestInterface();
     }
       }
     
      }; separator="\n"$
    
    
            
      
}