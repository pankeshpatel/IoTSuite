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
import iotsuite.semanticmodel.Device;


public class JavaSE$SensorDriver.name$ implements I$SensorDriver.name$ {

  private JFrame mainFrame;
  private JLabel headerLabel;
  private JLabel statusLabel;
  private JPanel controlPanel;

       
  $SensorDriver.allEventDrivenFields:{eventDrivenFields | 
   $eventDrivenFields$; 
  }$
   $SensorDriver.allGeneratedInfo:{ generatedInfo | 
     private Listener$generatedInfo.name$ handler$generatedInfo.name$;
  }; separator="\n"$
  
   public JavaSE$SensorDriver.name$(Device deviceInfo) { 
	  
	
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
     boolean $generatedInfo.name; format="avoidCapital"$Condition = false;    
      }; separator="\n"$
      
       $SensorDriver.allGeneratedInfo:{ generatedInfo | 
       if(e.getActionCommand().equals("$generatedInfo.name; format="avoidCapital"$"))
       {
       $generatedInfo.name; format="avoidCapital"$Condition=true;
       }
        }; separator="\n"$
  
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
