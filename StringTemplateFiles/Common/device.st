package $device.PackageName$;


import iotsuite.semanticmodel.*;
import iotsuite.common.*;
import iotsuite.pubsubmiddleware.*;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import $device.logicPackageName$.*;
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

	
	
	$device.abilities:{ sc |	
	Logic$sc$ logic$sc$Impl = new Logic$sc$(myPubSub, deviceInfo, ui, (Context) myContext); 
	new Thread(logic$sc$Impl).start();
    }; separator="\n"$
	
}

private static Device setUpDeviceInfo() {
    
	 name = "$device.name$";
	 softwarePlatform = "$device.type$";
	 protocol = "$device.Protocol$";
	description = "$device.Description$" ;
	 database="$device.Database$";

		
	$device.abilities:{ sc | abilities.add("$sc$"); }$  
	 
			
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