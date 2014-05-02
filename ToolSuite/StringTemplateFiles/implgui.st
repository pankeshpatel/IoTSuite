package $GUIdriver.deviceImplPackageName$;

import logic.*;


//TODO : Developers should  uncomment the following line for Android.


//import com.example.android.R;

import framework.*;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Impl$GUIdriver.name$ extends Dialog implements I$GUIdriver.name$ {

	Fake$GUIdriver.name$ fn;

	public Impl$GUIdriver.name$(Context context, Fake$GUIdriver.name$ obj) {
		super(context);
		this.fn = (Fake$GUIdriver.name$) obj;
	}

	$GUIdriver.allActions:{ action | 
		
		TextView $action.control$;
	
	};separator="\n"  $ 
	
	$GUIdriver.commands:{ command |
	
		$command.widget.textboxs:{ textbox | EditText  $textbox$; }; seperator="\n"$
		$command.widget.buttons:{ button | Button $button$; }; seperator="\n"$		

	};separator="\n"$
			
	$GUIdriver.reqWidgets:{ reqWidget | 
		
		EditText $reqWidget.textbox$ ;
		Button $reqWidget.button$;
		TextView $reqWidget.textview$;
		
	
	};separator="\n"$ 
    
	public void onCreate(Bundle savedInstanceState) {
		
		//TODO : Developers should  uncomment the following line for Android.
		
		//setContentView(R.layout.$GUIdriver.lowerName$layout);
		super.onCreate(savedInstanceState);

		$GUIdriver.allActions:{ action | 
			
			//TODO : Developers should  uncomment the following line for Android.
		
			//$action.control$ = (TextView) findViewById(R.id.$action.control$View);
		
		};separator="\n"$ 
		
		$GUIdriver.commands:{ command |
			
			//TODO : Developers should  uncomment the following line for Android.
		
			//$command.widget.textboxs:{ textbox | $textbox$ = (EditText)findViewById(R.id.$textbox$View);};separator="\n"$
			//$command.widget.buttons:{ button | $button$ = (Button) findViewById(R.id.$button$View);};separator="\n"$

			$command.widget.buttons:{ button | $button$.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {

					$command.name$GUI();
				}
			});
			};separator="\n"$
		
		};separator="\n"$
				
		$GUIdriver.reqWidgets:{ reqWidget | 
		
			//TODO : Developers should  uncomment the following line for Android.

			//$reqWidget.textview$ = (EditText)findViewById(R.id.$reqWidget.textview$View);
			//$reqWidget.button$ = (Button) findViewById(R.id.$reqWidget.button$View);
			//$reqWidget.textview$ = (TextView) findViewById(R.id.$reqWidget.textview$View);
			
			$reqWidget.button$.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {

					RequestGUI();
				}
			});
			
		};separator="\n"$

	}
	
	$GUIdriver.allActions:{ action | 
	    
		@Override
		public void $action.name$GUI($action.allParameter:{ param | $param.type.name$ arg }; separator=", "$)
		{
			//text.setText((String)arg.);
	
	    }
	
	}; separator="\n"$

	$GUIdriver.commands:{ command |
			
		@Override
		public void $command.name$GUI() {
		
		     //TODO : Developers should  uncomment the following line for Android and write an appropriate application logic
		     
			//fn.$command.name; format="capital"$FromGUI($command.widget.textboxs:{ textbox | new TempStruct( $textbox$.getText().toString() , "C")}; separator=", "$);
		}
	
	}; separator="\n"$
			
}