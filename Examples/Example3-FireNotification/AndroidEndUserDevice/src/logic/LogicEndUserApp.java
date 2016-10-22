package logic;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import iotsuite.android.localmiddleware.PubSubsSensingFramework;
import android.app.Activity;
import iotsuite.semanticmodel.*;
import framework.*;
import android.content.Context;
import factory.*;
import deviceImpl.AndroidEndUserApp;
  
   
public  class  LogicEndUserApp extends EndUserApp  {	

	IEndUserApp objEndUserApp;
	Activity ui;
	public LogicEndUserApp obj=this;
	 public String deviceType;
	 public static PubSubsSensingFramework pubSubSensingFramework;
	 
	

	public LogicEndUserApp(PubSubMiddleware myPubSubMiddleware, final Device deviceInfo, final Object ui, Context myContext) {
		super(myPubSubMiddleware, deviceInfo);
		
		 deviceType = deviceInfo.getType();
		 
		 
   pubSubSensingFramework = PubSubsSensingFramework.getInstance();
   //Intent intent = new Intent(myContext, AndroidEndUserApp.class);
   //myContext.startActivity(intent);
		 
	
		
		this.ui = (Activity) ui;
		this.ui.runOnUiThread(new Runnable() {
			public void run() {
			objEndUserApp = EndUserAppFactory.getEndUserAppDriver(deviceInfo.getType(),(Activity) ui,obj);
			 
			  
 
    
     
	}
	});	

}
	
	ListenerEndUserApp  handlerCommand =  new  ListenerEndUserApp() {
	
    
    
 
	
	};
	
    
    

         
         public  void onNewFireNotifyNotify(FireStateStruct arg){
          pubSubSensingFramework.publish("fireNotifyNotify", arg);    
         }
        
    
    @Override
	public void notifyReceived(String eventName, Object arg) {
		// TODO Auto-generated method stub
		
	}
    
    
    
    
        
    
}