package factory;

import framework.*;
import deviceImpl.*;
import logic.*;
import android.app.Activity;
import iotsuite.common.GlobalVariable;

public class HeaterFactory {

	public static IHeater getHeater(String nameHeater, Activity context,
			LogicHeater obj) {

		if (nameHeater.equals(GlobalVariable.deviceJAVASEType))
			return new JavaSEHeater();

		return null;
	}

}