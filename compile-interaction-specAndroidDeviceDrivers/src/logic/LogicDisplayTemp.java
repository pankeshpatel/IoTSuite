package logic;

import iotsuite.semanticmodel.*;
import framework.*;
import deviceImpl.*;
import android.content.Context;
import iotsuite.android.localmiddleware.PubSubsSensingFramework;
import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.content.Intent;

  
public  class  LogicDisplayTemp extends DisplayTemp  {	
	
	public String deviceType;
	public static PubSubsSensingFramework pubSubSensingFramework;

	public LogicDisplayTemp(PubSubMiddleware myPubSubMiddleware,final Device deviceInfo, final Object ui, Context myContext)
	 {
		super(myPubSubMiddleware, deviceInfo);
		
		pubSubSensingFramework = PubSubsSensingFramework.getInstance();

		
		Intent intent = new Intent(myContext, AndroidDisplayTemp.class);
		myContext.startActivity(intent);

	}	
	
        
        @Override
       protected  void DisplayTemp(TempStruct arg ) {
    	
        	pubSubSensingFramework.publish("DisplayTemp",   arg  );
       
        }
    	

	
}