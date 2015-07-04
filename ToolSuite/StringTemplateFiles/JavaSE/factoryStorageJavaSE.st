package $Storageservice.factoryPackageName$;

import $Storageservice.packageName$.*;
import deviceImpl.*;
import iotsuite.common.GlobalVariable;
import android.app.Activity;
import logic.*;


public class  $Storageservice.name$Factory  { 
   
   public static I$Storageservice.name$ get$Storageservice.name$(String name$Storageservice.name$, Activity context, Logic$Storageservice.name$ obj) {
  
           if (name$Storageservice.name$.equals(GlobalVariable.deviceJAVASEType))   
           return new JavaSE$Storageservice.name$(); 
    
          return null;       
}

}     