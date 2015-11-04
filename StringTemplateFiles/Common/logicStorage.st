package $Storageservice.logicPackageName$;

import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import android.content.Context;
import $Storageservice.PackageName$.*;
import iotsuite.common.GlobalVariable;
import factory.*;

public class  Logic$Storageservice.name$  extends $Storageservice.name$  {
	
	public String deviceType;
	I$Storageservice.name$ obj$Storageservice.name$;

	
	public Logic$Storageservice.name$(PubSubMiddleware pubSubM, Device deviceInfo, Object ui,Context myContext) {
		super(pubSubM, deviceInfo);
		
		deviceType = deviceInfo.getType();
		  obj$Storageservice.name$ = $Storageservice.name$Factory.get$Storageservice.name$(myDeviceInfo.getType(), null, null,deviceInfo);
			}
	
	$Storageservice.allDataAccess:{ dataAccess |
	
	@Override
	public void onNew$dataAccess.dataAccessName; format="avoidCapital"$RequestReceived(String arg) {
		
		
    if (deviceType.equals(GlobalVariable.deviceJAVASEType)) {
       
      
       set$dataAccess.dataAccessName; format="capital"$(obj$Storageservice.name$.get$dataAccess.dataAccessName; format="avoidCapital"$(arg));
       }
       else{
        // This is reserved for Android Devices.
       }
      }
	
	}$
	
    $Storageservice.allActions:{ action |     
	    @Override
	    protected  void $action.name$($action.allParameter:{ param | $param.type$ arg }; separator=", "$) {
	     obj$Storageservice.name$.$action.name$($action.allParameter:{ param | arg }; separator=", "$);
	    }
		
	}$

}


  

        
    
	
	
    

    