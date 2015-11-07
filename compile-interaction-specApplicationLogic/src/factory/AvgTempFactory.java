package factory;

import android.app.Activity; 
import logic.*;
import deviceImpl.*;
import iotsuite.common.GlobalVariable;
import framework.*;


public class  AvgTempFactory  { 
   
   public static IAvgTemp getAvgTemp(String nameAvgTemp, Activity context,
     LogicAvgTemp obj) {  
	 
			
        if (nameAvgTemp.equals(GlobalVariable.deviceJAVASEType))   
           return new JavaSEAvgTemp(); 
      
                       
        return null;       
    }
}