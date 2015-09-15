package deviceImpl;

import framework.*;
import iotsuite.computational.factory.ComputationalFactory;
import iotsuite.localmiddleware.IDataListener;
import iotsuite.localmiddleware.PubSubsSensingFramework;



public class JavaSE$CS.name$ implements I$CS.name$, IDataListener{

    $CS.allConsumedInfo:{ consumedInfo |
  public static Listener$consumedInfo.name$ listener$consumedInfo.name$ = null ;
   }; separator="\n"$ 
  private PubSubsSensingFramework pubSubSensingFramework = null;

 public JavaSE$CS.name$() {
    pubSubSensingFramework = PubSubsSensingFramework.getInstance();
    pubSubSensingFramework.registerForSensorData(this,"$CS.operation$-RESULT");  
    ComputationalFactory.initializeCompuatioanlComponent("$CS.operation$-CALCULATE");
    
  } 
  
  
   $CS.allConsumedInfo:{ consumedInfo |
    @Override
      public  void get$consumedInfo.name; format="capital"$( Listener$consumedInfo.name$ handler){     
      this.listener$consumedInfo.name$ = handler;
       }
   
 }; separator="\n"$
 
  @Override
       public void onDataReceived(String eventName, Object data) {
      
        $CS.allConsumedInfo:{ consumedInfo |
        if(eventName.equals("$consumedInfo.name$"))
        {
              $consumedInfo.type.name$ arg = ($consumedInfo.type.name$) data;
              listener$consumedInfo.name$.onNew$consumedInfo.name$(arg);
          }
  }; separator="\n"$
  
 }
  
 }
