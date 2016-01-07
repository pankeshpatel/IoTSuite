package $GUIdriver.logicPackageName$;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import iotsuite.android.localmiddleware.PubSubsSensingFramework;
import android.app.Activity;
import iotsuite.semanticmodel.*;
import $GUIdriver.PackageName$.*;
import android.content.Context;
import factory.*;
import deviceImpl.Android$GUIdriver.name$;
  
   
public  class  Logic$GUIdriver.name$ extends $GUIdriver.name$  {	

	I$GUIdriver.name$ obj$GUIdriver.name$;
	Activity ui;
	public Logic$GUIdriver.name$ obj=this;
	 public String deviceType;
	 public static PubSubsSensingFramework pubSubSensingFramework;
	 
	

	public Logic$GUIdriver.name$(PubSubMiddleware myPubSubMiddleware, final Device deviceInfo, final Object ui, Context myContext) {
		super(myPubSubMiddleware, deviceInfo);
		
		 deviceType = deviceInfo.getType();
		 
		 
   pubSubSensingFramework = PubSubsSensingFramework.getInstance();
   //Intent intent = new Intent(myContext, Android$GUIdriver.name$.class);
   //myContext.startActivity(intent);
		 
	
		
		this.ui = (Activity) ui;
		this.ui.runOnUiThread(new Runnable() {
			public void run() {
			obj$GUIdriver.name$ = $GUIdriver.name$Factory.get$GUIdriver.name$Driver(deviceInfo.getType(),(Activity) ui,obj);
		  $GUIdriver.commands:{ command |
			 obj$GUIdriver.name$.$command.name; format="capital"$GUI(handlerCommand);
			 }; separator="\n"$
			 
			  
      $GUIdriver.allDataAccess:{ dataAccess |
             obj$GUIdriver.name$.$dataAccess.dataAccessName; format="capital"$GUI(handlerCommand); 
    }$ 
    
     
	}
	});	

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
        pubSubSensingFramework.publish("$dataAccess.dataAccessName$Response", arg);     
    }
    }$    
    
    $GUIdriver.allNotifyMeasurement:{notifyMeasurement | 
     
     public  void onNew$notifyMeasurement; format="capital"$Notify($GUIdriver.AllNotifyStructName:{ notifyStructName |$notifyStructName$}$ arg){
      pubSubSensingFramework.publish("$notifyMeasurement; format="avoidCapital"$Notify", arg);    
     }
    }$
    
    @Override
	public void notifyReceived(String eventName, Object arg) {
		// TODO Auto-generated method stub
		
	}
    
    
    
    
        
    
}
