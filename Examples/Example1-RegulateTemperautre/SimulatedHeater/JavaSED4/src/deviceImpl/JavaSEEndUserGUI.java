package deviceImpl;

import logic.*;
import framework.*;
import android.content.Context;

public class JavaSEEndUserGUI implements IEndUserGUI {

	private ListenerEndUserGUI listenerOffCommand = null;

	private ListenerEndUserGUI listenerSetTempCommand = null;

	private ListenerEndUserGUI listenerprofileRequest = null;

	public JavaSEEndUserGUI(Context context, LogicEndUserGUI obj) {

	}

	@Override
	public void OffGUI(ListenerEndUserGUI handler) {
		listenerOffCommand = handler;
	}

	@Override
	public void SetTempGUI(ListenerEndUserGUI handler) {
		listenerSetTempCommand = handler;
	}

	@Override
	public void profileGUI(ListenerEndUserGUI handler) {
		listenerprofileRequest = handler;
	}

	public void profileResponseReceived(TempStruct response) {

	}

}