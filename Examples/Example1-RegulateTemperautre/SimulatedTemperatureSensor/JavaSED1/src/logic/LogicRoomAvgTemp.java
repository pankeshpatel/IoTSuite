package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import iotsuite.semanticmodel.*;
import framework.*;

public class LogicRoomAvgTemp extends RoomAvgTemp {

	final List<Double> temps = Collections
			.synchronizedList(new ArrayList<Double>());
	private double currentAverage;
	private int numSample = 0;
	private final int NUM_SAMPLE_FOR_AVG = 3;

	public LogicRoomAvgTemp(PubSubMiddleware pubSubM, Device deviceInfo,
			Object ui) {
		super(pubSubM, deviceInfo);

	}

	public void onNewtempMeasurement(TempStruct arg) {

		synchronized (this.temps) {
			numSample = numSample + 1;
			if (numSample <= NUM_SAMPLE_FOR_AVG) {
				// Handling of temperature Value with different unit.
				if (arg.getunitOfMeasurement().equals("F")) {
					double convertToCelcius = (arg.gettempValue() - 32)
							* (5 / 9);
					temps.add(convertToCelcius);
				} else {
					temps.add(arg.gettempValue());
				}
				currentAverage = 0;
				for (Double temp : temps) {
					currentAverage += temp;
				}
				currentAverage /= temps.size();
			}

			if (numSample == NUM_SAMPLE_FOR_AVG) {
				numSample = 0;

				TempStruct avgTempMeasurement = new TempStruct(currentAverage,
						"C");
				setroomAvgTempMeasurement(avgTempMeasurement);
			}

		}

	}

}
