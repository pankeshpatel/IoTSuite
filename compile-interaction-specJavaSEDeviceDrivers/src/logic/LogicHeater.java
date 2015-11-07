package logic;


import iotsuite.semanticmodel.*;
import framework.*;
import factory.*;
import android.content.Context;
import iotsuite.pubsubmiddleware.PubSubMiddleware;

  
public  class  LogicHeater extends Heater  {	
	
	public String deviceType;
	

	public LogicHeater(PubSubMiddleware myPubSubMiddleware, Device deviceInfo, final Object ui, Context myContext) {
  		super(myPubSubMiddleware, deviceInfo);
		
		

	}	
	
        
        @Override
        protected  void SetTemp(TempStruct arg ) {
        IHeater objHeater = HeaterFactory.getHeater(myDeviceInfo.getType(), null, null);
         objHeater.SetTemp(arg );
       
        }
    	
        
        @Override
        protected  void Off() {
        IHeater objHeater = HeaterFactory.getHeater(myDeviceInfo.getType(), null, null);
         objHeater.Off();
       
        }
    	

	
}