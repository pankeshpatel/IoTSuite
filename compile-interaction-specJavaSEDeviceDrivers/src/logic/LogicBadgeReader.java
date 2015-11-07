package logic;

import iotsuite.pubsubmiddleware.*;
import iotsuite.common.GlobalVariable;
import android.content.Context;
import iotsuite.semanticmodel.*;
import factory.*;
import framework.*;

public class  LogicBadgeReader extends BadgeReader  { 

 
	public LogicBadgeReader(PubSubMiddleware pubSubM, final Device deviceInfo, final Object ui,Context myContext) {
		super(pubSubM, deviceInfo);
		
		String deviceType = deviceInfo.getType();
		
		if (deviceType.equals(GlobalVariable.deviceJAVASEType)) {
			
			IBadgeReader objBadgeReader = BadgeReaderFactory
			.getBadgeReader(myDeviceInfo.getType(), null, null);
	
	if (objBadgeReader.isEventDriven()) {


				
					objBadgeReader.getbadgeDetected(badgeDetectedEvent);
				
			

				
					objBadgeReader.getbadgeDisappeared(badgeDisappearedEvent);
				
			

	} else {
		
			
				
				objBadgeReader.getbadgeDetected(badgeDetectedEvent);
				
					   
			
			
				
				objBadgeReader.getbadgeDisappeared(badgeDisappearedEvent);
				
					   
			
	
	}
		   		    
		}
		
		

	}	
	

		
	   


		
	   

		

		
		
		
		ListenerbadgeDetected  badgeDetectedEvent = new ListenerbadgeDetected() {
			
			@Override
			public void onNewbadgeDetected(BadgeStruct response) {

				BadgeStruct sBadgeStruct = new BadgeStruct(
				response.getbadgeID(), response.getbadgeEvent());
				setBadgeDetected(sBadgeStruct);
			}
			
			 
		};
	   

		
		
		
		ListenerbadgeDisappeared  badgeDisappearedEvent = new ListenerbadgeDisappeared() {
			
			@Override
			public void onNewbadgeDisappeared(BadgeStruct response) {

				BadgeStruct sBadgeStruct = new BadgeStruct(
				response.getbadgeID(), response.getbadgeEvent());
				setBadgeDisappeared(sBadgeStruct);
			}
			
			 
		};
	   
	

}