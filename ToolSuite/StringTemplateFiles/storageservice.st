package $Storageservice.packageName$;

import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;




public abstract class  $Storageservice.name$  implements Runnable, Subscriber {
	
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
    
	public $Storageservice.name$(PubSubMiddleware pubSubM,  Device deviceInfo) {     
	 
		 this.myPubSubMiddleware = pubSubM;
		this.myDeviceInfo = deviceInfo;
		postInitialize();	
    }   
	
	protected void postInitialize() {
	      $Storageservice.allDataAccess:{dataAccess|subscribe$dataAccess.dataAccessName; format="capital"$(); 
	    }$ 
	    }
	

  
	$Storageservice.allDataAccess:{ dataAccess | 
	
  	private HashMap<$dataAccess.query.type.name; format="capital" $, $dataAccess.generatedInfo.type.name$ > $dataAccess.dataAccessName$ 
	= new HashMap<$dataAccess.query.type.name; format="capital" $, $dataAccess.generatedInfo.type.name$>();
	
	protected void set$dataAccess.dataAccessName; format="capital"$ 
			($dataAccess.query.type.name; format="capital" $ newIndex  , $dataAccess.generatedInfo.type.name$  new$dataAccess.dataAccessName; format="capital"$Value ) {
		$dataAccess.dataAccessName$.put(newIndex, new$dataAccess.dataAccessName; format="capital"$Value );
			myPubSubMiddleware.publish("$dataAccess.dataAccessName$Received", new$dataAccess.dataAccessName$Value, myDeviceInfo);
		
	}
	
	protected $dataAccess.generatedInfo.type.name$ get$dataAccess.dataAccessName$($dataAccess.query.type.name; format="capital" $ index) {
	      return $dataAccess.dataAccessName$.get(index);   
	      }
	    
	public void notifyReceived(String eventName, Object arg, Device deviceInfo) {
		try {

			if (eventName.equals("get$dataAccess.dataAccessName$")) {
				Logger.log(myDeviceInfo.getName(),"$Storageservice.name$",
					"CommandReceived get$dataAccess.dataAccessName$");

				onNew$dataAccess.dataAccessName$RequestReceived((String) arg);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public abstract void onNew$dataAccess.dataAccessName$RequestReceived(String arg);
	
	public void subscribe$dataAccess.dataAccessName$() {
		List<String> regionInfo = new ArrayList<String>();

		regionInfo.add("*");
		regionInfo.add("*");
		regionInfo.add("*");
		
		this.myPubSubMiddleware.subscribe(this, "get$dataAccess.dataAccessName$",regionInfo);
		
	}
	
	
}$    		
	   		
	 public void run() {   }

}

