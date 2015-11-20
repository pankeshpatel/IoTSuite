package framework;

public abstract class  Listener$GUIdriver.name$  { 


 
     $GUIdriver.commands:{ command |   
     
     public abstract void onNew$command.name; format="capital"$Command($command.allParameter:{ param | $param.type$ newValue}; separator=" , "$);
    
    
  }; separator="\n"$
  
  
  $GUIdriver.allDataAccess:{ dataAccess | 
      public abstract void onNew$dataAccess.dataAccessName; format="capital"$Request(String request); 
  }; separator="\n"$
  
      
}