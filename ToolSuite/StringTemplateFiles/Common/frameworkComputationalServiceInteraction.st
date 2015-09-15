package $CS.packageName$;
import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;
import java.util.List;

public abstract class  $CS.name$ implements Subscriber, Runnable{ 
			
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	private String partitionAttribute = "$CS.PartitionAttributeVal$";
	
	public $CS.name$(PubSubMiddleware pubSubM, Device deviceInfo) {   
		
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
    		  postInitialize();
    } 
	
	protected void postInitialize() {
      $CS.allConsumedInfo:{consumedInfo|subscribe$consumedInfo.name; format="capital"$(); 
    }$ 
    $CS.allDataAccess:{ dataAccess|subscribe$dataAccess.dataAccessName; format="capital"$();
    }$
    }
    
		
		$CS.allActions:{ action |
    protected  void $action.name; format="capital"$($action.allParameter:{ param | $param.type.name$ arg }; separator=" , "$) {
  	    Logger.log( myDeviceInfo.getName() ,"$CS.name$" , "Sending command $action.name$");
    	this.myPubSubMiddleware.publish("$action.name; format="capital"$", $if(action.Parameter)$ $action.allParameter: { param | arg }; separator=" , "$ $else$ null $endif$ , myDeviceInfo );     
    }
}; separator="\n"$	
		

    $CS.allGeneratedInfo:{ generatedInfo |
    private $generatedInfo.type.name$ $generatedInfo.name; format="avoidCapital"$;
    protected void set$generatedInfo.name; format="capital"$( $generatedInfo.type.name$ newValue) {
     
      if ($generatedInfo.name; format="avoidCapital"$ != newValue) {
        $generatedInfo.name; format="avoidCapital"$ = newValue; 
        
        Logger.log(myDeviceInfo.getName(),"$CS.name$", "Publishing $generatedInfo.name$");
        
     
        this.myPubSubMiddleware.publish("$generatedInfo.name; format="capital"$", newValue, myDeviceInfo);		
       
      }
    } 
    /*   
    protected  $generatedInfo.type.name$ get$generatedInfo.name; format="capital"$() {
      return  $generatedInfo.name; format="avoidCapital"$;
    } */
       
}; separator="\n"$
		

        
        public void notifyReceived(String eventName, Object arg, Device deviceInfo) { 
        try {	
         $CS.allConsumedInfo:{ consumedInfo | 
        if (eventName.equals("$consumedInfo.name$"))  
        { 
           Logger.log(myDeviceInfo.getName(),"$CS.name$",
            "Notification Received $consumedInfo.name$");
          
           onNew$consumedInfo.name; format="capital"$(($consumedInfo.type.name$) arg); 
           
         //  onNew$consumedInfo.name; format="capital"$Received(($CS.allConsumedInfo:{ consumedInfo | $consumedInfo.type.name$}$) arg);
        }
        }$
      
        
          
         $CS.allDataAccess:{ dataAccess |
        if (eventName.equals("$dataAccess.dataAccessName; format="capital"$")) {
        Logger.log(myDeviceInfo.getName(), "Proximity",
            "Notification Received Profile");

        onNew$dataAccess.dataAccessName; format="capital"$Received(( $CS.allGeneratedInfo:{ generatedInfo |$generatedInfo.type.name$}; separator="\n"$) arg);
       }
        }$
        
        
        	 } catch (Exception e) {
                 e.printStackTrace();
           }
        }
	  
	    $CS.allConsumedInfo:{ consumedInfo | 
	   
	    public abstract void onNew$consumedInfo.name; format="capital"$($consumedInfo.type.name$ arg);	   		
	  
	   
	   	public void subscribe$consumedInfo.name; format="capital"$() {
	   		    
	   		List<String> regionInfo = RegionSubscription.getSubscriptionRequest(
					partitionAttribute, myDeviceInfo.getRegionLabels(),
					myDeviceInfo.getRegion());
	   		
	   		
	   		
         		this.myPubSubMiddleware.subscribe(this,"$consumedInfo.name$", regionInfo);
		}
		}$ 	
		
		$CS.allDataAccess:{ dataAccess |
		    
		public abstract void onNew$dataAccess.dataAccessName; format="capital"$Received($CS.allGeneratedInfo:{ generatedInfo |$generatedInfo.type.name$}$  arg);	   		
	   	public void subscribe$dataAccess.dataAccessName; format="capital"$() {
	   		    
	   		List<String> regionInfo = RegionSubscription.getSubscriptionRequest(
					partitionAttribute, myDeviceInfo.getRegionLabels(),
					myDeviceInfo.getRegion());
	   		
	   		
	   		
         		this.myPubSubMiddleware.subscribe(this,"$dataAccess.dataAccessName; format="capital"$", regionInfo);
		}
		    
		    
		}$
		
		public void run() {	
		}	
        
		$CS.allDataAccess:{ dataAccess |
		    protected void get$dataAccess.dataAccessName; format="capital"$($dataAccess.query.type.name; format="capital" $ arg) {
		    	 Logger.log(myDeviceInfo.getName(),"$CS.name$",
		     				"Sending command get$dataAccess.dataAccessName$");
		    	this.myPubSubMiddleware.publish("get$dataAccess.dataAccessName; format="capital"$", arg , myDeviceInfo );     
		    }
		}; separator="\n"$ 
}




    
	
	
    

    