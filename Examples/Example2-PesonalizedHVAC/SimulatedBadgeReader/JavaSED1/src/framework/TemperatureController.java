package framework;

import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;
import java.util.List;

public abstract class TemperatureController implements Subscriber, Runnable {

	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	private String partitionAttribute = "Room";

	public TemperatureController(PubSubMiddleware pubSubM, Device deviceInfo) {

		this.myPubSubMiddleware = pubSubM;
		this.myDeviceInfo = deviceInfo;
		postInitialize();
	}

	protected void postInitialize() {
		subscribetempPref();

	}

	protected void Off() {
		Logger.log(myDeviceInfo.getName(), "TemperatureController",
				"Sending command Off");
		this.myPubSubMiddleware.publish("Off", null, myDeviceInfo);
	}

	protected void SetTemp(TempStruct arg) {
		Logger.log(myDeviceInfo.getName(), "TemperatureController",
				"Sending command SetTemp");
		this.myPubSubMiddleware.publish("SetTemp", arg, myDeviceInfo);
	}

	public void notifyReceived(String eventName, Object arg, Device deviceInfo) {
		try {

			if (eventName.equals("tempPref")) {
				Logger.log(myDeviceInfo.getName(), "TemperatureController",
						"Notification Received tempPref");

				onNewtempPref((TempStruct) arg);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public abstract void onNewtempPref(TempStruct arg);

	public void subscribetempPref() {

		List<String> regionInfo = RegionSubscription.getSubscriptionRequest(
				partitionAttribute, myDeviceInfo.getRegionLabels(),
				myDeviceInfo.getRegion());

		this.myPubSubMiddleware.subscribe(this, "tempPref", regionInfo);
	}

	public void run() {
	}

}