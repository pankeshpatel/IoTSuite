package sim.deviceEndUserDevice;


import iotsuite.semanticmodel.*;
import iotsuite.common.*;
import iotsuite.pubsubmiddleware.*;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import logic.*;
import android.content.Context;

public class Startup implements DeviceStartup {
	
	private static Context ui;
	private static String name ;
	private static String softwarePlatform;
	//private static String networkAddress;
	private static Set<String> abilities = new HashSet<String>();
	private static PubSubMiddleware myPubSub;
	public static Object myContext = null;
	//public static String mobileFlag;
	public static String protocol;
  public static String description;
	public static String database;


private static void setUpNode(Device deviceInfo)	{	

	
	
	myPubSub = (PubSubMiddleware) IoTSuiteFactory.getInstance(deviceInfo.getProtocol(), setUpDeviceInfo(), myContext);

	
	

		LogicEndUserApp logicEndUserAppImpl = new LogicEndUserApp(myPubSub, deviceInfo, ui, (Context) myContext); 
		new Thread(logicEndUserAppImpl).start();
	    
	
}

private static Device setUpDeviceInfo() {
    
	 name = "EndUserDevice";
	 softwarePlatform = "Android";
	 protocol = "mqtt";
	description = "" ;
	 database="";

		
	abilities.add("EndUserApp");   
	 
			
			Device device = new Device(name, softwarePlatform,abilities, protocol, description,database); 
      
			
	return device;    
}

@Override
public void startDevice(Object obj, Object context) {
	ui= (Context) obj;
	myContext=context;
	setUpNode(setUpDeviceInfo());
	
}

}