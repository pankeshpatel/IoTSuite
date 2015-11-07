package framework;
import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;
import java.util.List;
import java.util.ArrayList;


public abstract class  Proximity implements Subscriber, Runnable{ 
			
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	
	
	public Proximity(PubSubMiddleware pubSubM, Device deviceInfo) {   
		
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
    		  postInitialize();
    } 
	
	protected void postInitialize() {
      subscribeBadgeDisappeared(); 
          subscribeBadgeDetected(); 
           
    subscribeProfile();
        
    }
    
		
	
		


        private TempStruct tempPref;
        protected void settempPref( TempStruct newValue) {
         
          if (tempPref != newValue) {
            tempPref = newValue; 
            
            Logger.log(myDeviceInfo.getName(),"Proximity", "Publishing tempPref");     
         
            this.myPubSubMiddleware.publish("tempPref", newValue, myDeviceInfo);		
           
          }
        } 
        /*   
        protected  TempStruct getTempPref() {
          return  tempPref;
        } */
           

		

        
        public void notifyReceived(String eventName, Object arg, Device deviceInfo) { 
        try {	
        

                      if (eventName.equals("badgeDisappeared"))  
                     { 
                    Logger.log(myDeviceInfo.getName(),"Proximity",
                     "Notification Received badgeDisappeared");
                   
                    onNewbadgeDisappeared((BadgeStruct) arg); 
                    
                  //  onNewBadgeDisappearedReceived((BadgeStructBadgeStruct) arg);
                 }
                 
                      if (eventName.equals("badgeDetected"))  
                     { 
                    Logger.log(myDeviceInfo.getName(),"Proximity",
                     "Notification Received badgeDetected");
                   
                    onNewbadgeDetected((BadgeStruct) arg); 
                    
                  //  onNewBadgeDetectedReceived((BadgeStructBadgeStruct) arg);
                 }
                   
          

                 if (eventName.equals("profile")) {
                 Logger.log(myDeviceInfo.getName(), "Proximity",
                     "Notification Received Profile");

                 onNewprofileReceived(( TempStruct) arg);
                }
                         
        
        	 } catch (Exception e) {
                 e.printStackTrace();
           }
        }
	  

	    	   
	    	    public abstract void onNewbadgeDisappeared(BadgeStruct arg);	   		
	    	  
	    	   
	    	   	public void subscribeBadgeDisappeared() {
	    	   		    
	    	   		
	    					
	    			List<String> regionInfo = new ArrayList<String>(); 
	    			regionInfo.add("*");	
	    				
	    	   		this.myPubSubMiddleware.subscribe(this,"badgeDisappeared", regionInfo);
	    		}
	    		
	    	   
	    	    public abstract void onNewbadgeDetected(BadgeStruct arg);	   		
	    	  
	    	   
	    	   	public void subscribeBadgeDetected() {
	    	   		    
	    	   		
	    					
	    			List<String> regionInfo = new ArrayList<String>(); 
	    			regionInfo.add("*");	
	    				
	    	   		this.myPubSubMiddleware.subscribe(this,"badgeDetected", regionInfo);
	    		}
	    		 	
		

				    
				public abstract void onNewprofileReceived(TempStruct  arg);	   		
			   	public void subscribeProfile() {
			   		    
			   	
							
					List<String> regionInfo = new ArrayList<String>(); 
					regionInfo.add("*");					
				    this.myPubSubMiddleware.subscribe(this,"profile", regionInfo);
				}
				    
				    
				
		
		public void run() {	
		}	
        

				    protected void getprofile(String arg) {
				    	 Logger.log(myDeviceInfo.getName(),"Proximity",
				     				"Sending command getprofile");
				    	this.myPubSubMiddleware.publish("getprofile", arg , myDeviceInfo );     
				    }
				 
}