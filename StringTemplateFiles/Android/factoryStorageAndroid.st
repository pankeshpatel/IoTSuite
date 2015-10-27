package $Storageservice.factoryPackageName$;

import $Storageservice.packageName$.*;
import iotsuite.semanticmodel.Device;
import deviceImpl.*;
import iotsuite.common.GlobalVariable;
import android.app.Activity;
import logic.*;


public class  $Storageservice.name$Factory  { 
   
   public static I$Storageservice.name$ get$Storageservice.name$(String name$Storageservice.name$, Activity context, Logic$Storageservice.name$ obj
   ,Device deviceInfo) {
  
           if (name$Storageservice.name$.equals(GlobalVariable.deviceAndroidType))   
           return new Android$Storageservice.name$(); 
    
          return null;       
}

}     