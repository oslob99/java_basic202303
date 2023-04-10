package day11.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample {

    public static void main(String[] args) {

        String path = "D:\\exercise\\dog.txt";

        try (FileInputStream fis = new FileInputStream(path)){

            int data = 0;
            while (data != -1){

            data = fis.read();
                System.out.write(data);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
