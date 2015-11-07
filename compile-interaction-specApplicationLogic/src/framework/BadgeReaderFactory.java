package factory;

import framework.*;
import android.app.Activity;
import logic.*;
import deviceImpl.*;
import iotsuite.common.GlobalVariable;


public class  BadgeReaderFactory  { 
   
   public static IBadgeReader getBadgeReader(String nameBadgeReader, Activity context,
     LogicBadgeReader obj) {  
	 
			
       if (nameBadgeReader.equals(GlobalVariable.deviceAndroidType))  
           return new AndroidBadgeReader(context, obj);  
                
        return null;       
    }
}