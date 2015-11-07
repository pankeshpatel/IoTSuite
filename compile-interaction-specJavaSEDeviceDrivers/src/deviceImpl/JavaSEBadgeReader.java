package deviceImpl;

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

public class JavaSEBadgeReader implements IBadgeReader {

  private JFrame mainFrame;
  private JLabel headerLabel;
  private JLabel statusLabel;
  private JPanel controlPanel;

       

     String badgeID; 
    
     String badgeEvent; 
    

       private boolean badgeDetectedCondition = false;    
           private ListenerbadgeDetected handlerbadgeDetected;
     

       private boolean badgeDisappearedCondition = false;    
           private ListenerbadgeDisappeared handlerbadgeDisappeared;
     
  
   public JavaSEBadgeReader() { 
     prepareGUI();
     showEventDemo();
  } 
  
 

     @Override
     public void getbadgeDetected(ListenerbadgeDetected handler){
      handlerbadgeDetected=handler;     
     }   
          
    /* @Override
     public  BadgeStruct getbadgeDetected(){
         return null;
     }*/


     @Override
     public void getbadgeDisappeared(ListenerbadgeDisappeared handler){
      handlerbadgeDisappeared=handler;     
     }   
          
    /* @Override
     public  BadgeStruct getbadgeDisappeared(){
         return null;
     }*/


  private void prepareGUI()
  {
  mainFrame= new JFrame("Simulated BadgeReader");
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
  

      
      JButton badgeDetectedButton = new JButton("badgeDetected");
       
      badgeDetectedButton.setActionCommand("badgeDetected");
       
      badgeDetectedButton.addActionListener(new ButtonClickListener());
       
      controlPanel.add(badgeDetectedButton);
      
       

      
      JButton badgeDisappearedButton = new JButton("badgeDisappeared");
       
      badgeDisappearedButton.setActionCommand("badgeDisappeared");
       
      badgeDisappearedButton.addActionListener(new ButtonClickListener());
       
      controlPanel.add(badgeDisappearedButton);
      
       
  mainFrame.setVisible(true);
  }
  
  
  private class ButtonClickListener implements ActionListener{
  public void actionPerformed(ActionEvent e){

       if(badgeDetectedCondition)
      { 
      
       statusLabel.setText(" badgeDetected event is happened.....");
       handlerbadgeDetected.onNewbadgeDetected(new  BadgeStruct (badgeID,badgeEvent) );
     }
    
      

       if(badgeDisappearedCondition)
      { 
      
       statusLabel.setText(" badgeDisappeared event is happened.....");
       handlerbadgeDisappeared.onNewbadgeDisappeared(new  BadgeStruct (badgeID,badgeEvent) );
     }
    
      
 }
  }
  
  @Override
  public boolean isEventDriven() {
    return true;
  }

}