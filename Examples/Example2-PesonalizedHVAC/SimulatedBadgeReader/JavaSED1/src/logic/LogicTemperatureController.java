package logic;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import iotsuite.semanticmodel.*;
import framework.*;

public class LogicTemperatureController extends TemperatureController {

	public LogicTemperatureController(PubSubMiddleware pubSubM,
			Device deviceInfo, Object ui) {
		super(pubSubM, deviceInfo);
	}

	public void onNewtempPref(TempStruct arg) {

		if (arg.gettempValue() == -100) { // It means that person is leaving the
											// room
			Off(); // Set the Off() command
		} else {
			// If the person is entering to the room then, set temperature
			// according to his preference
			double tempValue = arg.gettempValue();
			TempStruct tempStruct = new TempStruct(tempValue,
					arg.getunitOfMeasurement());
			SetTemp(tempStruct);
		}

	}

}