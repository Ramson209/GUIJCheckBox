import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener
{
	JButton button;
	JCheckBox CheckBox;
	ImageIcon XIcon;
	ImageIcon checkIcon;
MyFrame(){
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
	
	XIcon = new ImageIcon("C:\\Users\\MR ODOI\\eclipse-workspace\\GUIJCheckBox\\img\\ok.png");
	checkIcon = new ImageIcon("C:\\Users\\MR ODOI\\eclipse-workspace\\GUIJCheckBox\\img\\images(4).jpg");
	
    button = new JButton();
	button.setText("Submit");
	button.addActionListener(this);
	
	
    CheckBox = new JCheckBox();
	CheckBox.setText("I'm not a robot");
	CheckBox.setFocusable(false);
	CheckBox.setFont(new Font("Consolas",Font.PLAIN,35));
	CheckBox.setIcon(XIcon);
	CheckBox.setSelectedIcon(checkIcon);
	
	this.add(button);
	this.add(CheckBox);
	this.pack();
	this.setVisible(true);
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button) {
			System.out.println(CheckBox.isSelected());
		}
		
	}

}
