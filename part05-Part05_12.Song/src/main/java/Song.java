
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared) {
        // return true if both objects are referencing the same address
        if (this == compared) {
            return true;
        }
        // If the compared object is not of the type Song, they are not equal
        if (!(compared instanceof Song)) {
            return false;
        }
        Song convertComparedtoSong = (Song) compared;

        if (this.artist.equals(convertComparedtoSong.artist) &&
                this.name.endsWith(convertComparedtoSong.name) &&
                this.durationInSeconds == convertComparedtoSong.durationInSeconds) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
