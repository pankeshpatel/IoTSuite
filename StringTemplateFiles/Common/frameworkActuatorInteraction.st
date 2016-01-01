package $Actuatordriver.packageName$;

import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;
import java.util.List;
import java.util.ArrayList;

public abstract class  $Actuatordriver.name$ implements Runnable, Subscriber  {	
	
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	
	
	public $Actuatordriver.name$(PubSubMiddleware pubSubM, Device deviceInfo) {  
	
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
		postInitialize();		
    } 
    
    protected void postInitialize() {
      $Actuatordriver.allActions:{action |subscribe$action.name; format="capital"$();}$   
    
    }


	
    $Actuatordriver.allActions:{ action | protected abstract void $action.name$($action.allParameter:{ param | $param.type$ arg }; separator=", "$); }; separator="\n"$
	
    public void notifyReceived(String methodName, Object arg) { 
    $Actuatordriver.allActions:{ action |
    if (methodName.equals("$action.name$") ) { 
    	Logger.log( myDeviceInfo.getName() ,"$Actuatordriver.name$" , "$action.name$ has been received");      	
		   $action.name$($action.allParameter:{ param | ($param.type$)arg }; separator=", "$);		   
      } 
    }$
    }
   
     $Actuatordriver.allActions:{ action | 
    	public void subscribe$action.name; format="capital"$() {					
	    /* List<String> regionInfo = new ArrayList<String>(); 
		regionInfo.add("*"); */ 				
        this.myPubSubMiddleware.subscribe(this,"$action.name$"); 
   		}
    }$  		
   		  		
   	 public void run() {  }
}	
	 $if(Actuatordriver.generatedInfo)$
     
    $Actuatordriver.allGeneratedInfo:{ generatedInfo |
    private $generatedInfo.type$ $generatedInfo.name; format="avoidCapital"$;
	
	
    protected void set$generatedInfo.name; format="capital"$( $generatedInfo.type$ newValue) {
      if ($generatedInfo.name; format="avoidCapital"$ != newValue) {
        $generatedInfo.name; format="avoidCapital"$ = newValue; 
        this.myPubSubMiddleware.publish();
		}
    }    
    public  $generatedInfo.type$ get$generatedInfo.name; format="capital"$() {
      return  $generatedInfo.name; format="avoidCapital"$;
    }    	
   
}; separator="\n"$  $endif$
     
    
