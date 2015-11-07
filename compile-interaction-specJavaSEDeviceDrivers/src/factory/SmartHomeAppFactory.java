package factory;

import logic.*;
import android.app.Activity;
import deviceImpl.*;
import framework.*;
import iotsuite.common.*;


public class SmartHomeAppFactory {

  public static ISmartHomeApp getSmartHomeAppDriver(String nameSmartHomeApp,
      Activity context, LogicSmartHomeApp obj) {

    if (nameSmartHomeApp.equals(GlobalVariable.deviceJAVASEType)) 
      return  new  JavaSESmartHomeApp(context, obj); 
  
    return null;
  }

}