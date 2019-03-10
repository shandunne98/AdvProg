public class ThreadWithRunnable implements Runnable
{
	public static int nums[] = {1,2,3};
	Thread fork[] = new Thread[10];
	
	public void ThreadWithRunnable()
	{
		for(int i = 0; i < 10; i++)
		{
			this.fork[i] = new Thread(this, "Numbers");
		}
		for(Thread t : fork)
		{
			t.start();
		}
	}

	@Override
	public void run()
	{
		for(int i : nums)
		{
			System.out.println(Thread.currentThread().getName() + "\nNumber: " + i);
		}
	}

}
