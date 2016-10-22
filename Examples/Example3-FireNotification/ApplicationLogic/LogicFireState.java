package logic;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.content.Context;
import iotsuite.semanticmodel.*;

import framework.*;

public class LogicFireState extends FireState {

	double avgtempValue, smokeMeasurement;

	public LogicFireState(PubSubMiddleware pubSubM, Device deviceInfo,
			Object ui, Context myContext) {
		super(pubSubM, deviceInfo);

	}

	@Override
	public void onNewsmokeMeasurement(SmokeStruct arg) {
		// Read smokeMeasurement from SmokeDetector
		smokeMeasurement = arg.getsmokeValue();
		// If smokeValue and avgtempValue are greater than threshold means fire
		// has been occurred.
		if (smokeMeasurement > 650 && avgtempValue > 55) {
			SmokeStruct smokeStruct = new SmokeStruct(650, "PPM");
			setsmokeValue(smokeStruct);
		}
	}

	@Override
	public void onNewroomAvgTempMeasurement(TempStruct arg) {
		// Read roomAvgTempMeasurement from RoomAvgTemp
		avgtempValue = arg.gettempValue();
	}

}