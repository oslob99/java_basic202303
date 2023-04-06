package day09.musicsys;

public class ArtistRepository {

    private static Singer[] artistList; // 가수 배열

    static {
        artistList = new Singer[0];
    }

    // 신규 가수를 첫 노래와 함께 배열에 추가하는 기능
    public void addFirstArtist(String artistName, String songName) {

    }
    // 가수명을 받아서 해당 가수가 등록된 가수인지 확인하는 기능
    public boolean isRegistered(String artistName) {
        return false;
    }
    // 가수명을 통해 가수 객체 정보를 반환하는 기능
    public Singer findArtistByName(String artistName) {
        return null;
    }
    // 기존 가수 객체에 노래를 추가하는 기능
    public void addNewSong(String songName) {

    }
    // 특정 가수의 노래목록을 반환하는 기능
    public String[] getSongList(String artistName) {
        return null;
    }
    // 등록된 가수의 수 반환
    public int count() {
        return artistList.length;
    }


}