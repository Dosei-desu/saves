import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;

void setup() {
  sound();
  
}

void sound() {
    File sound = new File("C:/Users/Bruger/Desktop/loop.wav");
    try{
        Clip clip = AudioSystem.getClip();
        clip.open(AudioSystem.getAudioInputStream(sound));
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    } catch (Exception e){
        e.printStackTrace();
    }
}
