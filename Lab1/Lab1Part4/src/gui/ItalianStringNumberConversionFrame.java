package gui;
import javax.swing.*;
import javax.swing.event.*;
import numbersAndStrings.*;
import java.awt.*;
import java.awt.event.*;
/**
 * @author B00105244
 *
 */
public class ItalianStringNumberConversionFrame extends JFrame implements ActionListener
{
	JTextField in = new JTextField(10);
	JTextField out = new JTextField(10);
	JButton convert = new JButton("Convert");
	/**
	 * Variables declared outside scope of methods so that actionPerformed can interact with variables
	 */
	public ItalianStringNumberConversionFrame()
	{
		super("Italian Conversion");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//
		JPanel alpha = new JPanel(new BorderLayout());
		JPanel bravo = new JPanel(new BorderLayout());
		JPanel charlie = new JPanel();
		JLabel num = new JLabel("Enter an Integer to convert to Italian String: ");
		JLabel res = new JLabel("The text version of the number entered in Italian is: ");
		convert.addActionListener(this);
		//
		alpha.add(num, BorderLayout.NORTH);
		alpha.add(in, BorderLayout.SOUTH);
		bravo.add(res, BorderLayout.NORTH);
		bravo.add(out, BorderLayout.SOUTH);
		charlie.add(convert);
		//
		JPanel pan = new JPanel(new BorderLayout());
		pan.add(alpha, BorderLayout.NORTH);
		pan.add(charlie, BorderLayout.CENTER);
		pan.add(bravo, BorderLayout.SOUTH);
		Container con = getContentPane();
		con.add(pan);
		setVisible(true);
	}

	/**
	 * @param args Creates the JFrame
	 */
	public static void main(String[] args)
	{
		new ItalianStringNumberConversionFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object src = e.getSource();
		if(src == convert)
		{
			out.setText(ItalianNumberToStringConverter.convertNumberToString(Integer.parseInt(in.getText())));
		}
	}

}
