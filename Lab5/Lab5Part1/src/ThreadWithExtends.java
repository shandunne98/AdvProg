public class ThreadWithExtends extends Thread
{
	public static String ltrs[] = {"A","B","C"};

	public void run()
	{
		for(String l : ltrs)
		{
			System.out.println(Thread.currentThread().getName() + "\nLetter: " + l);
		}
	}

}
