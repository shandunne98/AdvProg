package mathematics;

/**
 * @author B00105244
 *
 */
public class MathHelper
{
	public static int factorial(int i)
	{
		if(i == 1)
		{
			return i;
		}
		else
		{
			return i * factorial(i - 1);
		}
	}

}