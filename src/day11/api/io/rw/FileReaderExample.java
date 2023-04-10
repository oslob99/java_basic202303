package day11.api.io.rw;

import day05.member.Member;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderExample {

    public static void main(String[] args) {

        try (FileReader fr = new FileReader(Path.ROOT_PATH + "메롱.txt")){

            // 버퍼 스트림
            BufferedReader br = new BufferedReader(fr);

            String s = br.readLine();
            System.out.println("s = " + s);

            String[] split = s.split(",");
            System.out.println(Arrays.toString(split));

//            new Member(Integer.parseInt(split[0]),split[1], );

//            fr.read();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
