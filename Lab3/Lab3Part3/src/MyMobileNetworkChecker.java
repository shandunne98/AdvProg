/**
 * @author B00105244
 *
 */
public class MyMobileNetworkChecker
{
	/**
	 * @param args
	 * @throws NotMyNetworkException
	 * Uses custom exception and checks if given network matches the correct carrier
	 */
	public static void main(String[] args)
	{
		try
		{
			checkMyMobileNetwork("Huawei");
			//checkMyMobileNetwork("Vodafone");
			
		}
		catch(NotMyNetworkException e)
		{
			System.out.println("Wrong network given");
			e.printStackTrace();
		}
	}
	
	public static void checkMyMobileNetwork(String inputNetwork) throws NotMyNetworkException
	{
		if(inputNetwork != "Vodafone")
		{
			throw new NotMyNetworkException("Network " + inputNetwork + " is incorrect");
		}
		else
		{
			System.out.println("Network is correct");
		}
	}

}
