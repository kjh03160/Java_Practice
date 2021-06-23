package Exercises.MP3;

import java.util.ArrayList;

public class Artist {
    private ArrayList <Album> albums = new ArrayList<>();
    private final String name;

    public Artist(String name) {
        this.name = name;
    }

    public void addAlbum(Album album){
        albums.add(album);
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public String getName() {
        return name;
    }
}
