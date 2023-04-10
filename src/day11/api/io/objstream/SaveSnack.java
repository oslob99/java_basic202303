package day11.api.io.objstream;

import day11.api.io.rw.Path;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SaveSnack {

    private static List<Snack> snackList = new ArrayList<>();

    public static void main(String[] args) {

        snackList.add(new Snack("자갈치", 1921, 2000, Snack.Taste.GOOD));
        snackList.add(new Snack("참붕어빵", 1935, 4500, Snack.Taste.SOSO));
        snackList.add(new Snack("뻥이요", 1911, 3500, Snack.Taste.BAD));

        saveFile();

    }
    // 객체를 통채로 파일에 저장
    private static void saveFile(){

        try (FileOutputStream fos = new FileOutputStream(Path.ROOT_PATH+"snack.sav")){

            // 객체 저장을 위한 보조 스트림
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(snackList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    // 텍스트 파일로 리스트 데이터 저장
    private static void saveTextFile(){

        try (FileWriter fw = new FileWriter(Path.ROOT_PATH+"snack.txt")){

            for (Snack s : snackList) {
                fw.write(String.format("%s,%d,%d,%s\r\n",s.getSnackName()
                        ,s.getYear(), s.getPrice(), s.getTaste() ));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
