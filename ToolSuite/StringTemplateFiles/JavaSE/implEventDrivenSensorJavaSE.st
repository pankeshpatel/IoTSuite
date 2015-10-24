package $SensorDriver.deviceImplPackageName$;

import framework.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JTextField;

public class JavaSE$SensorDriver.name$ implements I$SensorDriver.name$ {

  private JFrame mainFrame;
  private JLabel headerLabel;
  private JLabel statusLabel;
  private JPanel controlPanel;
   // TODO : Developer will configure the following appropriately(Developer will configure Textfield if require).
  //private JTextField jtfTextField = new JTextField("Enter BadgeID");
       
//TODO:Developer will configure the following argument appropriately
  $SensorDriver.allEventDrivenFields:{eventDrivenFields | 
   $eventDrivenFields$; 
  }$
   $SensorDriver.allGeneratedInfo:{ generatedInfo | 
    private boolean $generatedInfo.name; format="avoidCapital"$Condition = false;    
        private Listener$generatedInfo.name$ handler$generatedInfo.name$;
  }; separator="\n"$
  
   public JavaSE$SensorDriver.name$() { 
     prepareGUI();
     showEventDemo();
  } 
  
 
  $SensorDriver.allGeneratedInfo:{ generatedInfo | 
   @Override
   public void get$generatedInfo.name; format="avoidCapital"$(Listener$generatedInfo.name$ handler){
    handler$generatedInfo.name$=handler;     
   }   
        
  /* @Override
   public  $generatedInfo.type$ get$generatedInfo.name; format="avoidCapital"$(){
       return null;
   }*/
}; separator="\n"$

  private void prepareGUI()
  {
  mainFrame= new JFrame("Simulated $SensorDriver.name$");
  mainFrame.setSize(200,200);
  mainFrame.setLayout(new GridLayout(3,1));
  
  headerLabel= new JLabel("",JLabel.CENTER);
  statusLabel= new JLabel("",JLabel.CENTER);
  
  //jtfTextField = new JTextField(5);
  statusLabel.setSize(350,100);
  
  mainFrame.addWindowListener(new WindowAdapter(){
  
  public void windowClosing(WindowEvent windowEvent){
  System.exit(0);
  }
  });
  
  controlPanel = new JPanel();
  controlPanel.setLayout(new FlowLayout());
  mainFrame.add(headerLabel);
  mainFrame.add(controlPanel);
  mainFrame.add(statusLabel);
 // mainFrame.add(jtfTextField);

  mainFrame.setVisible(true);
  }
  
  
  public void showEventDemo(){
  
    $SensorDriver.allGeneratedInfo:{ generatedInfo | 
  
  JButton $generatedInfo.name$Button = new JButton("$generatedInfo.name$");
   
  $generatedInfo.name$Button.setActionCommand("$generatedInfo.name$");
   
  $generatedInfo.name$Button.addActionListener(new ButtonClickListener());
   
  controlPanel.add($generatedInfo.name$Button);
  
   }; separator="\n"$
  mainFrame.setVisible(true);
  }
  
  
  private class ButtonClickListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
   $SensorDriver.allGeneratedInfo:{ generatedInfo | 
    if($generatedInfo.name; format="avoidCapital"$Condition)
   { 
   
    statusLabel.setText(" $generatedInfo.name$ event is happened.....");
    handler$generatedInfo.name$.onNew$generatedInfo.name$(new  $generatedInfo.type$ ($SensorDriver.allEventDrivenFieldName:{eventDrivenFieldName | $eventDrivenFieldName$};separator="," $) );
  }
 
   }; separator="\n"$
 }
  }
  
  @Override
  public boolean isEventDriven() {
    return true;
  }

}
