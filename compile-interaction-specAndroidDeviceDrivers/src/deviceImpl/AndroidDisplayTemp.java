package deviceImpl;

import iotsuite.android.localmiddleware.IDataListener;
import iotsuite.android.localmiddleware.PubSubsSensingFramework;
import android.app.Activity;
import framework.*;

import logic.*;
import android.os.Bundle;



public class AndroidDisplayTemp extends Activity implements IDisplayTemp, IDataListener {

	private PubSubsSensingFramework pubSubSensingFramework = null;

	// Device Developer has to update manifest file.
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		
		pubSubSensingFramework = PubSubsSensingFramework.getInstance();

		  
				  
				pubSubSensingFramework.registerForSensorData(this,"DisplayTemp"); 
			   
}   

    
    
    @Override
    public void DisplayTemp(TempStruct arg ) {
     
     } 
      
      
   
	@Override
	public void onDataReceived(String eventName, Object data) {
		System.out.println("Received Data");

	}
 
}