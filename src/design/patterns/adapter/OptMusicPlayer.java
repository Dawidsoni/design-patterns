package design.patterns.adapter;

/**
 * Created by dawid on 11/07/16.
 */
public class OptMusicPlayer implements IExtMusicPlayer {

    @Override
    public void playMp3() {
        System.out.println("Playing mp3 on opt music player");
    }

    @Override
    public void playFlac() {
        System.out.println("Playing flac on opt music player");
    }
}
