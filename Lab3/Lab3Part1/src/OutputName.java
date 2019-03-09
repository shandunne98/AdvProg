import java.io.*;

public class OutputName
{

	public static void main(String[] args) //throws IOException
	{
		//File nameFile = new File("myName.txt");
		try//(nameFile) /** Java 9 Enhancement **/
		{
			File nameFile = new File("myName.txt");
			BufferedReader read = new BufferedReader(new FileReader(nameFile));
			System.out.println(read.readLine());
		}
		catch(Exception e)
		{
			System.out.println("File does not exist");
		}
	}

}
