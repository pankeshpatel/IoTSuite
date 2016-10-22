package framework;

import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;
import java.util.List;
import java.util.ArrayList;

public abstract class Heater implements Runnable, Subscriber {

	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	// private String partitionAttribute = "NoInstance";
	private String partitionAttribute = "Room";

	public Heater(PubSubMiddleware pubSubM, Device deviceInfo) {

		this.myPubSubMiddleware = pubSubM;
		this.myDeviceInfo = deviceInfo;
		postInitialize();

	}

	protected void postInitialize() {
		subscribeSetTemp();
	}

	protected abstract void SetTemp(TempStruct arg);

	public void notifyReceived(String methodName, Object arg, Device deviceInfo) {

		if (methodName.equals("SetTemp")) {

			Logger.log(myDeviceInfo.getName(), "Heater",
					"SetTemp has been received");

			SetTemp((TempStruct) arg);

		}

	}

	public void subscribeSetTemp() {

		List<String> regionInfo = new ArrayList<String>();

		regionInfo.add("*");
		regionInfo.add("*");
		regionInfo.add("*");

		this.myPubSubMiddleware.subscribe(this, "SetTemp", regionInfo);

		/*
		 * List<String> regionInfo = RegionSubscription.getSubscriptionRequest(
		 * partitionAttribute, myDeviceInfo.getRegionLabels(),
		 * myDeviceInfo.getRegion());
		 * 
		 * this.myPubSubMiddleware.subscribe(this,"SetTemp",regionInfo);
		 */
	}

	public void run() {
	}
}
