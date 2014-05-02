package $GUIdriver.packageName$;

import fr.inria.arles.pankesh.pubsubmiddleware.*;
import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.common.*;
import java.util.List;

public abstract class  $GUIdriver.name$ implements Runnable, Subscriber  { 
  
  protected final PubSubMiddleware myPubSubMiddleware;
  protected final Device myDeviceInfo;
  //private String partitionAttribute = "$GUIdriver.PartitionAttributeVal$";
  private String partitionAttribute = "Room";
  
  
  public $GUIdriver.name$(PubSubMiddleware pubSubM, Device deviceInfo) {  
  
     this.myPubSubMiddleware = pubSubM;
     this.myDeviceInfo = deviceInfo;
    postInitialize();
    
    } 
    
    protected void postInitialize() {
      $GUIdriver.allActions:{action |subscribe$action.name; format="capital"$(); 
    }$ }

	$GUIdriver.commands:{ command |
	public void $command.name; format="capital"$FromGUI($command.allParameter:{ param | $param.type.name$ newValue}; separator=" , "$) {

	   this.myPubSubMiddleware.publish("$command.name; format="capital"$", $if(command.Parameter)$ $command.allParameter: { param | newValue }; separator=" , "$ $else$ null $endif$,
					myDeviceInfo);
		}	
	}; separator="\n"$
	
    
    $GUIdriver.allAttributes:{ attribute |
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
  
	    $GUIdriver.allActions:{ action | 
	    
	    protected abstract void $action.name$($action.allParameter:{ param | $param.type.name$ arg }; separator=", "$); }; separator="\n"$
	  
	    public void notifyReceived(String eventName, Object arg, Device deviceInfo) { 
	        try {	
	       
	    $GUIdriver.allActions:{ action |
	   
	    if (eventName.equals("$action.name$")) {
	      
	      Logger.log( myDeviceInfo.getName() ,"$GUIdriver.name$" , "$action.name$ has been received");
	      
	      
	       $action.name$($action.allParameter:{ param | ($param.type.name$)arg }; separator=", "$);
	       
	      } 
	    }$
        
        $GUIdriver.allDataAccess:{ dataAccess |
       
        if (eventName.equals("$dataAccess.dataAccessName; format="capital"$Received")) {
				Logger.log(myDeviceInfo.getName(), "Proximity",
						"Notification Received Profile");

				onNew$dataAccess.dataAccessName; format="capital"$Received(($GUIdriver.struct$) arg);
		}
        }$
        
        
        	 } catch (Exception e) {
                 e.printStackTrace();
           }
        }
    
    $GUIdriver.allDataAccess:{ dataAccess |
		    
		public abstract void onNew$dataAccess.dataAccessName; format="capital"$Received($GUIdriver.struct$  arg);	   		
	   	public void subscribe$dataAccess.dataAccessName; format="capital"$() {
	   		    
	   				List<String> regionInfo = RegionSubscription.getSubscriptionRequest(
					partitionAttribute, myDeviceInfo.getRegionLabels(),
					myDeviceInfo.getRegion());
	   		
         			this.myPubSubMiddleware.subscribe(this,"$dataAccess.dataAccessName; format="capital"$Received", regionInfo);
		}
		    
		    
		}$
   
     $GUIdriver.allActions:{ action | 
      public void subscribe$action.name; format="capital"$() {
        
        List<String> regionInfo = RegionSubscription.getSubscriptionRequest(
        partitionAttribute, myDeviceInfo.getRegionLabels(),
        myDeviceInfo.getRegion());
        
           this.myPubSubMiddleware.subscribe(this,"$action.name$",regionInfo);
      }
    }$      
            
     $GUIdriver.allDataAccess:{ dataAccess |
		    protected void get$dataAccess.dataAccessName; format="capital"$($dataAccess.query.type.name; format="capital" $ arg) {
		    	 Logger.log(myDeviceInfo.getName(),"$GUIdriver.name$",
		     				"Sending command get$dataAccess.dataAccessName$");
		    	this.myPubSubMiddleware.publish("get$dataAccess.dataAccessName; format="capital"$", arg , myDeviceInfo );     
		    }
	}; separator="\n"$ 
            
     public void run() {  }
}
   

