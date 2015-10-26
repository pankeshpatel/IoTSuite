package $GUIdriver.deviceImplPackageName$;

import logic.*;
import framework.*;
import android.content.Context;
import android.app.Activity;
import iotsuite.android.localmiddleware.IDataListener;
import iotsuite.android.localmiddleware.PubSubsSensingFramework;



public class Android$GUIdriver.name$ implements I$GUIdriver.name$, IDataListener {

	$GUIdriver.commands:{ command |
		  private Listener$GUIdriver.name$  listener$command.name$Command = null;    
 
  }; separator="\n"$

    $GUIdriver.allDataAccess:{ dataAccess |
          private Listener$GUIdriver.name$  listener$dataAccess.dataAccessName; format="capital"$Request = null;   
    }$
    
     public static PubSubsSensingFramework pubSubSensingFramework;
   private Context appContext;
   public static Activity appActivity;
 
	public Android$GUIdriver.name$(Context context, Logic$GUIdriver.name$ obj) {
	
	  this.appContext = context;
    appActivity = (Activity) appContext;
	 pubSubSensingFramework = PubSubsSensingFramework.getInstance();
	 
	  $GUIdriver.allDataAccess:{ dataAccess |
      pubSubSensingFramework.registerForSensorData(this, "$dataAccess.dataAccessName; format="avoidCapital"$Response");
    }$
    
     $GUIdriver.allNotifyMeasurement:{notifyMeasurement | 
         pubSubSensingFramework.registerForSensorData(this, "$notifyMeasurement; format="avoidCapital"$Notify");  
      }$ 
    
 
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
    
    @Override
    public void onDataReceived(String eventName, Object data) {
    // TODO : Developer will write Device Driver code.
    // This method will get data from Logic method
    
          $GUIdriver.allDataAccess:{ dataAccess |
          if(eventName.equals("$dataAccess.dataAccessName; format="avoidCapital"$Response")){
          
            }
            }$
            
            
     $GUIdriver.allNotifyMeasurement:{notifyMeasurement | 
            if(eventName.equals("$notifyMeasurement; format="avoidCapital"$Notify")){
            
            }
            }$ 
    }  
}