package logic;

import java.sql.Timestamp;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.content.Context;
import iotsuite.semanticmodel.*;

import framework.*;

public class LogicFireController extends FireController {

	public LogicFireController(PubSubMiddleware pubSubM, Device deviceInfo,
			Object ui, Context myContext) {
		super(pubSubM, deviceInfo);

	}

	@Override
	public void onNewsmokeValue(SmokeStruct arg) {
		// Read smokeValue from FireState and fire command to Alarm and
		// EndUserApp
		On();
		FireNotify(new FireStateStruct("Fire has been occurred",
				(new Timestamp(new java.util.Date().getTime())).toString()));
	}

}