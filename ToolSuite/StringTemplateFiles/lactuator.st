package $Actuatordriver.logicPackageName$;

import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import $Actuatordriver.PackageName$.*;
import factory.*;
import deviceImpl.*;
import android.content.Context;
import iotsuite.common.*;
import iotsuite.android.localmiddleware.PubSubsSensingFramework;
import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.content.Intent;

  
public  class  Logic$Actuatordriver.name$ extends $Actuatordriver.name$  {	
	
	public String deviceType;
	public static PubSubsSensingFramework pubSubSensingFramework;

	public Logic$Actuatordriver.name$(PubSubMiddleware myPubSubMiddleware, Device deviceInfo, Context myContext) {
		super(myPubSubMiddleware, deviceInfo);
		
		Intent intent = new Intent(myContext, Android$Actuatordriver.name$.class);
		myContext.startActivity(intent);

	}	
	
    $Actuatordriver.allActions:{ action |     
    @Override
    protected  void $action.name$($action.allParameter:{ param | $param.type.name$ arg }; separator=", "$) {
    	
	if (deviceType.equals(GlobalVariable.deviceJAVASEType)) {
	
    I$Actuatordriver.name$ obj$Actuatordriver.name$ = $Actuatordriver.name$Factory.get$Actuatordriver.name$(myDeviceInfo.getType(), null, null);
     obj$Actuatordriver.name$.$action.name$($action.allParameter:{ param | arg }; separator=", "$);
  
    }else {
		pubSubSensingFramework.publish("$action.name$", $action.allParameter:{ param | arg }; separator=", "$);

    }
    
    }
	
}$
	
}
   
     
    
