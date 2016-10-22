package framework;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import iotsuite.pubsubmiddleware.Subscriber;
import iotsuite.semanticmodel.Device;
import java.util.List;
import iotsuite.common.Logger;
import java.util.ArrayList; 



public abstract class  EndUserApp implements Runnable, Subscriber  { 
  
  protected final PubSubMiddleware myPubSubMiddleware;
  protected final Device myDeviceInfo;
  
  
  public EndUserApp(PubSubMiddleware pubSubM, Device deviceInfo) {  
  
     this.myPubSubMiddleware = pubSubM;
     this.myDeviceInfo = deviceInfo;
    postInitialize();
    
    } 
    
    protected void postInitialize() {
      subscribeFireNotify();
     
     
  }

	
       
	
       public void notifyReceived(String eventName, Object arg) { 
          try {  
          
        

                  if(eventName.equals("FireNotify")){
                   Logger.log(myDeviceInfo.getName(), "EndUserApp", "Notification Received FireNotify");
                   onNewFireNotifyNotify((FireStateStruct) arg);
                  }         
                  
        
        
       
        
            
       } catch (Exception e) {
                 e.printStackTrace();
           }
        }       
     public void run() {  }
    
    
    

          
          public abstract void onNewFireNotifyNotify(FireStateStruct arg);
          
          public void subscribeFireNotify() {
         	 
         	 
            /* 
            List<String> regionInfo = new ArrayList<String>();
     		regionInfo.add("*");          
                */      
                    
              this.myPubSubMiddleware.subscribe(this,"FireNotify");
         } 
          
            
    
}