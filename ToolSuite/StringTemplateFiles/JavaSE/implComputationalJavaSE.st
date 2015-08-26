package deviceImpl;

import framework.*;
import iotsuite.computational.factory.ComputationalFactory;
import iotsuite.localmiddleware.IDataListener;
import iotsuite.localmiddleware.PubSubsSensingFramework;



public class JavaSE$CS.name$ implements I$CS.name$, IDataListener{

    $CS.allConsumedInfo:{ consumedInfo |
  public static Listener$consumedInfo.name$ listener$consumedInfo.name$ = null;
   }; separator="\n"$ 
  private PubSubsSensingFramework pubSubSensingFramework = null;

public JavaSE$CS.name$() {
    pubSubSensingFramework = PubSubsSensingFramework.getInstance();
    pubSubSensingFramework.registerForSensorData(this, "AVG-RESULT");
    ComputationalFactory.initializeCompuatioanlComponent("AVG-CALCULATE");
  } 


  
  
      $CS.allConsumedInfo:{ consumedInfo |
    
    @Override
      public  void get$consumedInfo.name; format="capital"$( Listener$consumedInfo.name$ handler){     
      this.listener$consumedInfo.name$ = handler;
      
      }
         
      
    
    
   
    @Override
  public void onDataReceived(String eventName, Object data) {
    $consumedInfo.type.name$ arg = ($consumedInfo.type.name$) data;
    listener$consumedInfo.name$.onNew$consumedInfo.name$(arg);
  }
  }; separator="\n"$ 
    
    
   
    

}
