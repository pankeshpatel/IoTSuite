package factory;

import framework.*;
import iotsuite.semanticmodel.Device;
import deviceImpl.*;
import iotsuite.common.GlobalVariable;
import android.app.Activity;
import logic.*;


public class  ProfileDBFactory  { 
   
   public static IProfileDB getProfileDB(String nameProfileDB, Activity context, LogicProfileDB obj
   ,Device deviceInfo) {
  
           if (nameProfileDB.equals(GlobalVariable.deviceAndroidType))   
           return new AndroidProfileDB(); 
    
          return null;       
}

}