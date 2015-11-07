package framework;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import iotsuite.pubsubmiddleware.Subscriber;
import iotsuite.semanticmodel.Device;
import java.util.List;
import iotsuite.common.Logger;
import java.util.ArrayList; 



public abstract class  SmartHomeApp implements Runnable, Subscriber  { 
  
  protected final PubSubMiddleware myPubSubMiddleware;
  protected final Device myDeviceInfo;
  
  
  public SmartHomeApp(PubSubMiddleware pubSubM, Device deviceInfo) {  
  
     this.myPubSubMiddleware = pubSubM;
     this.myDeviceInfo = deviceInfo;
    postInitialize();
    
    } 
    
    protected void postInitialize() {
     subscribeProfile();
      subscribeDisplayTemp();
     
     
  }


		public void OffFromGUI() {

		   this.myPubSubMiddleware.publish("Off",  null ,
						myDeviceInfo);
			}	
		

		public void SetTempFromGUI(TempStruct newValue) {

		   this.myPubSubMiddleware.publish("SetTemp",  newValue  ,
						myDeviceInfo);
			}	
		
	

	    	       
	    	       public void  ProfileRequest(String arg) {
	           
	            this.myPubSubMiddleware.publish( "getprofile", arg, myDeviceInfo); 
	            
	            }
	           
       
	
       public void notifyReceived(String eventName, Object arg, Device deviceInfo) { 
          try {  
          

              if (eventName.equals("profile")) {
              Logger.log(myDeviceInfo.getName(), "SmartHomeApp", "Notification Received Profile");
              onNewProfileResponse((TempStruct) arg);
              }
              
        

                  if(eventName.equals("DisplayTemp")){
                   Logger.log(myDeviceInfo.getName(), "SmartHomeApp", "Notification Received DisplayTemp");
                   onNewDisplayTempNotify((TempStruct) arg);
                  }         
                  
        
        
       
        
            
       } catch (Exception e) {
                 e.printStackTrace();
           }
        }       
     public void run() {  }
    

            
        public abstract void onNewProfileResponse(TempStruct arg);       
          public void subscribeProfile() {
                
         
                   
           List<String> regionInfo = new ArrayList<String>(); 
    	   regionInfo.add("*");
           this.myPubSubMiddleware.subscribe(this,"profile", regionInfo);
        }       
        
    
    

          
          public abstract void onNewDisplayTempNotify(TempStruct arg);
          
          public void subscribeDisplayTemp() {
         	 
         	 
            
            List<String> regionInfo = new ArrayList<String>();
     		regionInfo.add("*");          
                    
                    
              this.myPubSubMiddleware.subscribe(this,"DisplayTemp", regionInfo);
         } 
          
            
    
}