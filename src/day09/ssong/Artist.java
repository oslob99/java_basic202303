package day09.ssong;

import java.util.Set;

public class Artist {

    private String artist;
    private Set<String> songList;

    public Artist() {}

    public Artist(String artist, Set<String> songList) {
        this.artist = artist;
        this.songList = songList;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Set<String> getSongList() {
        return songList;
    }

    public void setSongList(Set<String> songList) {
        this.songList = songList;
    }
}
