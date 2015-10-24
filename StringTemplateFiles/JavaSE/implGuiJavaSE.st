package $GUIdriver.deviceImplPackageName$;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import logic.*;
import framework.*;
import android.content.Context;
import iotsuite.localmiddleware.IDataListener;
import com.google.gson.JsonObject;
import iotsuite.localmiddleware.PubSubsSensingFramework;


public class JavaSE$GUIdriver.name$ implements I$GUIdriver.name$,IDataListener {


  private JFrame mainFrame;
  private JLabel headerLabel;
  private JLabel statusLabel;
  private JPanel controlPanel;
  public static PubSubsSensingFramework pubSubSensingFramework;
  String request;
   $GUIdriver.allStructFields:{field | 
             $field.type$ $field.name$;               
               }$
  
  $GUIdriver.commands:{ command |
      private Listener$GUIdriver.name$  listener$command.name$Command = null;    
 
  }; separator="\n"$
  
   $GUIdriver.allDataAccess:{ dataAccess |
          private Listener$GUIdriver.name$  listener$dataAccess.dataAccessName; format="capital"$Request = null;
        }$
        


  public JavaSE$GUIdriver.name$(Context context, Logic$GUIdriver.name$ obj) {
    
    prepareGUI();
    showEventDemo();
    
    pubSubSensingFramework = PubSubsSensingFramework.getInstance();
     $GUIdriver.allDataAccess:{ dataAccess |
    pubSubSensingFramework.registerForSensorData(this, "$dataAccess.dataAccessName; format="avoidCapital"$Response");
     }; separator="\n"$
  }
  

  $GUIdriver.commands:{ command |
  
     @Override
     public void $command.name$GUI(Listener$GUIdriver.name$ handler){
       listener$command.name$Command = handler;
     }
 
  }; separator="\n"$
  
    $GUIdriver.allDataAccess:{ dataAccess |
         @Override
         public void $dataAccess.dataAccessName; format="capital"$GUI(Listener$GUIdriver.name$ handler) {
              listener$dataAccess.dataAccessName; format="capital"$Request = handler; 
         }    
    }$
    
  
  
    
    @Override
      public void onDataReceived(String eventName, JsonObject data) {
        // TODO Auto-generated method stub
        //Unwarpe data from Json Object
        
          $GUIdriver.allStructFields:{field | 
              $field.type$ $field.name$=data.get("$field.name$").getAs$field.type;format="capital"$();              
              }$
        
      }  
      
      $GUIdriver.commands:{ command |      
      public void $command.name$CommandInterface(){
      listener$command.name$Command.onNew$command.name$Command($command.allParameter:{ param | new $param.type$( 
      $GUIdriver.allStructFields:{field |$field.name$}; separator=","$)}; separator=" , "$);
      }
       }; separator="\n"$
       
       
       
   $GUIdriver.allDataAccess:{ dataAccess |
      public void $dataAccess.dataAccessName; format="capital"$RequestInterface(){
      listener$dataAccess.dataAccessName; format="capital"$Request.onNew$dataAccess.dataAccessName; format="capital"$Request(request);
      }
       }; separator="\n"$
      
   //  $GUIdriver.allDataAccess:{ dataAccess |
   //      public void $dataAccess.dataAccessName; format="capital"$ResponseReceived($GUIdriver.AllDataAccess:{ dataAcc |$dataAcc.GeneratedInfo.type$}$ response){
   //          }  
   // }$ 
    
  
    
    private void prepareGUI(){
    mainFrame = new JFrame("Simulated  $GUIdriver.name$");
    mainFrame.setSize(200, 200);
    mainFrame.setLayout(new GridLayout(3, 1));

    headerLabel = new JLabel("", JLabel.CENTER);
    statusLabel = new JLabel("", JLabel.CENTER);
    statusLabel.setSize(350, 100);

    mainFrame.addWindowListener(new WindowAdapter() {

      public void windowClosing(WindowEvent windowEvent) {
        System.exit(0);
      }
    });

    controlPanel = new JPanel();
    controlPanel.setLayout(new FlowLayout());
    mainFrame.add(headerLabel);
    mainFrame.add(controlPanel);
    mainFrame.add(statusLabel);
    
    
    mainFrame.setVisible(true);
    }
    
    
    
    public void showEventDemo(){
    
    
    
     $GUIdriver.commands:{ command |
     //  $command.name$ Command    
     JButton $command.name;format="avoidCapital"$ = new JButton("$command.name;format="avoidCapital"$ Command");
     $command.name;format="avoidCapital"$.setActionCommand("$command.name;format="avoidCapital"$ Command");
     $command.name;format="avoidCapital"$.addActionListener(new $command.name;format="avoidCapital"$ButtonClickListener());
     }; separator="\n"$
     
     
      $GUIdriver.allDataAccess:{ dataAccess |
      // request $dataAccess.dataAccessName; format="capital"$
     JButton request$dataAccess.dataAccessName;format="capital"$ = new JButton("Request $dataAccess.dataAccessName;format="capital"$");
     request$dataAccess.dataAccessName;format="capital"$.setActionCommand("Request $dataAccess.dataAccessName;format="capital"$");
     request$dataAccess.dataAccessName;format="capital"$.addActionListener(new request$dataAccess.dataAccessName;format="capital"$ButtonClickListener());
      }; separator="\n"$
           
   
    
    }
    
     $GUIdriver.commands:{ command |
     private class  $command.name;format="avoidCapital"$ButtonClickListener implements ActionListener{
     @Override
    public void actionPerformed(ActionEvent arg0) {
      
         $command.name;format="capital"$CommandInterface();
    }
     }
     
     }; separator="\n"$
     
     
     $GUIdriver.allDataAccess:{ dataAccess |
     private class request$dataAccess.dataAccessName;format="capital"$ButtonClickListener implements ActionListener{
     @Override
     public void actionPerformed(ActionEvent arg0){
     $dataAccess.dataAccessName;format="capital"$RequestInterface();
     }
       }
     
      }; separator="\n"$
    
    
            
      
}