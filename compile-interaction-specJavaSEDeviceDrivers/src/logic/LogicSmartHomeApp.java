package logic;

import com.google.gson.JsonObject;
import iotsuite.common.GlobalVariable;
import iotsuite.localmiddleware.PubSubsSensingFramework;
import iotsuite.pubsubmiddleware.PubSubMiddleware;
import android.app.Activity;
import android.content.Context;
import iotsuite.semanticmodel.*;
import framework.*;
import factory.*;
import deviceImpl.*;
  
   
public  class  LogicSmartHomeApp extends SmartHomeApp  {  

  ISmartHomeApp objSmartHomeApp;
  Activity ui;
  public LogicSmartHomeApp obj=this;
   public String deviceType;
   JavaSESmartHomeApp objJavaSESmartHomeApp = null;
     public static PubSubsSensingFramework pubSubSensingFramework;
   
  

  public LogicSmartHomeApp(PubSubMiddleware myPubSubMiddleware, final Device deviceInfo, final Object ui, Context myContext) {
    super(myPubSubMiddleware, deviceInfo);
     deviceType = deviceInfo.getType();
     pubSubSensingFramework = PubSubsSensingFramework.getInstance();
    
     if (deviceType.equals(GlobalVariable.deviceJAVASEType)) {
     
        objSmartHomeApp = SmartHomeAppFactory.getSmartHomeAppDriver(deviceInfo.getType(),(Activity) ui,obj);

             objSmartHomeApp.OffGUI(handlerCommand);    

            

             objSmartHomeApp.SetTempGUI(handlerCommand);    

            
      

                   objSmartHomeApp.ProfileGUI(handlerCommand); 
                
    
    }
    
  
    

}
  
  ListenerSmartHomeApp  handlerCommand =  new  ListenerSmartHomeApp() {

     @Override
      public void onNewOffCommand() {
        OffFromGUI();
      }     
    

     @Override
      public void onNewSetTempCommand(TempStruct newValue) {
        SetTempFromGUI(newValue);
      }     
    
  

           @Override
           public void onNewProfileRequest(String request) {
               ProfileRequest(request);
           }    
      
  
  
  

  };
  

        public void onNewProfileResponse(TempStruct arg){
             //  objJavaSESmartHomeApp.ProfileResponseReceived(arg);
             // wrap the data in to Json Object
            JsonObject objProfile = new JsonObject();

                            objProfile.addProperty("tempValue",arg.gettempValue());
                            objProfile.addProperty("unitOfMeasurement",arg.getunitOfMeasurement());
                            objProfile.addProperty("tempValue",arg.gettempValue());
                            objProfile.addProperty("tempValue",arg.gettempValue());
                            objProfile.addProperty("unitOfMeasurement",arg.getunitOfMeasurement());
                            objProfile.addProperty("tempValue",arg.gettempValue());
                  
            pubSubSensingFramework.publish("profileResponse", objProfile);
       
       }  
    

          
          public  void onNewDisplayTempNotify(TempStruct arg){
          //wrap the data in to Json Object
          
          JsonObject objDisplayTemp = new JsonObject();

                 objDisplayTemp.addProperty("tempValue",arg.gettempValue());
                 objDisplayTemp.addProperty("unitOfMeasurement",arg.getunitOfMeasurement());
                 objDisplayTemp.addProperty("tempValue",arg.gettempValue());
                 objDisplayTemp.addProperty("tempValue",arg.gettempValue());
                 objDisplayTemp.addProperty("unitOfMeasurement",arg.getunitOfMeasurement());
                 objDisplayTemp.addProperty("tempValue",arg.gettempValue());
           pubSubSensingFramework.publish("displayTempNotify", objDisplayTemp);
          } 
         
    
   
}