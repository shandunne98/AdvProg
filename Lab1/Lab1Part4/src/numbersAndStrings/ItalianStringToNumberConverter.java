package numbersAndStrings;

/**
 * @author B00105244
 *
 */
public class ItalianStringToNumberConverter
{
	/**
	 * 
	 * @param num
	 * @return Return the String version in Italian of given integer
	 */
	public static int convertStringToNumber(String str)
	{
		switch(str)
		{
			case "Uno": return 1;
			case "Due": return 2;
			case "Tre": return 3;
			case "Quattro": return 4;
			case "Cinque": return 5;
			default: return 0;
		}
	}

}
