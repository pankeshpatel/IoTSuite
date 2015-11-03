package $CS.packageName$;
import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;
import java.util.List;
import java.util.ArrayList;


public abstract class  $CS.name$ implements Subscriber, Runnable{ 
			
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	
	
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
    protected  void $action.name; format="capital"$($action.allParameter:{ param | $param.type$ arg }; separator=" , "$) {
  	    Logger.log( myDeviceInfo.getName() ,"$CS.name$" , "Sending command $action.name$");
    	this.myPubSubMiddleware.publish("$action.name; format="capital"$", $if(action.Parameter)$ $action.allParameter: { param | arg }; separator=" , "$ $else$ null $endif$ , myDeviceInfo );     
    }
}; separator="\n"$	
		

    $CS.allGeneratedInfo:{ generatedInfo |
    private $generatedInfo.type$ $generatedInfo.name; format="avoidCapital"$;
    protected void set$generatedInfo.name; format="avoidCapital"$( $generatedInfo.type$ newValue) {
     
      if ($generatedInfo.name; format="avoidCapital"$ != newValue) {
        $generatedInfo.name; format="avoidCapital"$ = newValue; 
        
        Logger.log(myDeviceInfo.getName(),"$CS.name$", "Publishing $generatedInfo.name$");     
     
        this.myPubSubMiddleware.publish("$generatedInfo.name; format="avoidCapital"$", newValue, myDeviceInfo);		
       
      }
    } 
    /*   
    protected  $generatedInfo.type$ get$generatedInfo.name; format="capital"$() {
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
          
           onNew$consumedInfo.name$(($consumedInfo.type$) arg); 
           
         //  onNew$consumedInfo.name; format="capital"$Received(($CS.allConsumedInfo:{ consumedInfo | $consumedInfo.type$}$) arg);
        }
        }$  
          
         $CS.allDataAccess:{ dataAccess |
        if (eventName.equals("$dataAccess.dataAccessName; format="avoidCapital"$")) {
        Logger.log(myDeviceInfo.getName(), "Proximity",
            "Notification Received Profile");

        onNew$dataAccess.dataAccessName; format="avoidCapital"$Received(( $CS.allGeneratedInfo:{ generatedInfo |$generatedInfo.type$}; separator="\n"$) arg);
       }
        }$        
        
        	 } catch (Exception e) {
                 e.printStackTrace();
           }
        }
	  
	    $CS.allConsumedInfo:{ consumedInfo | 
	   
	    public abstract void onNew$consumedInfo.name$($consumedInfo.type$ arg);	   		
	  
	   
	   	public void subscribe$consumedInfo.name; format="capital"$() {
	   		    
	   		
					
			List<String> regionInfo = new ArrayList<String>(); 
			regionInfo.add("*");	
				
	   		this.myPubSubMiddleware.subscribe(this,"$consumedInfo.name$", regionInfo);
		}
		}$ 	
		
		$CS.allDataAccess:{ dataAccess |
		    
		public abstract void onNew$dataAccess.dataAccessName; format="avoidCapital"$Received($CS.allGeneratedInfo:{ generatedInfo |$generatedInfo.type$}$  arg);	   		
	   	public void subscribe$dataAccess.dataAccessName; format="capital"$() {
	   		    
	   	
					
			List<String> regionInfo = new ArrayList<String>(); 
			regionInfo.add("*");					
		    this.myPubSubMiddleware.subscribe(this,"$dataAccess.dataAccessName; format="avoidCapital"$", regionInfo);
		}
		    
		    
		}$
		
		public void run() {	
		}	
        
		$CS.allDataAccess:{ dataAccess |
		    protected void get$dataAccess.dataAccessName; format="avoidCapital"$($dataAccess.query.type; format="capital" $ arg) {
		    	 Logger.log(myDeviceInfo.getName(),"$CS.name$",
		     				"Sending command get$dataAccess.dataAccessName$");
		    	this.myPubSubMiddleware.publish("get$dataAccess.dataAccessName; format="avoidCapital"$", arg , myDeviceInfo );     
		    }
		}; separator="\n"$ 
}
