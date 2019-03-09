import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
/**
 * 
 @author B00105244
 *
 */
public class RetryAction extends JFrame implements ActionListener
{
	JButton inputButton = new JButton("Display contents of array");
	String stringArray[] = {"A","B","C"};
	JLabel inputLabel = new JLabel("Please enter the index number of the array requested by the user:");
	JLabel outputLabel = new JLabel(" ");
	JTextField inputField = new JTextField(5);
	/**
	 * @param args GUI with try-catch block for going out of bounds in an array
	 */
	public RetryAction()
	{
		super("Second Chance");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//
		JPanel alpha = new JPanel();
		alpha.setLayout(new BoxLayout(alpha, BoxLayout.Y_AXIS));
		inputButton.addActionListener(this);
		alpha.add(inputLabel);
		alpha.add(inputField);
		alpha.add(outputLabel);
		alpha.add(inputButton);
		//
		JPanel pan = new JPanel();
		pan.add(alpha);
		Container con = getContentPane();
		con.add(pan);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new RetryAction();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object src = e.getSource();
		int index = Integer.valueOf(inputField.getText());
		if(src == inputButton)
		{
			try
			{
				outputLabel.setText(stringArray[index]);
			}
			catch(ArrayIndexOutOfBoundsException a)
			{
				index = Integer.valueOf(JOptionPane.showInputDialog("You attempted to access beyond the limits of the array, please try again"));
				inputField.setText(String.valueOf(index));
				outputLabel.setText(stringArray[index]);
			}
		}
	}

}
