package logic;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.content.Context;
import iotsuite.semanticmodel.*;

import framework.*;

public class LogicDataVisualizer extends DataVisualizer {

	double tempValue, humidityValue;

	public LogicDataVisualizer(PubSubMiddleware pubSubM, Device deviceInfo,
			Object ui, Context myContext) {
		super(pubSubM, deviceInfo);

	}

	@Override
	public void onNewweatherMeasurement(TempStruct arg) {
		// Read weatherMeasurement from YahooWeatherService
		// and set DisplaySensorMeasurement to Dashboard
		VisualizationStruct struct = new VisualizationStruct(tempValue,
				humidityValue, arg.gettempValue());
		DisplaySensorMeasurement(struct);
	}

	@Override
	public void onNewhumidityMeasurement(HumidityStruct arg) {
		// Read humidityMeasurement from HumiditySensor
		humidityValue = arg.gethumidityValue();
	}

	@Override
	public void onNewtempMeasurement(TempStruct arg) {
		// Read tempMeasurement from TemperatureSensor
		tempValue = arg.gettempValue();
	}

}