package design.patterns.adapter;

/**
 * Created by dawid on 11/07/16.
 */
public class MusicPlayerAdapter implements IMusicPlayer {
    private IExtMusicPlayer player;

    public MusicPlayerAdapter(IExtMusicPlayer player) {
        this.player = player;
    }

    @Override
    public void play(String extType) {
        switch (extType) {
            case "mp3":
                player.playMp3();
                break;
            case "flac":
                player.playFlac();
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}
