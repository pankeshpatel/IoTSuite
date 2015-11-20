package $Actuatordriver.factoryDeviceImplActuator$;

import iotsuite.android.localmiddleware.IDataListener;
import iotsuite.android.localmiddleware.PubSubsSensingFramework;
import android.app.Activity;
import framework.*;

import logic.*;
import android.os.Bundle;



public class Android$Actuatordriver.name$ extends Activity implements I$Actuatordriver.name$, IDataListener {

	private PubSubsSensingFramework pubSubSensingFramework = null;

	// Device Developer has to update manifest file.
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		
		pubSubSensingFramework = PubSubsSensingFramework.getInstance();

		$Actuatordriver.allActions:{ action |   
		  
		pubSubSensingFramework.registerForSensorData(this,"$action.name$"); 
	  }; separator="\n"$ 
}   

  $Actuatordriver.allActions:{ action |   
  
  @Override
  public void $action.name$($action.allParameter:{ param | $param.type$ arg }; 
   separator=", "$) {
   
   } 
    
   }; separator="\n"$ 
   
	@Override
	public void onDataReceived(String eventName, Object data) {
		System.out.println("Received Data");

	}
 
}


