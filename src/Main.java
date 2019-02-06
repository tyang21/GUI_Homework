import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setBounds(300, 300, 500, 500);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel namelbl = new JLabel("Name:");
		namelbl.setBounds(50,0,125,50);
		frame.add(namelbl);
		
		JTextField name = new JTextField();
		name.setBounds(50, 100, 125, 50);
		frame.add(name);
		
		JLabel phonelbl = new JLabel("Phone: ");
		phonelbl.setBounds(175, 0, 125, 50);
		frame.add(phonelbl);
		
		JTextField phone = new JTextField();
		phone.setBounds(175, 100, 125, 50);
		frame.add(phone);
		
		JLabel display = new JLabel("");
		display.setBounds(100, 300, 250, 50);
		frame.add(display);
		
		JButton command = new JButton("Click");
		command.setBounds(100, 200, 125, 50);
		frame.add(command);
		command.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						command.setBounds(100, 200, 125, 50);
						String a = "Name: " + name.getText() + " Phone: " + phone.getText();
						display.setText(a);
					}
				});
		
				
	}

}
