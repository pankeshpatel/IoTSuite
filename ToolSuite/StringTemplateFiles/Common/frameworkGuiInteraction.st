package $GUIdriver.packageName$;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import iotsuite.pubsubmiddleware.Subscriber;
import iotsuite.semanticmodel.Device;
import java.util.List;
import iotsuite.common.RegionSubscription;
import iotsuite.common.Logger;


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
     $GUIdriver.allDataAccess:{dataAccess | subscribe$dataAccess.dataAccessName; format="capital"$();}$
  }

	$GUIdriver.commands:{ command |
	public void $command.name; format="capital"$FromGUI($command.allParameter:{ param | $param.type.name$ newValue}; separator=" , "$) {

	   this.myPubSubMiddleware.publish("$command.name; format="capital"$", $if(command.Parameter)$ $command.allParameter: { param | newValue }; separator=" , "$ $else$ null $endif$,
					myDeviceInfo);
		}	
	}; separator="\n"$
	
	    $GUIdriver.allDataAccess:{ dataAccess |
	       
	       public void  $dataAccess.dataAccessName; format="capital"$Request(String arg) {
       
        this.myPubSubMiddleware.publish( "$dataAccess.dataAccessName; format="capital"$Request", arg, myDeviceInfo); 
        
        }
       }$
	     
	     
	
       public void notifyReceived(String eventName, Object arg, Device deviceInfo) { 
          try {  
          
      $GUIdriver.allDataAccess:{ dataAccess |
        if (eventName.equals("$dataAccess.dataAccessName; format="capital"$Response")) {
        Logger.log(myDeviceInfo.getName(), "$GUIdriver.name$", "Notification Received Profile");
        onNew$dataAccess.dataAccessName; format="capital"$Response(($GUIdriver.AllDataAccess:{ dataAcc |$dataAcc.GeneratedInfo.type$}$) arg);
        }
        }$    
       } catch (Exception e) {
                 e.printStackTrace();
           }
        }           
     public void run() {  }
        
        
          
    
    $GUIdriver.allDataAccess:{ dataAccess |
        
    public abstract void onNew$dataAccess.dataAccessName; format="capital"$Response($GUIdriver.AllDataAccess:{ dataAcc |$dataAcc.GeneratedInfo.type$}$ arg);       
      public void subscribe$dataAccess.dataAccessName; format="capital"$() {
            
      List<String> regionInfo = RegionSubscription.getSubscriptionRequest(partitionAttribute, 
               myDeviceInfo.getRegionLabels(), myDeviceInfo.getRegion());
         this.myPubSubMiddleware.subscribe(this,"$dataAccess.dataAccessName; format="capital"$Response", regionInfo);
    }
        
        
    }$
}
   

