package logic;
import iotsuite.localmiddleware.PubSubsSensingFramework;
import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.content.Context;
import iotsuite.semanticmodel.*;
import factory.*;  
import com.google.gson.JsonObject;
import framework.*;

public class  LogicAvgTemp extends AvgTemp  {     
    
    public static int sampleValue=5;
    IAvgTemp objAvgTemp;
    public static PubSubsSensingFramework pubSubSensingFramework;
   public LogicAvgTemp(PubSubMiddleware pubSubM, Device deviceInfo, Object ui,Context myContext) {
    super(pubSubM, deviceInfo);
    
      pubSubSensingFramework = PubSubsSensingFramework.getInstance();
      objAvgTemp = AvgTempFactory.getAvgTemp(
        deviceInfo.getType(), null, null);

              objAvgTemp.gettempMeasurement(tempMeasurementEvent);    
                 
  } 
  
 
   

             ListenertempMeasurement tempMeasurementEvent = new ListenertempMeasurement(){
            @Override
              public  void onNewtempMeasurement( TempStruct arg){     
              setroomAvgTempMeasurement(arg); 
             }       
             };        
            
    

          @Override
         public void onNewtempMeasurement( TempStruct arg)
         {

                 JsonObject obj = new JsonObject();

                                 obj.addProperty("tempValue",arg.gettempValue());
                                 obj.addProperty("unitOfMeasurement",arg.getunitOfMeasurement());
                                 obj.addProperty("tempValue",arg.gettempValue());
                   obj.addProperty("sampleValue",5);
           
                
          pubSubSensingFramework.publish("AVG-REQUEST", obj);
         }
         
           
    
    
}