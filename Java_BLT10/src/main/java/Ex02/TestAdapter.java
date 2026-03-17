package Ex02;

public class TestAdapter {
    public static void main(String[] args) {

        MediaPlayer player = new MediaAdapter();

        player.play("vlc", "music.vlc");

    }
}
