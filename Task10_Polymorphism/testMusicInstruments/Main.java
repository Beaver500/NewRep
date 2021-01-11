package Task10_Polymorphism.testMusicInstruments;

import java.util.Random;

public class Main {
    static int LENGTH = 25;

    public static void main(String[] args) {
        Random random = new Random();
        Instrument[] instruments = new Instrument[LENGTH];

        for (int i = 0; i < LENGTH; i++) {
            if (random.nextBoolean()) {

                instruments[i] = new Gitar();
            } else {
                instruments[i] = new Instrument();
            }
        }

        Track guitarTrack = new Track(instruments);
        instruments = new Instrument[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            if (random.nextBoolean()) {

                instruments[i] = new Bass();
            } else {
                instruments[i] = new Instrument();
            }
        }

        Track bassTrack = new Track(instruments);
        Song song = new Song(new Track[]{guitarTrack, bassTrack});

        song.playSong();
    }
}
