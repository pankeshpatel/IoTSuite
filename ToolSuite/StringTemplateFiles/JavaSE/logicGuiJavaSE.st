package $GUIdriver.logicPackageName$;

import iotsuite.common.GlobalVariable;
import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.app.Activity;
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
	 
	

	public Logic$GUIdriver.name$(PubSubMiddleware myPubSubMiddleware, final Device deviceInfo, final Object ui) {
		super(myPubSubMiddleware, deviceInfo);
		 deviceType = deviceInfo.getType();
		
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
            objJavaSE$GUIdriver.name$.$dataAccess.dataAccessName; format="capital"$ResponseReceived(arg);
    
    
    }  }$
}
