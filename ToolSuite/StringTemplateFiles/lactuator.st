package $Actuatordriver.logicPackageName$;

import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import $Actuatordriver.PackageName$.*;
import factory.*;

  
   
public  class  Logic$Actuatordriver.name$ extends $Actuatordriver.name$  {	

	public Logic$Actuatordriver.name$(PubSubMiddleware myPubSubMiddleware, Device deviceInfo, Object ui) {
		super(myPubSubMiddleware, deviceInfo);

	}	
	
    $Actuatordriver.allActions:{ action |     
    @Override
    protected  void $action.name$($action.allParameter:{ param | $param.type.name$ arg }; separator=", "$) {
    I$Actuatordriver.name$ obj$Actuatordriver.name$ = $Actuatordriver.name$Factory.get$Actuatordriver.name$(myDeviceInfo.getType(), null, null);
	// I$Actuatordriver.name$ obj$Actuatordriver.name$ = $Actuatordriver.name$Factory.get$Actuatordriver.name$(myDeviceInfo.getType(), null);
     obj$Actuatordriver.name$.$action.name$($action.allParameter:{ param | arg }; separator=", "$);
    }
    
    }; separator="\n"$
	
}
   
     
    
