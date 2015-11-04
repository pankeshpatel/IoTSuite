package $Actuatordriver.logicPackageName$;


import iotsuite.semanticmodel.*;
import $Actuatordriver.PackageName$.*;
import factory.*;
import android.content.Context;
import iotsuite.pubsubmiddleware.PubSubMiddleware;

  
public  class  Logic$Actuatordriver.name$ extends $Actuatordriver.name$  {	
	
	public String deviceType;
	

	public Logic$Actuatordriver.name$(PubSubMiddleware myPubSubMiddleware, Device deviceInfo, final Object ui, Context myContext) {
  		super(myPubSubMiddleware, deviceInfo);
		
		

	}	
	
    $Actuatordriver.allActions:{ action |     
    @Override
    protected  void $action.name$($action.allParameter:{ param | $param.type$ arg }; separator=", "$) {
    I$Actuatordriver.name$ obj$Actuatordriver.name$ = $Actuatordriver.name$Factory.get$Actuatordriver.name$(myDeviceInfo.getType(), null, null);
     obj$Actuatordriver.name$.$action.name$($action.allParameter:{ param | arg }; separator=", "$);
   
    }
	
}$
	
}
   
     
    
