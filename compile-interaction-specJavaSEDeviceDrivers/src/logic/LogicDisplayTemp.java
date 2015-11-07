package logic;


import iotsuite.semanticmodel.*;
import framework.*;
import factory.*;
import android.content.Context;
import iotsuite.pubsubmiddleware.PubSubMiddleware;

  
public  class  LogicDisplayTemp extends DisplayTemp  {	
	
	public String deviceType;
	

	public LogicDisplayTemp(PubSubMiddleware myPubSubMiddleware, Device deviceInfo, final Object ui, Context myContext) {
  		super(myPubSubMiddleware, deviceInfo);
		
		

	}	
	
        
        @Override
        protected  void DisplayTemp(TempStruct arg ) {
        IDisplayTemp objDisplayTemp = DisplayTempFactory.getDisplayTemp(myDeviceInfo.getType(), null, null);
         objDisplayTemp.DisplayTemp(arg );
       
        }
    	

	
}