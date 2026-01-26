public class HomeTheaterFacade {

    private TV tv;
    private SoundSystem sound;
    private DVDPlayer dvd;

    public HomeTheaterFacade() {
        tv = new TV();
        sound = new SoundSystem();
        dvd = new DVDPlayer();
    }

    public void watchMovie() {
        tv.turnOn();
        sound.turnOn();
        dvd.playMovie();
    }
}
