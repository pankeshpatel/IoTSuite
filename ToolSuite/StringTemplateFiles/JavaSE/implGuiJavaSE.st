package $GUIdriver.deviceImplPackageName$;

import logic.*;
import framework.*;
import android.content.Context;


public class JavaSE$GUIdriver.name$ implements I$GUIdriver.name$ {

	
	$GUIdriver.commands:{ command |
		  private Listener$GUIdriver.name$  listener$command.name$Command = null;    
 
  }; separator="\n"$
  
   $GUIdriver.allDataAccess:{ dataAccess |
          private Listener$GUIdriver.name$  listener$dataAccess.dataAccessName; format="capital"$Request = null;
        
           
    }$
  
  

	public JavaSE$GUIdriver.name$(Context context, Logic$GUIdriver.name$ obj) {
		
	}
	

	$GUIdriver.commands:{ command |
	
	   @Override
	   public void $command.name$GUI(Listener$GUIdriver.name$ handler){
	     listener$command.name$Command = handler;
	   }
 
  }; separator="\n"$
  
    $GUIdriver.allDataAccess:{ dataAccess |
         @Override
         public void $dataAccess.dataAccessName; format="capital"$GUI(Listener$GUIdriver.name$ handler) {
              listener$dataAccess.dataAccessName; format="capital"$Request = handler; 
         }    
    }$
    
     $GUIdriver.allDataAccess:{ dataAccess |
         public void $dataAccess.dataAccessName; format="capital"$ResponseReceived($GUIdriver.AllDataAccess:{ dataAcc |$dataAcc.GeneratedInfo.type$}$ response){
         
         }  
    }$
    
    

	
			
}