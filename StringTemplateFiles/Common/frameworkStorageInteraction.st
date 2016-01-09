package $Storageservice.packageName$;

import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public abstract class  $Storageservice.name$  implements Runnable, Subscriber {
	
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;

    
	public $Storageservice.name$(PubSubMiddleware pubSubM,  Device deviceInfo) {     
	 
		 this.myPubSubMiddleware = pubSubM;
		this.myDeviceInfo = deviceInfo;
		 postInitialize();	
    }   
	
protected void postInitialize() {
   $Storageservice.allDataAccess:{dataAccess|subscribe$dataAccess.dataAccessName; format="avoidCapital"$();}$
   $Storageservice.allActions:{action | subscribe$action.name; format="capital"$();}$ 
}




	$Storageservice.allDataAccess:{ dataAccess |  
	protected void set$dataAccess.dataAccessName; format="capital"$ 
	($dataAccess.generatedInfo.type$  new$dataAccess.dataAccessName; format="avoidCapital"$Value ){
	
	
	myPubSubMiddleware.publish("$dataAccess.dataAccessName$", new$dataAccess.dataAccessName$Value);
	}
	
   }$
	    
	public void notifyReceived(String eventName, Object arg) {
		try {
			
			$Storageservice.allDataAccess:{ dataAccess | 	
			
			if (eventName.equals("get$dataAccess.dataAccessName$")) {
				Logger.log(myDeviceInfo.getName(),"$Storageservice.name$",
					"CommandReceived get$dataAccess.dataAccessName$");
					 JsonObject jsonObject = new JsonParser().parse(arg.toString()).getAsJsonObject();
					
					 onNew$dataAccess.dataAccessName$RequestReceived((String) arg);
			}
		}$
		
		$Storageservice.allActions:{ action |
		    if (eventName.equals("$action.name$") ) { 
		    	Logger.log( myDeviceInfo.getName() ,"$Storageservice.name$" , "$action.name$ has been received"); 
		    	
		     	
				   $action.name$($action.allParameter:{ param | ($param.type$)arg }; separator=", "$);		   
		      } 
		    }$
		

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
   
   $Storageservice.allDataAccess:{ dataAccess | 

	public abstract void onNew$dataAccess.dataAccessName$RequestReceived(String arg);
   
	}$
	
    $Storageservice.allActions:{ action | protected abstract void $action.name$($action.allParameter:{ param | $param.type$ arg }; separator=", "$); }; separator="\n"$

	
	$Storageservice.allDataAccess:{ dataAccess | 
	public void subscribe$dataAccess.dataAccessName$() {
		 /* List<String> regionInfo = new ArrayList<String>();
		regionInfo.add("*"); */ 					
		this.myPubSubMiddleware.subscribe(this, "get$dataAccess.dataAccessName$");		
	}	
  }$ 
  
  $Storageservice.allActions:{ action | 
  	public void subscribe$action.name; format="capital"$() {					
	     /* List<String> regionInfo = new ArrayList<String>(); 
		regionInfo.add("*"); */ 				
      this.myPubSubMiddleware.subscribe(this,"$action.name$"); 
 		}
  }$ 
  
	 public void run() {   }
}

