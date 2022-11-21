package jukebox_part1;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import gr.hua.dit.oop2.musicplayer.Player;
import gr.hua.dit.oop2.musicplayer.PlayerException;
import gr.hua.dit.oop2.musicplayer.PlayerFactory;

public class MP3 {
	public void playsong(String songFile) 
	{
		Player p = PlayerFactory.getPlayer();
		try {
		InputStream song = new FileInputStream(songFile);
		System.out.println("Song is playing...");
		System.out.println("heynig1");
		p.play(song);
		System.out.println("heynig");
		}catch (FileNotFoundException e) {
		System.err.println("File "+ songFile+ " not found");
		} catch (PlayerException e) {
		System.err.println("Something's wrong with the player: " + e.getMessage());
		} finally {
		if (p != null)
		p.close();
		}
	}
	public void playloop(String songFile) 
	{
		while (true) 
		{
			Player p = PlayerFactory.getPlayer();
			try {
			InputStream song = new FileInputStream(songFile);
			System.out.println("Song is playing...");
			System.out.println("heynig1");
			p.play(song);
			System.out.println("heynig");
			}catch (FileNotFoundException e) {
			System.err.println("File "+ songFile+ " not found");
			} catch (PlayerException e) {
			System.err.println("Something's wrong with the player: " + e.getMessage());
			}
		}
	}
}
