package com.example.android;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.view.Menu;
import iotsuite.android.localmiddleware.IDataListener;
import iotsuite.android.localmiddleware.PubSubsSensingFramework;
import com.example.android.R;

public class MainActivityGui extends Activity implements I$GUIdriver.name$,IDataListener {

  public static PubSubsSensingFramework pubSubSensingFramework;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  
    new sim.device$device.name$.Startup().startDevice(this, this.getApplicationContext());
      pubSubSensingFramework = PubSubsSensingFramework.getInstance();
       
       $GUIdriver.allDataAccess:{ dataAccess |
      pubSubSensingFramework.registerForSensorData(this, "$dataAccess.dataAccessName; format="avoidCapital"$");
    }$
   

  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.activity_main, menu);
    return true;
  }

  @Override
  public void onDataReceived(String eventName, Object data) {
    // TODO : Developer will write Device Driver code.
    // This method will get data from Logic method
  }
  
  
  $GUIdriver.commands:{ command |  
     @Override
     public void $command.name$Interface(View view){
     // TODO : Device Developer will connect appropriate UI element with the
    // below function.
       
     } 
  }; separator="\n"$ 
  
  
   $GUIdriver.allDataAccess:{ dataAccess |
         @Override
         public void $dataAccess.dataAccessName; format="capital"$Interface(View view) {
              // TODO : Device Developer will connect appropriate UI element with the
    // below function.
         }    
    }$
  
  
  
}
