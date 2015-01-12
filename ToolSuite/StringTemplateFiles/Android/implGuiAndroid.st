package $GUIdriver.deviceImplPackageName$;

import logic.*;
import framework.*;
import android.content.Context;


public class Android$GUIdriver.name$ implements I$GUIdriver.name$ {

	
	$GUIdriver.commands:{ command |
		  private Listener$GUIdriver.name$  listener$command.name$Command = null;    
 
  }; separator="\n"$

	public Android$GUIdriver.name$(Context context, Logic$GUIdriver.name$ obj) {
		
	}
	

	$GUIdriver.commands:{ command |
	
	   @Override
	   public void $command.name$GUI(Listener$GUIdriver.name$ handler){
	     listener$command.name$Command = handler;
	   }
 
  }; separator="\n"$

	
			
}