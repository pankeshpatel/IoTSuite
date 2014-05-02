package $SensorDriver.factoryPackageName$;

import $SensorDriver.PackageName$.*;
import android.app.Activity;
import logic.*;
import deviceImpl.*;
import iotsuite.common.GlobalVariable;


public class  $SensorDriver.name$Factory  { 
   
   public static I$SensorDriver.name$ get$SensorDriver.name$(String name$SensorDriver.name$, Activity context,
     Logic$SensorDriver.name$ obj) {  
	 
			
        if (name$SensorDriver.name$.equals(GlobalVariable.deviceJAVASEType))   
           return new JavaSE$SensorDriver.name$(); 
      
                       
        return null;       
    }
}