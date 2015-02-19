package switchcontroller.controllerlogic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.bitreactive.library.mqtt.MQTTConfigParam;
import com.bitreactive.library.mqtt.MQTTMessage;
import com.bitreactive.library.mqtt.robustmqtt.RobustMQTT.Parameters;

import no.ntnu.item.arctis.runtime.Block;

public class ControllerLogic extends Block {

	private static final String mqtt_topic = "zonecontroller_1";
	
	public Parameters initMQTTParam() {
		MQTTConfigParam m = new MQTTConfigParam("dev.bitreactive.com");
		m.addSubscribeTopic("mqtt_topic");
		Parameters p = new Parameters(m);
		return p;
	}

	public void openGUI() {
		JFrame frame = new JFrame("Controller");
		frame.setLayout(new GridLayout(5, 1));

		Font font = new Font("SansSerif", Font.BOLD, 18);

		/*-------------------------------SWITCH 1-------------------------------*/
		JPanel switch1_panel = new JPanel();
		switch1_panel.setLayout(new BorderLayout());
		
		JLabel title1 = new JLabel("Railroad Switch 1");
		title1.setFont(font);
		switch1_panel.add(title1, BorderLayout.NORTH);
		
		final JButton switch1_setToPos1Button = new JButton("Position 1");
		switch1_setToPos1Button.setOpaque(true);
		switch1_setToPos1Button.setBorderPainted(false);
		switch1_setToPos1Button.setBackground(Color.gray);
		switch1_setToPos1Button.setForeground(Color.white);
		switch1_panel.add(switch1_setToPos1Button, BorderLayout.WEST);

		final JButton switch1_setToPos2Button = new JButton("Position 2");
		switch1_setToPos2Button.setOpaque(true);
		switch1_setToPos2Button.setBorderPainted(false);
		switch1_setToPos2Button.setBackground(Color.red);
		switch1_setToPos2Button.setForeground(Color.white);
		switch1_panel.add(switch1_setToPos2Button, BorderLayout.EAST);

		/*final JTextField angleValue = new JTextField();
		Font font1 = new Font("SansSerif", Font.BOLD, 30);
		angleValue.setFont(font1);
		angleValue.setHorizontalAlignment(JTextField.CENTER);
		switch1_panel.add(angleValue);*/
		
		/*final JButton switch1_terminate = new JButton("Terminate Train");
		switch1_terminate.setOpaque(true);
		switch1_terminate.setBorderPainted(false);
		switch1_terminate.setBackground(Color.red);
		switch1_terminate.setForeground(Color.white);
		switch1_panel.add(switch1_terminate, BorderLayout.SOUTH);*/

		switch1_setToPos1Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//int angle = angleValue.getText() == "" ? 0 : Integer.parseInt(angleValue.getText());
				sendToBlock("SENDCOMMAND", "controller;zonecontroller_1;switch_1;position1"); 
			}//sent from switch, sent to switch with id 1, set switch to position 1
		});
		switch1_setToPos2Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//int angle = angleValue.getText() == "" ? 0 : Integer.parseInt(angleValue.getText());
				sendToBlock("SENDCOMMAND", "controller;zonecontroller_1;switch_1;position2");

			}
		});
		/*switch1_terminate.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent e){
		    	  sendToBlock("SENDCOMMAND", "switchcontroller;1;terminate");
		      }
		  });*/
		/*-------------------------------SWITCH 1 END-------------------------------*/
		
		/*-------------------------------SWITCH 2-------------------------------*/
		JPanel switch2_panel = new JPanel();
		switch2_panel.setLayout(new BorderLayout());
				
		JLabel switch2_title = new JLabel("Railroad Switch 2");
		switch2_title.setFont(font);
		switch2_panel.add(switch2_title, BorderLayout.NORTH);
		
		final JButton switch2_setToPos1Button = new JButton("Position 1");
		switch2_setToPos1Button.setOpaque(true);
		switch2_setToPos1Button.setBorderPainted(false);
		switch2_setToPos1Button.setBackground(Color.gray);
		switch2_setToPos1Button.setForeground(Color.white);
		switch2_panel.add(switch2_setToPos1Button, BorderLayout.WEST);

		final JButton switch2_setToPos2Button = new JButton("Position 2");
		switch2_setToPos2Button.setOpaque(true);
		switch2_setToPos2Button.setBorderPainted(false);
		switch2_setToPos2Button.setBackground(Color.red);
		switch2_setToPos2Button.setForeground(Color.white);
		switch2_panel.add(switch2_setToPos2Button, BorderLayout.EAST);
		
		switch2_setToPos1Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sendToBlock("SENDCOMMAND", "controller;zonecontroller_1;switch_2;position1"); 
			}//sent from switch, sent to switch with id 1, set switch to position 1
		});
		switch2_setToPos2Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sendToBlock("SENDCOMMAND", "controller;zonecontroller_1;switch_2;position2");

			}
		});
		
		/*-------------------------------SWITCH 2 END-------------------------------*/
		/*-------------------------------SWITCH 3-------------------------------*/
		JPanel switch3_panel = new JPanel();
		switch3_panel.setLayout(new BorderLayout());
				
		JLabel switch3_title = new JLabel("Railroad Switch 3");
		switch3_title.setFont(font);
		switch3_panel.add(switch3_title, BorderLayout.NORTH);
		
		final JButton switch3_setToPos1Button = new JButton("Position 1");
		switch3_setToPos1Button.setOpaque(true);
		switch3_setToPos1Button.setBorderPainted(false);
		switch3_setToPos1Button.setBackground(Color.gray);
		switch3_setToPos1Button.setForeground(Color.white);
		switch3_panel.add(switch3_setToPos1Button, BorderLayout.WEST);

		final JButton switch3_setToPos2Button = new JButton("Position 2");
		switch3_setToPos2Button.setOpaque(true);
		switch3_setToPos2Button.setBorderPainted(false);
		switch3_setToPos2Button.setBackground(Color.red);
		switch3_setToPos2Button.setForeground(Color.white);
		switch3_panel.add(switch3_setToPos2Button, BorderLayout.EAST);

		switch3_setToPos1Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sendToBlock("SENDCOMMAND", "controller;zonecontroller_1;switch_3;position1"); 
			}//sent from switch, sent to switch with id 1, set switch to position 1
		});
		switch3_setToPos2Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sendToBlock("SENDCOMMAND", "controller;zonecontroller_1;switch_3;position2");

			}
		});
		
		/*-------------------------------SWITCH 3 END-------------------------------*/
		/*-------------------------------SWITCH 4-------------------------------*/
		JPanel switch4_panel = new JPanel();
		switch4_panel.setLayout(new BorderLayout());
				
		JLabel switch4_title = new JLabel("Railroad Switch 4");
		switch4_title.setFont(font);
		switch4_panel.add(switch4_title, BorderLayout.NORTH);
		
		final JButton switch4_setToPos1Button = new JButton("Position 1");
		switch4_setToPos1Button.setOpaque(true);
		switch4_setToPos1Button.setBorderPainted(false);
		switch4_setToPos1Button.setBackground(Color.gray);
		switch4_setToPos1Button.setForeground(Color.white);
		switch4_panel.add(switch4_setToPos1Button, BorderLayout.WEST);

		final JButton switch4_setToPos2Button = new JButton("Position 2");
		switch4_setToPos2Button.setOpaque(true);
		switch4_setToPos2Button.setBorderPainted(false);
		switch4_setToPos2Button.setBackground(Color.red);
		switch4_setToPos2Button.setForeground(Color.white);
		switch4_panel.add(switch4_setToPos2Button, BorderLayout.EAST);
		
		final JButton terminateButton = new JButton("Terminate SwitchController");
		terminateButton.setOpaque(true);
		terminateButton.setBorderPainted(false);
		terminateButton.setBackground(Color.red);
		terminateButton.setForeground(Color.white);
		switch4_panel.add(terminateButton, BorderLayout.SOUTH);

		switch4_setToPos1Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sendToBlock("SENDCOMMAND", "controller;zonecontroller_1;switch_4;position1"); 
			}//sent from switch, sent to switch with id 1, set switch to position 1
		});
		switch4_setToPos2Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sendToBlock("SENDCOMMAND", "controller;zonecontroller_1;switch_4;position2");

			}
		});
		terminateButton.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent e){
		    	  sendToBlock("SENDCOMMAND", "controller;zonecontroller_1;switch_1;terminate"); //doesn't matter what the switch id parameter is (x)
		      }
		  });
		
		/*-------------------------------SWITCH 4 END-------------------------------*/
		frame.add(switch1_panel);
		frame.add(switch2_panel);
		frame.add(switch3_panel);
		frame.add(switch4_panel);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public MQTTMessage createMQTTMessage(String request) {
		byte[] bytes = request.getBytes();
		MQTTMessage message = new MQTTMessage(bytes, mqtt_topic);
		message.setQoS(2);
		return message;
	}

}
