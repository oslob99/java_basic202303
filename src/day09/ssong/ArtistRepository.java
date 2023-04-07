package day09.ssong;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ArtistRepository {

    private static Map<String, Artist> artistMap;

    static {
        artistMap = new HashMap<>();
    }




    public int count() {
        return artistMap.size();
    }

    public void addArtist(String inputArt, String inputSong) {
        Artist artist = new Artist(inputArt, new HashSet<>());
        artist.getSongList().add(inputSong);
        artistMap.put(inputArt,artist);
    }
    public boolean findArtist(String findArt){
        return artistMap.containsKey(findArt);
    }

    public boolean findSong(String inputArt, String inputSong) {
        return artistMap.get(inputArt).getSongList().contains(inputSong);
    }

    public void addSong(String inputArt, String inputSong) {
        artistMap.get(inputArt).getSongList().add(inputSong);
    }
}
