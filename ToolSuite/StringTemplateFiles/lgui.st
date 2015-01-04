package $GUIdriver.logicPackageName$;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.app.Activity;
import android.app.Dialog;
import iotsuite.semanticmodel.*;
import $GUIdriver.PackageName$.*;
import factory.*;
  
   
public  class  Logic$GUIdriver.name$ extends $GUIdriver.name$  {	

	I$GUIdriver.name$ obj$GUIdriver.name$;
	Activity ui;
	public Logic$GUIdriver.name$ obj=this;

	public Logic$GUIdriver.name$(PubSubMiddleware myPubSubMiddleware, final Device deviceInfo, final Object ui) {
		super(myPubSubMiddleware, deviceInfo);
		this.ui = (Activity) ui;

		this.ui.runOnUiThread(new Runnable() {

			public void run() {
			
			obj$GUIdriver.name$ = $GUIdriver.name$Factory.get$GUIdriver.name$Driver(deviceInfo.getType(),(Activity) ui,obj);
			
			
			
			 $GUIdriver.commands:{ command |
			 
			 obj$GUIdriver.name$.$command.name; format="capital"$GUI(handlerCommand);    
          
  }; separator="\n"$

				

			}
		});	
	
	
	}
	
	   Listener$GUIdriver.name$  handlerCommand =  new  Listener$GUIdriver.name$() {
	
	
	$GUIdriver.commands:{ command |
		   
	   @Override
		public void onNew$command.name; format="capital"$Command($command.allParameter:{ param | $param.type.name$ newValue}; separator=" , "$) {
			$command.name; format="capital"$FromGUI($command.allParameter:{ param | newValue}; separator=" , "$);
		}
		
		 	 		
	}; separator="\n"$
	
	
	
	
}
