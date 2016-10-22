package deviceImpl;

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
import javax.swing.JTextField;

import framework.*;

public class JavaSEBadgeReader implements IBadgeReader {

	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	private JTextField jtfTextField = new JTextField("Enter BadgeID");
	private ListenerbadgeDetected handlerBadgeDetected;
	private ListenerbadgeDisappeared handlerBadgeDisappeared;

	// private boolean badgeEventFlag;

	// private boolean badgeDisappearFlag = false;
	// private boolean badgeStatus = false;

	public JavaSEBadgeReader() {
		prepareGUI();
		showEventDemo();
	}

	@Override
	public void getbadgeDisappeared(ListenerbadgeDisappeared handler) {

		handlerBadgeDisappeared = handler;

	}

	@Override
	public void getbadgeDetected(ListenerbadgeDetected handler) {

		handlerBadgeDetected = handler;

	}

	@Override
	public boolean isEventDriven() {
		return true;
	}

	private void prepareGUI() {
		mainFrame = new JFrame("Simulated Badge Reader");
		mainFrame.setSize(200, 200);
		mainFrame.setLayout(new GridLayout(3, 1));

		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);
		
		jtfTextField = new JTextField(5);

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
		mainFrame.add(jtfTextField);
		
		
		
		mainFrame.setVisible(true);
	}

	private void showEventDemo() {

		JButton badgeDetectedButton = new JButton("BadgeDetected");
		JButton badgeDisappearedButton = new JButton("BadgeDisappeared");

		badgeDetectedButton.setActionCommand("BadgeDetected");
		badgeDisappearedButton.setActionCommand("BadgeDisappeared");

		badgeDetectedButton.addActionListener(new ButtonClickListener());
		badgeDisappearedButton.addActionListener(new ButtonClickListener());

		controlPanel.add(badgeDetectedButton);
		controlPanel.add(badgeDisappearedButton);

		mainFrame.setVisible(true);
	}

	private class ButtonClickListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if (command.equals("BadgeDetected")) {
				statusLabel.setText("BadgeDetected event is happened...");
				String getText = jtfTextField.getText();
				
				handlerBadgeDetected.onNewbadgeDetected(new BadgeStruct(getText,
						"in"));

			} else if (command.equals("BadgeDisappeared")) {
				statusLabel.setText("BadgeDisappeared event is happened...");
				handlerBadgeDisappeared.onNewbadgeDisappeared(new BadgeStruct(
						"1", "in"));

			}

		}
	}

}