package facade;

/**
 * @author I-Chung, Wang
 * @date 2021/6/15 下午 04:00
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        // instantiate components here
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DVDPlayer dvd = new DVDPlayer();
        CDPlayer cd = new CDPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);
        homeTheater.watchMovie("Toy Story 4");
        homeTheater.endMovie();
    }
}
