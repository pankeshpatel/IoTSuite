package $SensorDriver.deviceImplPackageName$;

import android.app.Service;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.IBinder;

public class Android$SensorDriver.name$Service extends Service {

	public final static String broadcastFilter = "$SensorDriver.name$";
	final Intent broadcastIntent = new Intent(broadcastFilter);

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}

	@Override
	public void onCreate() {

		// TODO The developer should write specific Sensor code

	}

	SensorEventListener $SensorDriver.name$EventListener = new SensorEventListener() {
		public void onAccuracyChanged(Sensor sensor, int accuracy) {
			// TODO Auto-generated method stub
		}

		@Override
		public void onSensorChanged(SensorEvent event) {
			
			
		}
	};

}
