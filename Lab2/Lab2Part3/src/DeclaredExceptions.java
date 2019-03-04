import java.io.*;
/**
 * @author B00105244
 *
 */
public class DeclaredExceptions
{

	/**
	 * @param args
	 * openFile method needs to be in a try catch incase the
	 * program attempts to interact with a non-existent file
	 */
	public static void main(String[] args)
	{
		try
		{
			System.out.println(capitalizeString("can you hear me now"));
			openFile("foobar.txt");
		}
		catch(Exception e)
		{
			System.out.print("Error");
		}
	}
	
	public static String capitalizeString(String s) throws NullPointerException
	{
		return s.toUpperCase();
	}
	
	public static void openFile(String fileName) throws IOException
	{
		File file = new File(fileName);
		if(file.exists() == true)
		{
			System.out.print(fileName + " exists");
		}
		else
		{
			System.out.print(fileName + " does not exist");
		}
	}

}
