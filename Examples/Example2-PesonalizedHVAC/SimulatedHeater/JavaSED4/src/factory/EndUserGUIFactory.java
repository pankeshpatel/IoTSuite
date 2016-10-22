package factory;

import logic.*;
import android.app.Activity;
import deviceImpl.*;
import framework.*;
import iotsuite.common.*;

public class EndUserGUIFactory {

	public static IEndUserGUI getEndUserGUIDriver(String nameEndUserGUI,
			Activity context, LogicEndUserGUI obj) {

		if (nameEndUserGUI.equals(GlobalVariable.deviceJAVASEType))
			return new JavaSEEndUserGUI(context, obj);

		return null;
	}

}