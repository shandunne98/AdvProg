public class TestThread
{
	public static void main(String[] args)
	{
		Thread fork[] = new Thread[10];
		for(int i = 0; i < 10; i++)
		{
			fork[i] = new ThreadWithExtends();
		}
		for(Thread t : fork)
		{
			synchronized(t)
			{
				t.start();
			}
		}
	}

}
