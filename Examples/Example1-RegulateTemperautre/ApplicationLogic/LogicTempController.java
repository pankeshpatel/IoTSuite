package logic;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.content.Context;
import iotsuite.semanticmodel.*;

import framework.*;

public class LogicTempController extends TempController {

	public LogicTempController(PubSubMiddleware pubSubM, Device deviceInfo,
			Object ui, Context myContext) {
		super(pubSubM, deviceInfo);

	}

	@Override
	public void onNewroomAvgTempMeasurement(TempStruct arg) {
		
		double tempValue = arg.gettempValue();
		TempStruct tempStruct = new TempStruct(tempValue, arg.getunitOfMeasurement());
		SetTemp(tempStruct);
		
	}

}