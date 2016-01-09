package $CS.packageName$;
import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;
import java.util.List;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public abstract class  $CS.name$ implements Subscriber, Runnable{ 
			
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	Gson gson = new Gson();
  	
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
  	    $action.allParameter:{ param |  String data = gson.toJson(arg);}; separator=","$
  	    
  	    
    	this.myPubSubMiddleware.publish("$action.name; format="capital"$", $if(action.Parameter)$ $action.allParameter: { param | data }; separator=" , "$ $else$ null $endif$);     
    }
}; separator="\n"$	
		

    $CS.allGeneratedInfo:{ generatedInfo |
    private $generatedInfo.type$ $generatedInfo.name; format="avoidCapital"$;
    protected void set$generatedInfo.name; format="avoidCapital"$( $generatedInfo.type$ newValue) {
     
      if ($generatedInfo.name; format="avoidCapital"$ != newValue) {
        $generatedInfo.name; format="avoidCapital"$ = newValue; 
        
        Logger.log(myDeviceInfo.getName(),"$CS.name$", "Publishing $generatedInfo.name$");     
        String data = gson.toJson(newValue);
        this.myPubSubMiddleware.publish("$generatedInfo.name; format="avoidCapital"$", data);		
       
      }
    } 
    /*   
    protected  $generatedInfo.type$ get$generatedInfo.name; format="capital"$() {
      return  $generatedInfo.name; format="avoidCapital"$;
    } */
       
}; separator="\n"$
		

        
        public void notifyReceived(String eventName, Object arg) { 
        try {	
        
         $CS.allConsumedInfo:{ consumedInfo | 
             if (eventName.equals("$consumedInfo.name$"))  
            { 
           Logger.log(myDeviceInfo.getName(),"$CS.name$",
            "Notification Received $consumedInfo.name$");
            JsonObject jsonObject = new JsonParser().parse(arg.toString()).getAsJsonObject();
            $CS.allConsumeInfoFields:{ consumeInfoField |
          
            $consumeInfoField.consumeInfoStructFieldType$ $consumeInfoField.consumeInfoStructField$  =jsonObject.get("$consumeInfoField.consumeInfoStructField$").getAs$consumeInfoField.consumeInfoStructFieldType;format="capital"$();
          
          }; separator="\n"$ 
          
          $consumedInfo.type$ $consumedInfo.type;format="avoidCapital"$ = new $consumedInfo.type$(
           $CS.allConsumeInfoFields:{ consumeInfoField |
           $consumeInfoField.consumeInfoStructField$
          }; separator=","$); 
           onNew$consumedInfo.name$(($consumedInfo.type$) $consumedInfo.type;format="avoidCapital"$); 
           
         //  onNew$consumedInfo.name; format="capital"$Received(($CS.allConsumedInfo:{ consumedInfo | $consumedInfo.type$}$) arg);
        }
        }$  
          
         $CS.allDataAccess:{ dataAccess |
        if (eventName.equals("$dataAccess.dataAccessName; format="avoidCapital"$")) {
        Logger.log(myDeviceInfo.getName(), "Proximity",
            "Notification Received Profile");
             JsonObject jsonObject = new JsonParser().parse(arg.toString()).getAsJsonObject();
              $CS.allConsumeInfoFieldsForStorage:{ consumeInfoFieldForStorage |
          
            $consumeInfoFieldForStorage.consumeInfoStructFieldType$ $consumeInfoFieldForStorage.consumeInfoStructField$  =jsonObject.get("$consumeInfoFieldForStorage.consumeInfoStructField$").getAs$consumeInfoFieldForStorage.consumeInfoStructFieldType;format="capital"$();
          
          }; separator="\n"$ 
          
         $CS.allGeneratedInfo:{ generatedInfo |
         
         $generatedInfo.type$ $generatedInfo.type;format="avoidCapital"$ = new $generatedInfo.type$( $CS.allConsumeInfoFieldsForStorage:{ consumeInfoFieldForStorage |
         $consumeInfoFieldForStorage.consumeInfoStructField$};separator=","$
         );
         };separator="\n"$
          
        onNew$dataAccess.dataAccessName; format="avoidCapital"$Received( $CS.allGeneratedInfo:{ generatedInfo |($generatedInfo.type$) $generatedInfo.type;format="avoidCapital"$};separator="\n"$);
       }
        }$        
        
        	 } catch (Exception e) {
                 e.printStackTrace();
           }
        }
	  
	    $CS.allConsumedInfo:{ consumedInfo | 
	   
	    public abstract void onNew$consumedInfo.name$($consumedInfo.type$ arg);	   		
	  
	   
	   	public void subscribe$consumedInfo.name; format="capital"$() {
	   		    
	   		
					
		/*	List<String> regionInfo = new ArrayList<String>(); 
			regionInfo.add("*"); */  	
				
	   		this.myPubSubMiddleware.subscribe(this,"$consumedInfo.name$");
		}
		}$ 	
		
		$CS.allDataAccess:{ dataAccess |
		    
		public abstract void onNew$dataAccess.dataAccessName; format="avoidCapital"$Received($CS.allGeneratedInfo:{ generatedInfo |$generatedInfo.type$}$  arg);	   		
	   	public void subscribe$dataAccess.dataAccessName; format="capital"$() {
	  			
			 /* List<String> regionInfo = new ArrayList<String>(); 
			regionInfo.add("*"); */ 					
		    this.myPubSubMiddleware.subscribe(this,"$dataAccess.dataAccessName; format="avoidCapital"$");
		}
		    
		    
		}$
		
		public void run() {	
		}	
        
		$CS.allDataAccess:{ dataAccess |
		    protected void get$dataAccess.dataAccessName; format="avoidCapital"$($dataAccess.query.type; format="capital" $ arg) {
		    	 Logger.log(myDeviceInfo.getName(),"$CS.name$",
		     				"Sending command get$dataAccess.dataAccessName$");
		    	this.myPubSubMiddleware.publish("get$dataAccess.dataAccessName; format="avoidCapital"$", arg );     
		    }
		}; separator="\n"$ 
}
