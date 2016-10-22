package framework;

import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;
import java.util.List;

public abstract class RoomAvgTemp implements Subscriber, Runnable {

	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	private String partitionAttribute = "Room";

	public RoomAvgTemp(PubSubMiddleware pubSubM, Device deviceInfo) {

		this.myPubSubMiddleware = pubSubM;
		this.myDeviceInfo = deviceInfo;
		postInitialize();
	}

	protected void postInitialize() {
		subscribetempMeasurement();

	}

	private TempStruct roomAvgTempMeasurement;

	protected void setroomAvgTempMeasurement(TempStruct newValue) {

		if (roomAvgTempMeasurement != newValue) {
			roomAvgTempMeasurement = newValue;

			Logger.log(myDeviceInfo.getName(), "RoomAvgTemp",
					"Publishing roomAvgTempMeasurement");

			this.myPubSubMiddleware.publish("roomAvgTempMeasurement", newValue,
					myDeviceInfo);
		}
	}

	protected TempStruct getroomAvgTempMeasurement() {
		return roomAvgTempMeasurement;
	}

	public void notifyReceived(String eventName, Object arg, Device deviceInfo) {
		try {

			if (eventName.equals("tempMeasurement")) {
				Logger.log(myDeviceInfo.getName(), "RoomAvgTemp",
						"Notification Received tempMeasurement");

				onNewtempMeasurement((TempStruct) arg);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public abstract void onNewtempMeasurement(TempStruct arg);

	public void subscribetempMeasurement() {

		List<String> regionInfo = RegionSubscription.getSubscriptionRequest(
				partitionAttribute, myDeviceInfo.getRegionLabels(),
				myDeviceInfo.getRegion());

		this.myPubSubMiddleware.subscribe(this, "tempMeasurement", regionInfo);
	}

	public void run() {
	}

}