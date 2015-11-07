package framework;

public abstract class  ListenerSmartHomeApp  { 


 
       
          
          public abstract void onNewOffCommand();
         
         
       
       
          
          public abstract void onNewSetTempCommand(TempStruct newValue);
         
         
       
  
  

        public abstract void onNewProfileRequest(String request); 
    
  
      
}