public class MultipleCatchBlocks
{
	public static void main(String[] args)
	{
		int nums[] = {0,1,2,3,4};
		Object blackhole = null;
		try
		{
			System.out.println(nums[5]);
			blackhole.getClass();
		}
		catch(ArrayIndexOutOfBoundsException arr)
		{
			arr.printStackTrace();
			System.out.println("This doesn't exist, just like you're knowledge in Java");
		}
		catch(NullPointerException nul)
		{
			nul.printStackTrace();
			System.out.println("You can't have what doesn't exists");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("I make no exceptions");
		}
	}

}