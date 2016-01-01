package $GUIdriver.packageName$;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import iotsuite.pubsubmiddleware.Subscriber;
import iotsuite.semanticmodel.Device;
import java.util.List;
import iotsuite.common.Logger;
import java.util.ArrayList; 



public abstract class  $GUIdriver.name$ implements Runnable, Subscriber  { 
  
  protected final PubSubMiddleware myPubSubMiddleware;
  protected final Device myDeviceInfo;
  
  
  public $GUIdriver.name$(PubSubMiddleware pubSubM, Device deviceInfo) {  
  
     this.myPubSubMiddleware = pubSubM;
     this.myDeviceInfo = deviceInfo;
    postInitialize();
    
    } 
    
    protected void postInitialize() {
     $GUIdriver.allDataAccess:{dataAccess | subscribe$dataAccess.dataAccessName; format="capital"$();}$
      $GUIdriver.allNotifyMeasurement:{notifyMeasurement | subscribe$notifyMeasurement; format="capital"$();}$
     
     
  }

	$GUIdriver.commands:{ command |
	public void $command.name; format="capital"$FromGUI($command.allParameter:{ param | $param.type$ newValue}; separator=" , "$) {

	   this.myPubSubMiddleware.publish("$command.name; format="capital"$", $if(command.Parameter)$ $command.allParameter: { param | newValue }; separator=" , "$ $else$ null $endif$);
		}	
	}; separator="\n"$
	
	    $GUIdriver.allDataAccess:{ dataAccess |
	       
	       public void  $dataAccess.dataAccessName; format="capital"$Request(String arg) {
       
        this.myPubSubMiddleware.publish( "get$dataAccess.dataAccessName$", arg); 
        
        }
       }$
       
	
       public void notifyReceived(String eventName, Object arg) { 
          try {  
          
      $GUIdriver.allDataAccess:{ dataAccess |
        if (eventName.equals("$dataAccess.dataAccessName; format="avoidCapital"$")) {
        Logger.log(myDeviceInfo.getName(), "$GUIdriver.name$", "Notification Received $dataAccess.dataAccessName; format="capital"$");
        onNew$dataAccess.dataAccessName; format="capital"$Response(($GUIdriver.AllDataAccess:{ dataAcc |$dataAcc.GeneratedInfo.type$}$) arg);
        }
        }$
        
         $GUIdriver.allNotifyMeasurement:{notifyMeasurement | 
         if(eventName.equals("$notifyMeasurement; format="capital"$")){
          Logger.log(myDeviceInfo.getName(), "$GUIdriver.name$", "Notification Received $notifyMeasurement; format="capital"$");
          onNew$notifyMeasurement; format="capital"$Notify(($GUIdriver.AllNotifyStructName:{ notifyStructName |$notifyStructName$}$) arg);
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
            
     
               
        /* List<String> regionInfo = new ArrayList<String>(); 
	   regionInfo.add("*"); */ 
       this.myPubSubMiddleware.subscribe(this,"$dataAccess.dataAccessName; format="avoidCapital"$");
    }       
    }$
    
    
     $GUIdriver.allNotifyMeasurement:{notifyMeasurement | 
     
     public abstract void onNew$notifyMeasurement; format="capital"$Notify($GUIdriver.AllNotifyStructName:{ notifyStructName |$notifyStructName$}$ arg);
     
     public void subscribe$notifyMeasurement; format="capital"$() {
    	 
    	 
       /* 
       List<String> regionInfo = new ArrayList<String>();
		regionInfo.add("*");          
           */      
               
         this.myPubSubMiddleware.subscribe(this,"$notifyMeasurement; format="capital"$");
    } 
     
    }$   
    
}
   

