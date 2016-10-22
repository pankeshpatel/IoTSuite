package factory;

import logic.*;
import android.app.Activity;
import deviceImpl.*;
import framework.*;
import iotsuite.common.*;


public class EndUserAppFactory {

	public static IEndUserApp getEndUserAppDriver(String nameEndUserApp,
			Activity context, LogicEndUserApp obj) {

	  if (nameEndUserApp.equals(GlobalVariable.deviceAndroidType)) 
			return  new  AndroidEndUserApp(context, obj);	
	
		return null;
	}

}