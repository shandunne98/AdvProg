package numbersAndStrings;

/**
 * @author B00105244
 *
 */
public class ItalianStringConversionTester
{

	/**
	 * Calls methods from other classes in the same package and invokes them
	 * @param args
	 */
	public static void main(String[] args)
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(ItalianNumberToStringConverter.convertNumberToString(i));
		}
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(ItalianStringToNumberConverter.convertStringToNumber(ItalianNumberToStringConverter.convertNumberToString(i)));
		}
	}

}
