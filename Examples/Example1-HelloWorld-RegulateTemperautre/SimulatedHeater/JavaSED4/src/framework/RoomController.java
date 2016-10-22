package framework;

import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;
import java.util.List;

public abstract class RoomController implements Subscriber, Runnable {

	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	private String partitionAttribute = "Room";

	public RoomController(PubSubMiddleware pubSubM, Device deviceInfo) {

		this.myPubSubMiddleware = pubSubM;
		this.myDeviceInfo = deviceInfo;
		postInitialize();
	}

	protected void postInitialize() {
		subscriberoomAvgTempMeasurement();

	}

	protected void SetTemp(TempStruct arg) {
		Logger.log(myDeviceInfo.getName(), "RoomController",
				"Sending command SetTemp");
		this.myPubSubMiddleware.publish("SetTemp", arg, myDeviceInfo);
	}

	public void notifyReceived(String eventName, Object arg, Device deviceInfo) {
		try {

			if (eventName.equals("roomAvgTempMeasurement")) {
				Logger.log(myDeviceInfo.getName(), "RoomController",
						"Notification Received roomAvgTempMeasurement");

				onNewroomAvgTempMeasurement((TempStruct) arg);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public abstract void onNewroomAvgTempMeasurement(TempStruct arg);

	public void subscriberoomAvgTempMeasurement() {

		List<String> regionInfo = RegionSubscription.getSubscriptionRequest(
				partitionAttribute, myDeviceInfo.getRegionLabels(),
				myDeviceInfo.getRegion());

		this.myPubSubMiddleware.subscribe(this, "roomAvgTempMeasurement",
				regionInfo);
	}

	public void run() {
	}

}