package logic;

import iotsuite.pubsubmiddleware.*;
import iotsuite.semanticmodel.*;
import android.content.Context;
import framework.*;
import iotsuite.common.GlobalVariable;
import factory.*;

public class  LogicProfileDB  extends ProfileDB  {
	
	public String deviceType;
	IProfileDB objProfileDB;

	
	public LogicProfileDB(PubSubMiddleware pubSubM, Device deviceInfo, Object ui,Context myContext) {
		super(pubSubM, deviceInfo);
		
		deviceType = deviceInfo.getType();
		  objProfileDB = ProfileDBFactory.getProfileDB(myDeviceInfo.getType(), null, null,deviceInfo);
			}
	

		
		@Override
		public void onNewprofileRequestReceived(String arg) {
			
			
	    if (deviceType.equals(GlobalVariable.deviceJAVASEType)) {
	       
	      
	       setProfile(objProfileDB.getprofile(arg));
	       }
	       else{
	        // This is reserved for Android Devices.
	       }
	      }
		
		
	
        
    	    @Override
    	    protected  void InsertProfileData(ProfileStruct arg ) {
    	     objProfileDB.InsertProfileData(arg );
    	    }
    		
    	

}