package $Actuatordriver.logicPackageName$;

import iotsuite.semanticmodel.*;
import $Actuatordriver.PackageName$.*;
import deviceImpl.*;
import android.content.Context;
import iotsuite.android.localmiddleware.PubSubsSensingFramework;
import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.content.Intent;

  
public  class  Logic$Actuatordriver.name$ extends $Actuatordriver.name$  {	
	
	public String deviceType;
	public static PubSubsSensingFramework pubSubSensingFramework;

	public Logic$Actuatordriver.name$(PubSubMiddleware myPubSubMiddleware, Device deviceInfo, Context myContext) {
		super(myPubSubMiddleware, deviceInfo);
		
		pubSubSensingFramework = PubSubsSensingFramework.getInstance();

		
		Intent intent = new Intent(myContext, Android$Actuatordriver.name$.class);
		myContext.startActivity(intent);

	}	
	
    $Actuatordriver.allActions:{ action |     
    @Override
    protected  void $action.name$($action.allParameter:{ param | $param.type.name$ arg }; separator=", "$) {
    	
	
		pubSubSensingFramework.publish("$action.name$", $action.allParameter:{ param | arg }; separator=", "$);

    
    
    }
	
}$
	
}
   
     
    
