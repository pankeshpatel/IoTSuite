package logic;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import iotsuite.android.localmiddleware.PubSubsSensingFramework;
import android.app.Activity;
import iotsuite.semanticmodel.*;
import framework.*;
import android.content.Context;
import factory.*;
import deviceImpl.AndroidSmartHomeApp;
  
   
public  class  LogicSmartHomeApp extends SmartHomeApp  {	

	ISmartHomeApp objSmartHomeApp;
	Activity ui;
	public LogicSmartHomeApp obj=this;
	 public String deviceType;
	 public static PubSubsSensingFramework pubSubSensingFramework;
	 
	

	public LogicSmartHomeApp(PubSubMiddleware myPubSubMiddleware, final Device deviceInfo, final Object ui, Context myContext) {
		super(myPubSubMiddleware, deviceInfo);
		
		 deviceType = deviceInfo.getType();
		 
		 
   pubSubSensingFramework = PubSubsSensingFramework.getInstance();
   //Intent intent = new Intent(myContext, AndroidSmartHomeApp.class);
   //myContext.startActivity(intent);
		 
	
		
		this.ui = (Activity) ui;
		this.ui.runOnUiThread(new Runnable() {
			public void run() {
			objSmartHomeApp = SmartHomeAppFactory.getSmartHomeAppDriver(deviceInfo.getType(),(Activity) ui,obj);

		  			 objSmartHomeApp.OffGUI(handlerCommand);
		  			 

		  			 objSmartHomeApp.SetTempGUI(handlerCommand);
		  			 
			 
			  

                   objSmartHomeApp.ProfileGUI(handlerCommand); 
           
    
     
	}
	});	

}
	
	ListenerSmartHomeApp  handlerCommand =  new  ListenerSmartHomeApp() {

		 @Override
			public void onNewOffCommand() {
				OffFromGUI();
			} 		
		

		 @Override
			public void onNewSetTempCommand(TempStruct newValue) {
				SetTempFromGUI(newValue);
			} 		
		
	

	         @Override
	         public void onNewProfileRequest(String request) {
	             ProfileRequest(request);
	         }    
	    
    
    
 
	
	};
	

	      public void onNewProfileResponse(TempStruct arg){
	         pubSubSensingFramework.publish("profileResponse", arg);     
	     }
	         
    

         
         public  void onNewDisplayTempNotify(TempStruct arg){
          pubSubSensingFramework.publish("displayTempNotify", arg);    
         }
        
    
    
    
    
        
    
}