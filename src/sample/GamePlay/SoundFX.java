package sample.GamePlay;

import javax.sound.sampled.*;
import java.io.IOException;


public class SoundFX {

    String levelMusicOne = "/sample/Asset/SoundFX/Music/LevelOneMusic.wav";

    public void whilePlayGameMusic() {
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(SoundFX.class.getResourceAsStream(levelMusicOne));
            clip.open(inputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }catch (IOException ioexeption){
            ioexeption.printStackTrace();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }

    }
}
