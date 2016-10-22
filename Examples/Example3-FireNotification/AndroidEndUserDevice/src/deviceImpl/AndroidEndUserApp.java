package deviceImpl;

import com.example.android.R;

import logic.*;
import framework.*;
import android.content.Context;
import android.widget.TextView;
import android.app.Activity;
import iotsuite.android.localmiddleware.IDataListener;
import iotsuite.android.localmiddleware.PubSubsSensingFramework;

public class AndroidEndUserApp implements IEndUserApp, IDataListener {
	public static PubSubsSensingFramework pubSubSensingFramework;
	private Context appContext;
	public static Activity appActivity;
	public static String txtDisplay;
	
	public AndroidEndUserApp(Context context, LogicEndUserApp obj) {
		this.appContext = context;
		appActivity = (Activity) appContext;
		pubSubSensingFramework = PubSubsSensingFramework.getInstance();
		pubSubSensingFramework.registerForSensorData(this, "fireNotifyNotify");
		}

	@Override
	public void onDataReceived(String eventName, Object data) {
		// Developer connects UI element with generated framework 
		if (eventName.equals("fireNotifyNotify")) {
			
			TextView tv = (TextView) AndroidEndUserApp.appActivity
					.findViewById(R.id.textView1);
			tv.setText("Fire has been occured");
		}
	}
}