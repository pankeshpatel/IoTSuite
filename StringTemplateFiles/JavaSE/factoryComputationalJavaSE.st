package factory;

import android.app.Activity; 
import logic.*;
import deviceImpl.*;
import iotsuite.common.GlobalVariable;
import framework.*;


public class  $CS.name$Factory  { 
   
   public static I$CS.name$ get$CS.name$(String name$CS.name$, Activity context,
     Logic$CS.name$ obj) {  
	 
			
        if (name$CS.name$.equals(GlobalVariable.deviceJAVASEType))   
           return new JavaSE$CS.name$(); 
      
                       
        return null;       
    }
}