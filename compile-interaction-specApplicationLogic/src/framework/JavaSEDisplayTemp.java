package deviceImpl;

import framework.*;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class JavaSEDisplayTemp implements IDisplayTemp {

  static JFrame aWindow = new JFrame("This is Simulated Heater");
  static JLabel jlabel1 = new JLabel();
  static boolean flag = true;
  public JavaSEDisplayTemp() {
  
  if (flag) {
      flag = false;
      aWindow.setBounds(50, 100, 400, 150);
      aWindow.setLayout(new FlowLayout());
      aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      aWindow.add(jlabel1);
      aWindow.setVisible(true);
    }
  
  }

    
    
    @Override
    public void DisplayTemp(TempStruct arg ) {
     //jlabel1.setText("Heater is DisplayTemp "+arg.gettempValue() +arg.getunitOfMeasurement() +arg.gettempValue() +arg.getunitOfMeasurement() +arg.gettempValue() +arg.gettempValue() +arg.getunitOfMeasurement() +arg.gettempValue() +arg.gettempValue() +arg.getunitOfMeasurement() +arg.gettempValue() +arg.gettempValue() +arg.getunitOfMeasurement() +arg.gettempValue() );
     jlabel1.setText(" DisplayTemp command is fired");
     } 
      
      
 
}