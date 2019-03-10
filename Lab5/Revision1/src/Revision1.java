import java.io.IOException;
import java.util.logging.*;

public class Revision1
{
	private final static Logger LOG = Logger.getLogger(Revision1.class.getName());
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, SecurityException, IOException
	{
		Handler out = new FileHandler("exceptions.log");
		out.setFormatter(new SimpleFormatter());
		LOG.setLevel(Level.ALL);
		LOG.addHandler(out);
		int nums[] = {255,192,64,32};
		try
		{
			System.out.println(nums[1024]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			LOG.log(Level.ALL, "Trying to reach something that doesn't exist\n" + e.getMessage().toString(), e);
			LOG.log(Level.ALL, "Stack Trace\n" + e.getStackTrace().toString(), e);
		}
	}

}
