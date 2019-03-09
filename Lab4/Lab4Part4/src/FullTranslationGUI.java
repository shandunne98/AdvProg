import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class FullTranslationGUI extends JFrame implements ActionListener
{
	JButton lst = new JButton("List All Locales");
	JTextArea txt = new JTextArea(30,100);
	Locale lces[] = Calendar.getAvailableLocales();
	Locale opt[] =
	{
		new Locale("en","UK"),
		new Locale("de","DE"),
		new Locale("es","ES")
	};
	JComboBox<Locale> langs = new JComboBox<>(opt);
	
	public FullTranslationGUI()
	{
		super("Full Translations");
		setSize(1250,570);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//
		JPanel alpha = new JPanel();
		alpha.setLayout(new BoxLayout(alpha, BoxLayout.Y_AXIS));
		lst.addActionListener(this);
		alpha.add(langs);
		alpha.add(txt);
		lst.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		alpha.add(lst);
		//
		JPanel pan = new JPanel();
		pan.add(alpha);
		Container con = getContentPane();
		con.add(pan);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new FullTranslationGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object src = e.getSource();
		if(src == lst)
		{
			for(Locale l : lces)
			{
				txt.setText(txt.getText() + "\n" + l.toString());
			}
		}
	}

}
