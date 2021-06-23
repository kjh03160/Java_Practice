package Exercises.MP3;

public class Song {
    private final String title;
    private final Artist artist;
    private final Album album;

    public Song(String title, Artist artist, Album album) {
        this.title = title;
        this.artist = artist;
        this.album = album;
    }
    public String toString(){
        return title + " - " + artist.getName() + "\n" + album.getName() + "(" + album.getYear() + ")";
    }
}
