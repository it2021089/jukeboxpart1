package jukebox_part1;
public class Jukebox 
{
	public static void main(String[] args) {
		MP3 Jplayer = new MP3();
		if (args[0].endsWith(".mp3")) 
		{
			if (args.length > 1) 
			{
				if (args[1].equalsIgnoreCase("loop")) 
				{
					Jplayer.playloop(args[0]);
				}
				else 
				{
					System.err.println("Wrong action...");
				}
				
			}
			else 
			{
				Jplayer.playsong(args[0]);
			}
			
			
		} else if (args[0].endsWith(".m3u")) 
		{
			System.out.println("hi");
		}
		else 
		{
			System.err.println("Invalid file type!");
			
		}
		
		}
}
