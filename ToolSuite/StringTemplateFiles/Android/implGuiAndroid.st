package $GUIdriver.deviceImplPackageName$;

import logic.*;
import framework.*;
import android.content.Context;
import iotsuite.android.localmiddleware.IDataListener;
import iotsuite.android.localmiddleware.PubSubsSensingFramework;



public class Android$GUIdriver.name$ implements I$GUIdriver.name$, IDataListener {


	
	$GUIdriver.commands:{ command |
		  private Listener$GUIdriver.name$  listener$command.name$Command = null;    
 
  }; separator="\n"$
  
  public static PubSubsSensingFramework pubSubSensingFramework;
  
   $GUIdriver.allDataAccess:{ dataAccess |
          private Listener$GUIdriver.name$  listener$dataAccess.dataAccessName; format="capital"$Request = null;   
    }$
    
    
    
   /*  $GUIdriver.allGeneratedInfoType:{ generatedInfoType |
     private Listener$GUIdriver.name$  listener$generatedInfoType; format="capital"$Response=null;
    }; separator="\n"$ */
  
 

	public Android$GUIdriver.name$(Context context, Logic$GUIdriver.name$ obj) {
	
	 pubSubSensingFramework = PubSubsSensingFramework.getInstance();
	 
	  $GUIdriver.allDataAccess:{ dataAccess |
      pubSubSensingFramework.registerForSensorData(this, "$dataAccess.dataAccessName; format="avoidCapital"$");
    }$
    
   // $GUIdriver.allGeneratedInfoType:{ generatedInfoType |
    // pubSubSensingFramework.registerForSensorData(this, "$generatedInfoType; format="avoidCapital"$");
    //}$
    
     
		
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
    
    // $GUIdriver.allGeneratedInfoType:{ generatedInfoType |
    //  @Override
    //  public void $generatedInfoType; format="capital"$GUI(Listener$GUIdriver.name$ handler) {
    //  listener$generatedInfoType; format="capital"$Response = handler; 
   //    }
   // }$
    
    public void onDataReceived(String eventName, Object data) {
    // TODO : Developer will write Device Driver code.
    // This method will get data from Logic method
  }
  
  
   
    
       
    
}