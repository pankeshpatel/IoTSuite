package logic;

import iotsuite.common.GlobalVariable;
import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.app.Activity;
import iotsuite.semanticmodel.*;
import framework.*;
import factory.*;
import deviceImpl.*;

public class LogicEndUserGUI extends EndUserGUI {

	IEndUserGUI objEndUserGUI;
	Activity ui;
	public LogicEndUserGUI obj = this;
	public String deviceType;
	JavaSEEndUserGUI objJavaSEEndUserGUI = null;

	public LogicEndUserGUI(PubSubMiddleware myPubSubMiddleware,
			final Device deviceInfo, final Object ui) {
		super(myPubSubMiddleware, deviceInfo);
		deviceType = deviceInfo.getType();

		if (deviceType.equals(GlobalVariable.deviceJAVASEType)) {

			objEndUserGUI = EndUserGUIFactory.getEndUserGUIDriver(
					deviceInfo.getType(), (Activity) ui, obj);

			objEndUserGUI.OffGUI(handlerCommand);

			objEndUserGUI.SetTempGUI(handlerCommand);

			objEndUserGUI.profileGUI(handlerCommand);

		}

	}

	ListenerEndUserGUI handlerCommand = new ListenerEndUserGUI() {

		@Override
		public void onNewOffCommand() {
			OffFromGUI();
		}

		@Override
		public void onNewSetTempCommand(TempStruct newValue) {
			SetTempFromGUI(newValue);
		}

		@Override
		public void onNewprofileRequest(String request) {
			profileRequest(request);
		}

	};

	public void onNewprofileResponse(TempStruct arg) {
		objJavaSEEndUserGUI.profileResponseReceived(arg);

	}
}