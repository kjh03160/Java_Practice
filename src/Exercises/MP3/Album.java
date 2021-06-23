package Exercises.MP3;

import java.util.ArrayList;

public class Album {
    private ArrayList<Song> track = new ArrayList<> ();
    private final String name;
    private final int year;
    private final Artist artist;

    public Album(String name, int year, Artist artist) {
        this.name = name;
        this.year = year;
        this.artist = artist;
    }
    public void addTrack(Song song){
        this.track.add(song);
    }

    public Song getTrack(int idx) {
        return track.get(idx - 1);
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
