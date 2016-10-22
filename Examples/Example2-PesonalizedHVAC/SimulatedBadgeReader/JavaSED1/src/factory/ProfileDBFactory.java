package factory;

import framework.*;
import deviceImpl.*;
import iotsuite.common.GlobalVariable;
import android.app.Activity;
import logic.*;

public class ProfileDBFactory {

	public static IProfileDB getProfileDB(String nameProfileDB,
			Activity context, LogicProfileDB obj) {

		if (nameProfileDB.equals(GlobalVariable.deviceJAVASEType))
			return new JavaSEProfileDB();

		return null;
	}

}