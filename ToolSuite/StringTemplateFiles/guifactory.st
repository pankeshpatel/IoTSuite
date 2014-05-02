package factory;

import logic.Fake$GUIdriver.name$;
import android.app.Activity;
import deviceImpl.Impl$GUIdriver.name$;
import framework.I$GUIdriver.name$;

public class $GUIdriver.name$Factory {

	public static I$GUIdriver.name$ get$GUIdriver.name$Driver(String nameMonitor,
			Activity context, Fake$GUIdriver.name$ obj) {

		// TODO : Developers should replace "Impl" word with appropriate 
		//  name for readability.

		if (nameMonitor.equals("Android")) {

			Impl$GUIdriver.name$ driver = new Impl$GUIdriver.name$(context, obj);

			return driver;

		}
		// Register device specific driver

		// if (nameMonitor.equals("iOS"))
		// return new IOSMonitor();
		return null;
	}

}