
package $CS.logicPackageName$;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import iotsuite.localmiddleware.PubSubsSensingFramework;
import android.content.Context;
import iotsuite.semanticmodel.*;
import factory.$CS.name$Factory;
import $CS.PackageName$.*;
	   	


public class  Logic$CS.name$ extends $CS.name$  { 

  I$CS.name$ obj$CS.name$;
  public static PubSubsSensingFramework pubSubSensingFramework;
   public Logic$CS.name$(PubSubMiddleware pubSubM, Device deviceInfo, Object ui,Context myContext) {
		super(pubSubM, deviceInfo);
		pubSubSensingFramework = PubSubsSensingFramework.getInstance();
		  obj$CS.name$ = $CS.name$Factory.get$CS.name$(
        deviceInfo.getType(), null, null);
        obj$CS.name$.get$consumedInfo.name$($consumedInfo.name$Event);
	}   
    		
    		Listener$consumedInfo.name$ $consumedInfo.name$Event = new Listener$consumedInfo.name$()
    		{
	
	    $CS.allConsumedInfo:{ consumedInfo |
	   
	    public  void onNew$consumedInfo.name; format="capital"$( $consumedInfo.type.name$ reponse){	    
	    //TODO : write code here.
	    
	    }	   		
	   	
		}; separator="\n"$ 
		};
		 
		 
		 $CS.allConsumedInfo:{ consumedInfo |
     
      public  void onNew$consumedInfo.name; format="capital"$( $consumedInfo.type.name$ arg){     
      //TODO : write code here.
      pubSubSensingFramework.publish("AVG-REQUEST", arg);
      }       
      
    }; separator="\n"$ 
		
		$CS.allDataAccess:{ dataAccess |	   
	    public void onNew$dataAccess.dataAccessName; format="capital"$Received( $CS.allGeneratedInfo:{ generatedInfo |$generatedInfo.type.name$}$ arg)
	    {
	    	//TODO : write code here
	    }	   	
	}$
		
		
		
		
}