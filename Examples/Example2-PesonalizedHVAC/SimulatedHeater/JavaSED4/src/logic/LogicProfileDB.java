package logic;

import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import framework.*;
import iotsuite.common.GlobalVariable;
import factory.*;

public class LogicProfileDB extends ProfileDB {

	public String deviceType;

	public LogicProfileDB(PubSubMiddleware pubSubM, Device deviceInfo, Object ui) {
		super(pubSubM, deviceInfo);

		deviceType = deviceInfo.getType();

	}

	@Override
	public void onNewprofileRequestReceived(String arg) {

		if (deviceType.equals(GlobalVariable.deviceJAVASEType)) {

			IProfileDB objProfileDB = ProfileDBFactory.getProfileDB(
					myDeviceInfo.getType(), null, null);
			setprofile(objProfileDB.getprofile(arg));
		} else {
			// This is reserved for Android Devices.
		}
	}

}