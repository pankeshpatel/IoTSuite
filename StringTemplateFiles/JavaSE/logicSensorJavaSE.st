package $SensorDriver.logicPackageName$;

import iotsuite.pubsubmiddleware.*;
import iotsuite.common.GlobalVariable;
import android.content.Context;
import iotsuite.semanticmodel.*;
import factory.*;
import $SensorDriver.PackageName$.*;


public class  Logic$SensorDriver.name$ extends $SensorDriver.name$  { 

 
	public Logic$SensorDriver.name$(PubSubMiddleware pubSubM, final Device deviceInfo, final Object ui,Context myContext) {
		super(pubSubM, deviceInfo);
		
		String deviceType = deviceInfo.getType();
		
		if (deviceType.equals(GlobalVariable.deviceJAVASEType)) {
			
			I$SensorDriver.name$ obj$SensorDriver.name$ = $SensorDriver.name$Factory
			.get$SensorDriver.name$(myDeviceInfo.getType(), null, null, deviceInfo);
	
	if (obj$SensorDriver.name$.isEventDriven()) {

		$SensorDriver.allGeneratedInfo:{ generatedInfo | 
		
			obj$SensorDriver.name$.get$generatedInfo.name; format="avoidCapital"$($generatedInfo.name; format="avoidCapital"$Event);
		
	}; separator="\n"$

	} else {
		
		$SensorDriver.allGeneratedInfo:{ generatedInfo | 	
		
		obj$SensorDriver.name$.get$generatedInfo.name; format="avoidCapital"$($generatedInfo.name; format="avoidCapital"$Event);
		
			   
	}; separator="\n"$
	
	}
		   		    
		}
		
		

	}	
	
	$SensorDriver.allGeneratedInfo:{ generatedInfo | 
	
   
}; separator="\n"$
		

	$SensorDriver.allGeneratedInfo:{ generatedInfo | 	
	
	
	Listener$generatedInfo.name; format="avoidCapital"$  $generatedInfo.name; format="avoidCapital"$Event = new Listener$generatedInfo.name; format="avoidCapital"$() {
		
		@Override
		public void onNew$generatedInfo.name; format="avoidCapital"$($generatedInfo.type$ response) {

			$generatedInfo.type$ s$generatedInfo.type$ = new $generatedInfo.type$(
			$generatedInfo.data.StructFieldSet:{ StructFieldSet | response.get$StructFieldSet.name$()}; separator=", "$);
			set$generatedInfo.name; format="capital"$(s$generatedInfo.type$);
		}
		
		 
	};
   
}; separator="\n"$	

}