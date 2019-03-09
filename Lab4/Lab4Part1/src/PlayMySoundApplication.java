import java.applet.*;
import java.net.*;
import java.io.*;
import java.util.*;
import sun.audio.*;

public class PlayMySoundApplication
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		/*  Use playAudio if running from the commandline otherwise use playStream,
		 *  respective methods didn't work depending if it was run on Eclipse or cli.
		 */
		final String songs[] = {"Arthur","Capaldi"};
		Scanner in = new Scanner(System.in);
		System.out.print("Audio or Stream?: ");
		String type = in.next();
		if(type.toLowerCase().contains("audio"))
		{
			System.out.print("Choose a number either 0 or 1: ");
			try
			{
				playAudio(songs[in.nextInt()]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("0 or 1 only");
				e.printStackTrace();
			}
		}
		else if(type.toLowerCase().contains("stream"))
		{
			System.out.print("Choose a number either 0 or 1: ");
			try
			{
				playStream(songs[in.nextInt()]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("0 or 1 only");
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Not a type");
		}
	}
	
	public static void playAudio(String file)
	{
		//Does not work from commandline
		try
		{
			//AudioClip sound = Applet.newAudioClip(new URL(""));
			AudioClip sound = Applet.newAudioClip(new File("audio/" + file + ".wav").toURI().toURL());
			sound.loop();
			System.out.println("Audio is now playing: " + file);
		}
		catch(MalformedURLException e)
		{
			System.out.println("File missing or incorrect bitrate/format");
			e.printStackTrace();
		}
	}
	
	public static void playStream(String file)
	{
		//Does not work from Eclipse
		try
		{
			//InputStream is = new URL(file).openStream();
			InputStream is = new FileInputStream("../audio/" + file + ".wav");
			//Eclipse telling me rt.jar has restrictions denying access??
			AudioStream as = new AudioStream(is);
			AudioPlayer.player.start(as);
			System.out.println("Stream is now playing: " + file);
		}
		catch(IOException e)
		{
			System.out.println("Error in accessing stream, try again from the commandline");
			e.printStackTrace();
		}
	}

}