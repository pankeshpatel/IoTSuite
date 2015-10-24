package $Actuatordriver.factoryPackageName$;

import $Actuatordriver.PackageName$.*;
import deviceImpl.*;
import logic.*;
import android.app.Activity;
import iotsuite.common.GlobalVariable;



public class  $Actuatordriver.name$Factory  { 
   
   public static I$Actuatordriver.name$ get$Actuatordriver.name$(String name$Actuatordriver.name$, 
                 Activity context, Logic$Actuatordriver.name$ obj) {
   
 
  
        if (name$Actuatordriver.name$.equals(GlobalVariable.deviceJAVASEType))
          return new JavaSE$Actuatordriver.name$();  
       
             
       
    return null;       
}

}