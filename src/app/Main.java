package app;

public class Main {

    public static void main(String[] args) {

        MediaFacade media = new MediaFacade();
        media.watchMovie("Lord of the Rings");

        //enjoy the movie!

        media.stopMovie();


        media.listenToMusic("Snappie de kleine krokodil");

        //Enjoy your song!

        media.stopMusic();


        media.listenRadio(69);

        //Sick radio tunes

        media.stopRadio();




        //Amplifier amp = new Amplifier("Top-O-Line Amplifier");

        //Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);

        //DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);

        //CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);

        //Projector projector = new Projector("Top-O-Line Projector", dvd);

        //TheaterLights lights = new TheaterLights("Theater Ceiling Lights");

        //Screen screen = new Screen("Theater Screen");

        //PopcornPopper popper = new PopcornPopper("Popcorn Popper");

    }
}


