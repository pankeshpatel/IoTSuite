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






public class JavaSE$SensorDriver.name$ implements I$SensorDriver.name$ {

  // TODO : Developer will configure the following appropriately.
  
   $SensorDriver.allGeneratedInfo:{ generatedInfo | 
    private boolean $generatedInfo.name; format="avoidCapital"$Condition = false;    
        private Listener$generatedInfo.name$ handler$generatedInfo.name$;
  }; separator="\n"$
  
  private JFrame mainFrame;
  private JLabel headerLabel;
  private JLabel statusLabel;
  private JPanel controlPanel;
  
   public JavaSE$SensorDriver.name$() { 
     prepareGUI();
     showEventDemo();
  }
  
   $SensorDriver.allGeneratedInfo:{ generatedInfo | 
   
  /* @Override
   public  $generatedInfo.type.name$ get$generatedInfo.name; format="avoidCapital"$(){
       return null;
   }*/
   
   @Override
   public void get$generatedInfo.name; format="avoidCapital"$(Listener$generatedInfo.name$ handler){
    handler$generatedInfo.name$=handler;     
   }   
      
}; separator="\n"$
  private void prepareGUI()
  {
  mainFrame= new JFrame("Simulated Smoke Detector");
  mainFrame.setSize(200,200);
  mainFrame.setLayout(new GridLayout(3,1));
  
  headerLabel= new JLabel("",JLabel.CENTER);
  statusLabel= new JLabel("",JLabel.CENTER);
  
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
  
  JButton smokeDectectedButton = new JButton("SmokeDetected");
  JButton smokeDisappearedButton = new JButton("Disbale SmokeDectector");
  
  smokeDectectedButton.setActionCommand("SmokeDetected");
  smokeDisappearedButton.setActionCommand("Disbale SmokeDectector");
  
  smokeDectectedButton.addActionListener(new ButtonClickListener());
  smokeDisappearedButton.addActionListener(new ButtonClickListener());
  
  controlPanel.add(smokeDectectedButton);
  controlPanel.add(smokeDisappearedButton);
  
   }; separator="\n"$
  mainFrame.setVisible(true);
  }
  
  private class ButtonClickListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
   $SensorDriver.allGeneratedInfo:{ generatedInfo | 
    if($generatedInfo.name; format="avoidCapital"$Condition)
   { 
    statusLabel.setText(" Smoke is dectected ");
    handler$generatedInfo.name$.onNew$generatedInfo.name$(new  $generatedInfo.type.name$(true));
  }
 
  else 
   }; separator="\n"$
  System.out.println("Enter Valid Condition");
  }
  }
  
  @Override
  public boolean isEventDriven() {
    return true;
  }

}
