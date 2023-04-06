package day09.musicsys;

import day04.array.StringList;

public class SingerRepasitory {
    public static Singer[] singers;
    static {
        singers = new Singer[0];
    }


    public void inputSinger(String singerN, String singName) {

        Singer singer = new Singer(singerN, new StringList(singName));

        Singer[] temps = new Singer[singers.length+1];
        for (int i = 0; i < singers.length; i++) {
            temps[i] = singers[i];
        }
        temps[temps.length-1] = singer;
        singers = temps;

    }


    public int countSingers(){
        return singers.length;
    }


    public Singer findUser(String singerName) {

        for (Singer singer : singers) {
            if(singerName.equals(singer.getSingerName())){
                return singer;
            }
        }
        return null;
    }


    public boolean findSong(String singerName, String name) {
        Singer singer = findUser(singerName);

        return singer.getSings().includes(name);
    }

    public void addSong(String singerName, String singName) {
        Singer singer = findUser(singerName);
        singer.getSings().push(singName);

    }
}
