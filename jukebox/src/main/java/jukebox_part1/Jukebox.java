package jukebox_part1;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import gr.hua.dit.oop2.musicplayer.Player;
import gr.hua.dit.oop2.musicplayer.PlayerException;
import gr.hua.dit.oop2.musicplayer.PlayerFactory;

public class Jukebox 
{
	public static void main(String[] args) {
		Player p = PlayerFactory.getPlayer();
		try {
		InputStream song = new FileInputStream("A_Tribe_Called_Quest_-_Bonita_Applebum.mp3");
		System.out.println("Song is playing...");
		p.play(song);
		}catch (FileNotFoundException e) {
		System.err.println("File papakia.mp3 not found");
		} catch (PlayerException e) {
		System.err.println("Something's wrong with the player: " + e.getMessage());
		} finally {
		if (p != null)
		p.close();
		}
		}
}
