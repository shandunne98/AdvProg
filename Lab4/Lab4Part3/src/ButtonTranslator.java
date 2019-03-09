import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonTranslator extends JFrame implements ActionListener
{
	JButton st = new JButton("One"),
			nd = new JButton("Two"),
			rd =new JButton("Three"),
			trans = new JButton("Translate to French");
	
	public ButtonTranslator()
	{
		super("Button Translator");
		setSize(260,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//
		JPanel alpha = new JPanel(new BorderLayout());
		trans.addActionListener(this);
		alpha.add(st, BorderLayout.WEST);
		alpha.add(nd, BorderLayout.CENTER);
		alpha.add(rd, BorderLayout.EAST);
		alpha.add(trans, BorderLayout.SOUTH);
		//
		JPanel pan = new JPanel();
		pan.add(alpha, BorderLayout.NORTH);
		Container con = getContentPane();
		con.add(pan);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new ButtonTranslator();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object src = e.getSource();
		if(src == trans)
		{
			trans.setText(ListResourceBundle.handleGetObject(trans.getText()));
			st.setText(ListResourceBundle.handleGetObject(st.getText()));
			nd.setText(ListResourceBundle.handleGetObject(nd.getText()));
			rd.setText(ListResourceBundle.handleGetObject(rd.getText()));
		}
		else
		{
			System.out.println("Nothing to do");
		}
	}

}
