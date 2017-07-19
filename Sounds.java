package brick_breaker;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sounds {
    static int flag=0;
    public void hitBricks(){

        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Apon\\Desktop\\Brick_Breaker_Final\\src\\brick_breaker\\hitBrick.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        }
        
        catch(UnsupportedAudioFileException uae) {
            System.out.println(uae);
        }
        catch(IOException ioe) {
            System.out.println(ioe);
        }
        catch(LineUnavailableException lua) {
            System.out.println(lua);
        }
    }
    
    public void gameOver(){

        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Apon\\Desktop\\Brick_Breaker_Final\\src\\brick_breaker\\gameOver.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
            clip.close();
        }
        
        catch(UnsupportedAudioFileException uae) {
            System.out.println(uae);
        }
        catch(IOException ioe) {
            System.out.println(ioe);
        }
        catch(LineUnavailableException lua) {
            System.out.println(lua);
        }
    }
    
    public void ballDrop(){

        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Apon\\Desktop\\Brick_Breaker_Final\\src\\brick_breaker\\ballDrop.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        }
        
        catch(UnsupportedAudioFileException uae) {
            System.out.println(uae);
        }
        catch(IOException ioe) {
            System.out.println(ioe);
        }
        catch(LineUnavailableException lua) {
            System.out.println(lua);
        }
    }
    
    public void gameOverFinal(){

        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Apon\\Desktop\\Brick_Breaker_Final\\src\\brick_breaker\\gameOverFinal.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            if(flag==0)
                clip.start();
            else if(flag==1)
                clip.close();
        }
        
        catch(UnsupportedAudioFileException uae) {
            System.out.println(uae);
        }
        catch(IOException ioe) {
            System.out.println(ioe);
        }
        catch(LineUnavailableException lua) {
            System.out.println(lua);
        }
    }
    
    public void hitFrame(){

        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Apon\\Desktop\\Brick_Breaker_Final\\src\\brick_breaker\\hitFrame.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        }
        
        catch(UnsupportedAudioFileException uae) {
            System.out.println(uae);
        }
        catch(IOException ioe) {
            System.out.println(ioe);
        }
        catch(LineUnavailableException lua) {
            System.out.println(lua);
        }
    }
    
    public static void startPage(){

        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Apon\\Desktop\\Brick_Breaker_Final\\src\\brick_breaker\\startPage.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        }
        
        catch(UnsupportedAudioFileException uae) {
            System.out.println(uae);
        }
        catch(IOException ioe) {
            System.out.println(ioe);
        }
        catch(LineUnavailableException lua) {
            System.out.println(lua);
        }
    }
    
}
