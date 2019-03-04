package numbersAndStrings;

/**
 * @author B00105244
 *
 */
public class ItalianNumberToStringConverter
{
	/**
	 * 
	 * @param num
	 * @return Return the String version in Italian of given integer
	 */
	public static String convertNumberToString(int num)
	{
		switch(num)
		{
			case 1: return "Uno";
			case 2: return "Due";
			case 3: return "Tre";
			case 4: return "Quattro";
			case 5: return "Cinque";
			default: return "Number too high";
		}
	}

}
