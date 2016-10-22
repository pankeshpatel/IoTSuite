package logic;

import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.content.Context;
import iotsuite.semanticmodel.*;

import framework.*;
public class  LogicRoomController extends RoomController  {  

   public LogicRoomController(PubSubMiddleware pubSubM, Device deviceInfo, Object ui,Context myContext) {
    super(pubSubM, deviceInfo);
    
   }   

          
            @Override
            public  void onNewtempPref( TempStruct arg){     
            	if (arg.gettempValue() == -100) { 
            		// It means that person is leaving the room
            			Off(); // Set the Off() command
            		} else {
            			// If the person is entering to the room then, 
            			// set temperature according to his preference
            			double tempValue = arg.gettempValue();
            			TempStruct tempStruct = new TempStruct(tempValue,
            					arg.getunitOfMeasurement());
            			SetTemp(tempStruct);
            		}
            }
            
           
    
}