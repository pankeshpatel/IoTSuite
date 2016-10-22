package logic;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import iotsuite.semanticmodel.*;
import framework.*;

public class LogicProximity extends Proximity {

	private double userTempPreference = 0;
	private String userProfile;
	private boolean responseArrived = false;
	private boolean continueFlag = true;

	public LogicProximity(PubSubMiddleware pubSubM, Device deviceInfo, Object ui) {
		super(pubSubM, deviceInfo);
	}

	public void onNewbadgeDisappeared(BadgeStruct arg) {

		// Person is leaving the room.
		// So, provide negative value to indicate to off the heater.
		TempStruct tempStruct = new TempStruct(-100, "C");
		settempPref(tempStruct);

	}

	public void onNewbadgeDetected(BadgeStruct arg) {
		userProfile = arg.getbadgeID();
		// Request profileDB for his preference
		getprofile(userProfile);

	}

	public void onNewprofileReceived(TempStruct arg) {
		userTempPreference = arg.gettempValue();

		TempStruct tempStruct = new TempStruct(userTempPreference, "C");
		// Set temperature to Temperature Controller
		settempPref(tempStruct);

	}

}