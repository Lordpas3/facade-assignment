package app;

public class MediaFacade {

    //make machines
    PopcornPopper popper = new PopcornPopper("Popcorn Popper");
    Screen screen = new Screen("Theater Screen");
    TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
    Amplifier amp = new Amplifier("Top-O-Line Amplifier");
    DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
    Projector projector = new Projector("Top-O-Line Projector", dvd);
    Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
    CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);


    public void watchMovie(String movie) {
        //turn on popper and let it pop
        popper.on();
        popper.pop();

        //turn lights off
        lights.off();

        //put screen down
        screen.down();

        //turn projector on and set to widescreenmode
        projector.on();
        projector.wideScreenMode();

        //turn on amp, insert dvd and turn on surround, volume to 5
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);

        //turn dvd on and play movie
        dvd.on();
        dvd.play(movie);
    }

    public void stopMovie() {
        //turn off popper
        popper.off();

        //turn lights on
        lights.on();

        //put screen up
        screen.up();

        //turn off projector and amp
        projector.off();
        amp.off();

        //stop dvd and eject, then turn off
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

    public void listenToMusic(String cdTitle) {
        //put lights on
        lights.on();

        //turn amp on, volume on 5
        amp.on();
        amp.setVolume(5);

        //insert cd and enable stereo
        amp.setCd(cd);
        amp.setStereoSound();

        //turn on cdplayer and play song
        cd.on();
        cd.play(cdTitle);
    }

    public void stopMusic() {
        //amp off
        amp.off();

        //dvd out and turn off player
        dvd.eject();
        dvd.off();
    }

    public void listenRadio(int freq) {
        //turn tuner on and set the frequency
        tuner.on();
        tuner.setFrequency(freq);

        //amp on, volume on 5 and set to tuner mode
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }

    public void stopRadio() {
        //tuner off
        tuner.off();

        //amp off
        amp.off();
    }




}
