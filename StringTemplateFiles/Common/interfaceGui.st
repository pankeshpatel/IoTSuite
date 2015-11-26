package $GUIdriver.packageName$;

public abstract interface  I$GUIdriver.name$ {  
   
   $GUIdriver.commands:{ command |
    	
    	public abstract void $command.name$GUI(Listener$GUIdriver.name$ handler);
    	
    }; separator="\n"$
    
    
    $GUIdriver.allDataAccess:{ dataAccess | 
        public abstract void $dataAccess.dataAccessName; format="capital"$GUI(Listener$GUIdriver.name$ handler); 
    }; separator="\n"$
   
    
 }