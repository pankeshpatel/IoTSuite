package $Storageservice.logicPackageName$;

import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import $Storageservice.PackageName$.*;
import iotsuite.common.GlobalVariable;
import factory.*;



public class  Logic$Storageservice.name$  extends $Storageservice.name$  {
	
	public String deviceType;

	
	public Logic$Storageservice.name$(PubSubMiddleware pubSubM, Device deviceInfo, Object ui) {
		super(pubSubM, deviceInfo);
		
		deviceType = deviceInfo.getType();

	}
	
	$Storageservice.allDataAccess:{ dataAccess |
	
	@Override
	public void onNew$dataAccess.dataAccessName; format="capital"$RequestReceived(String arg) {
		
	
		if (deviceType.equals(GlobalVariable.deviceJAVASEType)) {
			
			I$Storageservice.name$ obj$Storageservice.name$ = $Storageservice.name$Factory.get$Storageservice.name$(myDeviceInfo.getType(), null, null);
			set$dataAccess.dataAccessName; format="capital"$(obj$Storageservice.name$.get$dataAccess.dataAccessName; format="capital"$(arg));
	     }else{
	    	// This is reserved for Android Devices.
	     }
	}
	
	}$

}


  

        
    
	
	
    

    