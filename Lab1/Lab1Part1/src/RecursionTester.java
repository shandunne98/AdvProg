/**
 @author B00095740
 */

public class RecursionTester
{
	/**
	 Executes main method
	 */

	public static void main(String[] args)
	{
		System.out.println(recursiveAddition(5));//prints system out

	}
	
	/**
	 * Recursively adds the factorials of given integer
	 */
	
	public static int recursiveAddition(int i)
	{
		if(i == 1)
		{
			return i;
		}
		else
		{
			return i + recursiveAddition(i - 1);
		}
	}

}
