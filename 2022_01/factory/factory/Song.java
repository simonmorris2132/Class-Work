package factory;

public class Song {
    private String title;
    private String artist;
    private String genre;
    private int seconds;

    public Song(String title, String artist, String genre, int seconds) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.seconds = seconds;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "{" +
            " title = '" + getTitle() + "'" +
            ", artist = '" + getArtist() + "'" +
            ", genre = '" + getGenre() + "'" +
            ", seconds = '" + getSeconds() + "'" +
            "}";
    }

}
