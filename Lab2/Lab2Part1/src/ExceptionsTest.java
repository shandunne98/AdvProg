public class ExceptionsTest
{
	public static void main(String[] args)
	{
		int blackhole;
		try
		{
			blackhole = 255/0;
			System.out.print("United as 1, divided by " + blackhole);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("B00105244");
		}
	}

}
