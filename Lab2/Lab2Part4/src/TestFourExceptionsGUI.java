import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.net.*;

public class TestFourExceptionsGUI extends JFrame implements ActionListener
{
	JButton ioe = new JButton("Test IO Exception");
	JButton url = new JButton("Test URL Exception");
	JButton nul = new JButton("Test Null Pointer Exception");
	JButton gen = new JButton("Test General Exception");

	public TestFourExceptionsGUI()
	{
		super("Four Exceptions");
		setSize(350,180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//
		JPanel press = new JPanel();
		press.setLayout(new GridLayout(4,1));
		ioe.addActionListener(this);
		url.addActionListener(this);
		nul.addActionListener(this);
		gen.addActionListener(this);
		press.add(ioe);
		press.add(url);
		press.add(nul);
		press.add(gen);
		//
		JPanel pan = new JPanel(new BorderLayout());
		pan.add(press, BorderLayout.CENTER);
		Container con = getContentPane();
		con.add(pan);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new TestFourExceptionsGUI();
	}
	
	public static void testException(String str, String filename, String url, boolean generalExceptionActivated)
	{
		try
		{
			str.toCharArray(); //Null string potential error
			new FileReader(filename); //Unknown filename potential error
			new URL(url); //Badly written URL potential error
			if(generalExceptionActivated)
			{	
				//Potential error
				//this.clone(); //Will be caught as a general error!
			}
		}
		catch(NullPointerException e)
		{
			JOptionPane.showMessageDialog(null, "A Null Pointer Exception has been caught: " + e.getMessage(), "NullPointer Exception", JOptionPane.PLAIN_MESSAGE);
		}
		catch(MalformedURLException e)
		{
			JOptionPane.showMessageDialog(null, "A URL has been badly written, " + e.getMessage(), "Malformed URL Exception", JOptionPane.PLAIN_MESSAGE);
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null, "An IO Exception has been caught: " + e.getMessage(), "IO Exception", JOptionPane.PLAIN_MESSAGE);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Some general unidentified Exeptcion has been caught: " + e.getMessage(), "General Exception", JOptionPane.PLAIN_MESSAGE);
		}
		finally
		{
			JOptionPane.showMessageDialog(null, "The finally block has been called", "Finally Block", JOptionPane.PLAIN_MESSAGE);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object src = e.getSource();
		if(src == nul)
		{
			testException(null, "Real.txt", "http://www.itb.ie", false);
		}
		else if(src == url)
		{
			testException("Hi", "Real.txt", "ht//www.itb.ie", false);
		}
		else if(src == ioe)
		{
			testException("Hi", "Whatever.txt", "http://www.itb.ie", false);
		}
		else if(src == gen)
		{
			testException("Hi", "Real.txt", "http://www.itb.ie", true);
		}
		
		/*
		switch((String)src)
		{
			case "nul": testException(null, "Real.txt", "http://www.itb.ie", false); break;
			case "url": testException("Hi", "Real.txt", "ht//www.itb.ie", false); break;
			case "ioe": testException("Hi", "Whatever.txt", "http://www.itb.ie", false); break;
			case "gen": testException("Hi", "Real.txt", "http://www.itb.ie", true); break;
		}
		*/
	}

}
