package Task10_Polymorphism.testMusicInstruments;

public class Song {
    private Track[] tracks;

    public Song(Track[] tracks) {
        this.tracks = tracks;
    }

    public void playSong() {
        for (Track track : tracks) {
            track.play();
            System.out.println();
        }
    }
}

