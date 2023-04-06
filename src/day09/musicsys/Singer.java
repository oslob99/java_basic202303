package day09.musicsys;

import day04.array.StringList;

public class Singer {

    private String singerName;
    private StringList sings;


    public Singer() {}

    public Singer(String singerName, StringList sings) {
        this.singerName = singerName;
        this.sings = sings;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public StringList getSings() {
        return sings;
    }

    public void setSings(StringList sings) {
        this.sings = sings;
    }
}
