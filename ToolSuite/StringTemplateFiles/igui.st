package $GUIdriver.packageName$;

public abstract interface  I$GUIdriver.name$ {  
   
    $GUIdriver.allActions:{ action | 
    
    	public abstract void $action.name$GUI($action.allParameter:{ param | $param.type.name$ arg }; 
    
    separator=", "$); 
    
    }; separator="\n"$
    
    $GUIdriver.commands:{ command |
    	
    	public abstract void $command.name$GUI();
    	
    }; separator="\n"$
    
 }