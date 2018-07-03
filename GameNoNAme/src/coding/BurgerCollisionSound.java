package coding;

import java.io.File;
import javax.sound.sampled.*;


public class BurgerCollisionSound {
	
	public static void bulletHitSound(int i){
		
		if(i==1){
		
		try{
			
			File sound = new File("sounds//Burp.wav");
			AudioInputStream ais =AudioSystem.getAudioInputStream(sound);
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();
			
			
		}
		catch(Exception e){
			
			
		}
	}
		
		if(i==2){
			
		try{
			
			File sound = new File("sounds//BossLaugh.wav");
			AudioInputStream ais =AudioSystem.getAudioInputStream(sound);
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();
			
		}
		catch(Exception e){
			
			
		}
	}
		
		if(i==3){
			
		try{
			
			File sound = new File("sounds//GameBack.wav");
			AudioInputStream ais =AudioSystem.getAudioInputStream(sound);
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();
			clip.loop(clip.LOOP_CONTINUOUSLY);  
			
		}
		catch(Exception e){
			
			
		}
	}
		if(i==4){
			
		try{
			
			File sound = new File("sounds//GameOver1.wav");
			AudioInputStream ais =AudioSystem.getAudioInputStream(sound);
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();  
			clip.loop(clip.LOOP_CONTINUOUSLY);  
		}
		catch(Exception e){
			
			
		}
	}
		
		
	}
}
