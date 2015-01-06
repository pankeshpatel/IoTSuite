package factory;

import logic.*;
import android.app.Activity;
import deviceImpl.*;
import framework.*;
import iotsuite.common.*;


public class $GUIdriver.name$Factory {

	public static I$GUIdriver.name$ get$GUIdriver.name$Driver(String name$GUIdriver.name$,
			Activity context, Logic$GUIdriver.name$ obj) {

	  if (name$GUIdriver.name$.equals(GlobalVariable.deviceAndroidType)) 
			return  new  Android$GUIdriver.name$(context, obj);	
	
		return null;
	}

}