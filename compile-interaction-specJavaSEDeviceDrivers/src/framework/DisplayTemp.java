package framework;

import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;
import java.util.List;
import java.util.ArrayList;

public abstract class  DisplayTemp implements Runnable, Subscriber  {	
	
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	
	
	public DisplayTemp(PubSubMiddleware pubSubM, Device deviceInfo) {  
	
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
		postInitialize();		
    } 
    
    protected void postInitialize() {
      subscribeDisplayTemp();   
    
    }


	
    protected abstract void DisplayTemp(TempStruct arg ); 
	
    public void notifyReceived(String methodName, Object arg, Device deviceInfo) { 

        if (methodName.equals("DisplayTemp") ) { 
        	Logger.log( myDeviceInfo.getName() ,"DisplayTemp" , "DisplayTemp has been received");      	
    		   DisplayTemp((TempStruct)arg );		   
          } 
        
    }
   

         	public void subscribeDisplayTemp() {					
     	    List<String> regionInfo = new ArrayList<String>(); 
     		regionInfo.add("*");				
             this.myPubSubMiddleware.subscribe(this,"DisplayTemp",regionInfo); 
        		}
           		
   		  		
   	 public void run() {  }
}	
