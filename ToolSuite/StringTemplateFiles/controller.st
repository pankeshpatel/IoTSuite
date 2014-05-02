package $CS.packageName$;

import fr.inria.arles.pankesh.pubsubmiddleware.*;
import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.common.*;
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
    }$ }
    
	$CS.allAttributes:{ attribute |
    private $attribute.type$ $attribute.name; format="avoidCapital"$;
    protected void set$attribute.name; format="capital"$($attribute.type$ newValue) {
      if ($attribute.name; format="avoidCapital"$ != newValue) {
        $attribute.name; format="avoidCapital"$ = newValue; 
      }
    }    
    public $attribute.type$ get$attribute.name; format="capital"$() {
      return $attribute.name; format="avoidCapital"$;
    }
}; separator="\n"$

    $CS.allActions:{ action |
    protected  void $action.name; format="capital"$($action.allParameter:{ param | $param.type.name$ arg }; separator=" , "$) {
  	    Logger.log( myDeviceInfo.getName() ,"$CS.name$" , "Sending command $action.name$");
    	this.myPubSubMiddleware.publish("$action.name; format="capital"$", $if(action.Parameter)$ $action.allParameter: { param | arg }; separator=" , "$ $else$ null $endif$ , myDeviceInfo );     
    }
}; separator="\n"$        
        public void notifyReceived(String eventName, Object arg, Device deviceInfo) { 
	    try {
	      $CS.allConsumedInfo:{ consumedInfo | if (eventName.equals("$consumedInfo.name$"))  
          { 
	    	 
	    	  Logger.log( myDeviceInfo.getName() ,"$CS.name$" , "Notification received $consumedInfo.name$");
	    	  onNew$consumedInfo.name; format="capital"$(($consumedInfo.type.name$) arg); 
          }
          }$         
         } catch (Exception e) {
              e.printStackTrace();
        }
        }	  
	    $CS.allConsumedInfo:{ consumedInfo | 	   
	    public abstract void onNew$consumedInfo.name; format="capital"$( $consumedInfo.type.name$ arg);	   		
	   	
	   	public void subscribe$consumedInfo.name; format="capital"$() {
	   	
	   	List<String> regionInfo = RegionSubscription.getSubscriptionRequest(
					partitionAttribute, myDeviceInfo.getRegionLabels(),
					myDeviceInfo.getRegion());
	   	     		
         		  this.myPubSubMiddleware.subscribe(this,"$consumedInfo.name$", regionInfo);
		}
		}$		
		public void run() {
		}		
}




    
	
	
    

    