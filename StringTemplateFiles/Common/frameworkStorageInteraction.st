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
	private String partitionAttribute = "Room";

    
	public $Storageservice.name$(PubSubMiddleware pubSubM,  Device deviceInfo) {     
	 
		 this.myPubSubMiddleware = pubSubM;
		this.myDeviceInfo = deviceInfo;
		postInitialize();	
    }   
	
	protected void postInitialize() {
	      $Storageservice.allDataAccess:{dataAccess|subscribe$dataAccess.dataAccessName; format="avoidCapital"$(); 
	    }$ 
	    }
	

  
	$Storageservice.allDataAccess:{ dataAccess | 
	
  	
	
	protected void set$dataAccess.dataAccessName; format="capital"$ 
			($dataAccess.generatedInfo.type$  new$dataAccess.dataAccessName; format="avoidCapital"$Value ) {
		
			myPubSubMiddleware.publish("$dataAccess.dataAccessName$", new$dataAccess.dataAccessName$Value, myDeviceInfo);
		
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

		//regionInfo.add("*");
		//regionInfo.add("*");
		//regionInfo.add("*");
		
		regionInfo = RegionSubscription.getSubscriptionRequest(
				partitionAttribute, myDeviceInfo.getRegionLabels(),
				myDeviceInfo.getRegion());
				
		
		this.myPubSubMiddleware.subscribe(this, "get$dataAccess.dataAccessName$",regionInfo);
		
	}
	
	
}$    		
	   		
	 public void run() {   }

}

