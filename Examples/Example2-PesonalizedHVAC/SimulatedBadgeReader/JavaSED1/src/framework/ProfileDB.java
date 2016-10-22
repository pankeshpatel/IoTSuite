package framework;

import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import iotsuite.common.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class ProfileDB implements Runnable, Subscriber {

	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;

	public ProfileDB(PubSubMiddleware pubSubM, Device deviceInfo) {

		this.myPubSubMiddleware = pubSubM;
		this.myDeviceInfo = deviceInfo;
		postInitialize();
	}

	protected void postInitialize() {
		subscribeprofile();

	}

	protected void setprofile(TempStruct newprofileValue) {

		myPubSubMiddleware.publish("profile", newprofileValue, myDeviceInfo);

	}

	public void notifyReceived(String eventName, Object arg, Device deviceInfo) {
		try {

			if (eventName.equals("getprofile")) {
				Logger.log(myDeviceInfo.getName(), "ProfileDB",
						"CommandReceived getprofile");

				onNewprofileRequestReceived((String) arg);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public abstract void onNewprofileRequestReceived(String arg);

	public void subscribeprofile() {
		List<String> regionInfo = new ArrayList<String>();

		regionInfo.add("*");
		regionInfo.add("*");
		regionInfo.add("*");

		this.myPubSubMiddleware.subscribe(this, "getprofile", regionInfo);

	}

	public void run() {
	}

}