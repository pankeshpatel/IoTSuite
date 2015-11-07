package logic;

import iotsuite.semanticmodel.*;
import framework.*;
import deviceImpl.*;
import android.content.Context;
import iotsuite.android.localmiddleware.PubSubsSensingFramework;
import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.content.Intent;

  
public  class  LogicHeater extends Heater  {	
	
	public String deviceType;
	public static PubSubsSensingFramework pubSubSensingFramework;

	public LogicHeater(PubSubMiddleware myPubSubMiddleware,final Device deviceInfo, final Object ui, Context myContext)
	 {
		super(myPubSubMiddleware, deviceInfo);
		
		pubSubSensingFramework = PubSubsSensingFramework.getInstance();

		
		Intent intent = new Intent(myContext, AndroidHeater.class);
		myContext.startActivity(intent);

	}	
	
        
        @Override
       protected  void SetTemp(TempStruct arg ) {
    	
        	pubSubSensingFramework.publish("SetTemp",   arg  );
       
        }
    	
        
        @Override
       protected  void Off() {
    	
        	pubSubSensingFramework.publish("Off",  null  );
       
        }
    	

	
}