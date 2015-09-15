package $Actuatordriver.factoryDeviceImplActuator$;

import framework.*;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class JavaSE$Actuatordriver.name$ implements I$Actuatordriver.name$ {

  static JFrame aWindow = new JFrame("This is Simulated Heater");
  static JLabel jlabel1 = new JLabel();
  static boolean flag = true;
  public JavaSE$Actuatordriver.name$() {
  
  if (flag) {
      flag = false;
      aWindow.setBounds(50, 100, 400, 150);
      aWindow.setLayout(new FlowLayout());
      aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      aWindow.add(jlabel1);
      aWindow.setVisible(true);
    }
  
  }

  $Actuatordriver.allActions:{ action |   
  
  @Override
  public void $action.name$($action.allParameter:{ param | $param.type.name$ arg }; 
   separator=", "$) {
   //jlabel1.setText("Heater is $action.name$ "+$Actuatordriver.allFieldName:{ fieldName | arg.get$fieldName$() };separator="+" $);
jlabel1.setText(" $action.name$ command is fired");
   } 
    
   }; separator="\n"$ 
 
}


