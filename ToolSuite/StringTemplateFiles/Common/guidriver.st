package $GUIdriver.packageName$;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import iotsuite.pubsubmiddleware.Subscriber;
import iotsuite.semanticmodel.Device;


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
    
    }

	$GUIdriver.commands:{ command |
	public void $command.name; format="capital"$FromGUI($command.allParameter:{ param | $param.type.name$ newValue}; separator=" , "$) {

	   this.myPubSubMiddleware.publish("$command.name; format="capital"$", $if(command.Parameter)$ $command.allParameter: { param | newValue }; separator=" , "$ $else$ null $endif$,
					myDeviceInfo);
		}	
	}; separator="\n"$
	
       public void notifyReceived(String eventName, Object arg, Device deviceInfo) { 
          try {      
         
           } catch (Exception e) {
                 e.printStackTrace();
           }
        }           
     public void run() {  }
}
   

