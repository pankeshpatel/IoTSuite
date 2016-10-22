package logic;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.content.Context;
import iotsuite.semanticmodel.*;

import framework.*;

public class LogicProximity extends Proximity {

	public LogicProximity(PubSubMiddleware pubSubM, Device deviceInfo,
			Object ui, Context myContext) {
		super(pubSubM, deviceInfo);

	}

	@Override
	public void onNewbadgeDetected(BadgeStruct arg) {
		// Request profileDB for his preference
		getprofile(arg.getbadgeID());
	}	
	@Override
	public void onNewbadgeDisappeared(BadgeStruct arg) {
		// Person is leaving the room. Turn off the heater.
		TempStruct tempStruct = new TempStruct(-100, "C");
		settempPref(tempStruct);
	}	
	public void onNewprofileReceived(TempStruct arg) {
		TempStruct tempStruct = new TempStruct(arg.gettempValue(), "C");
		// Set temperature to RoomController
		settempPref(tempStruct);
	}

}