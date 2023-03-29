package day01;

import java.io.IOException;
import java.util.Scanner;

public class StdiO {
    public static void main(String[] args) throws IOException {


        int month = 10;
        int day = 3;
        String anni = "개천절";

        System.out.println(
                month + " " + day + " " + anni
        );

        // %d: 정수, %s: 문자열, %f: 실수
        System.out.printf("%d월 %d일은 %s일입니다\n", month, day, anni);

        //표준입력
        Scanner sc = new Scanner(System.in);
        int result = 0;

        String str = sc.nextLine();
        try {
            result = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("정수로 입력해라");
        }

//        int result = System.in.read();
        System.out.println(result);
    }
}
