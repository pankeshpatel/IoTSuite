package framework;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import iotsuite.pubsubmiddleware.Subscriber;
import iotsuite.semanticmodel.Device;
import java.util.List;
import iotsuite.common.RegionSubscription;
import iotsuite.common.Logger;

public abstract class EndUserGUI implements Runnable, Subscriber {

	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	// private String partitionAttribute = "NoInstance";
	private String partitionAttribute = "Room";

	public EndUserGUI(PubSubMiddleware pubSubM, Device deviceInfo) {

		this.myPubSubMiddleware = pubSubM;
		this.myDeviceInfo = deviceInfo;
		postInitialize();

	}

	protected void postInitialize() {
		subscribeprofile();
	}

	public void OffFromGUI() {

		this.myPubSubMiddleware.publish("Off", null, myDeviceInfo);
	}

	public void SetTempFromGUI(TempStruct newValue) {

		this.myPubSubMiddleware.publish("SetTemp", newValue, myDeviceInfo);
	}

	public void profileRequest(String arg) {

		this.myPubSubMiddleware.publish("profileRequest", arg, myDeviceInfo);

	}

	public void notifyReceived(String eventName, Object arg, Device deviceInfo) {
		try {

			if (eventName.equals("profileResponse")) {
				Logger.log(myDeviceInfo.getName(), "EndUserGUI",
						"Notification Received Profile");
				onNewprofileResponse((TempStruct) arg);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
	}

	public abstract void onNewprofileResponse(TempStruct arg);

	public void subscribeprofile() {

		List<String> regionInfo = RegionSubscription.getSubscriptionRequest(
				partitionAttribute, myDeviceInfo.getRegionLabels(),
				myDeviceInfo.getRegion());
		this.myPubSubMiddleware.subscribe(this, "profileResponse", regionInfo);
	}

}