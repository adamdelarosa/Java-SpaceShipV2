package sample.GamePlay;

import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;


public class SoundFX {

    public SoundFX(){
        whilePlayGameMusic();
    }


    public void whilePlayGameMusic(){
        AudioPlayer myBackgroundPlayer = AudioPlayer.player;
        ContinuousAudioDataStream myLoop = null;
        try {
            AudioStream myBackgroundMusic = new AudioStream(
                    getClass().getResourceAsStream("sample/Asset/SoundFX/Music/LevelOneMusic.wav"));
            AudioData myData = myBackgroundMusic.getData();
            myLoop = new ContinuousAudioDataStream(myData);
        }catch(Exception error){
            System.out.println("Music file error: " + error);
        }
        myBackgroundPlayer.start(myLoop);
    }

}
