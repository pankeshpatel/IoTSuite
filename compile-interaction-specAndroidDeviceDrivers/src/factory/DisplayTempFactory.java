package factory;

import framework.*;
import deviceImpl.*;
import logic.*;
import android.app.Activity;
import iotsuite.common.GlobalVariable;



public class  DisplayTempFactory  { 
   
   public static IDisplayTemp getDisplayTemp(String nameDisplayTemp, 
                 Activity context, LogicDisplayTemp obj) {
   
 //	if (nameDisplayTemp.equals(GlobalVariable.deviceAndroidType))
 //       return new AndroidDisplayTemp(context, obj);  
        
       
    return null;       
}

}