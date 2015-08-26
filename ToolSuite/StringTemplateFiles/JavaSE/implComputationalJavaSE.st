package $CS.deviceImplPackageName$;

import framework.*;
import iotsuite.computational.factory.ComputationalFactory;
import iotsuite.localmiddleware.IDataListener;
import iotsuite.localmiddleware.PubSubsSensingFramework;



public class JavaSE$CS.name$ implements I$CS.name$, IDataListener{

  public static Listener$consumedInfo.name$ listener$consumedInfo.name$ = null;
  private PubSubsSensingFramework pubSubSensingFramework = null;

public JavaSE$CS.name$() {
    pubSubSensingFramework = PubSubsSensingFramework.getInstance();
    pubSubSensingFramework.registerForSensorData(this, "AVG-RESULT");
    ComputationalFactory.initializeCompuatioanlComponent("AVG-CALCULATE");
  } 
  
  
 
  // $CS.name.allConsumedInfo:{ ConsumedInfo | 
   
  /* @Override
   public  $generatedInfo.type.name$ get$generatedInfo.name; format="avoidCapital"$(){
		   return null;
   }*/
	  
	  
      
   @Override
   public void get$consumedInfo.name; format="avoidCapital"$(Listener$consumedInfo.name$ handler){
      this.listener$consumedInfo.name$ = handler;
   }   
      
}//; separator="\n"$
  
  @Override
  public void onDataReceived(String eventName, Object data) {
    $consumedInfo.type.name$ arg = ($consumedInfo.type.name$) data;
    listener$consumedInfo.name$.onNewt$consumedInfo.name$(arg);
  }

}
