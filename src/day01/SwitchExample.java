package day01;

import java.util.Scanner;

public class SwitchExample {
        public static final String SPRING = "봄";
    public static void main(String[] args) {

        System.out.println("### 여행지 추천 ###");
        System.out.println("[ 원하는 계절을 입력하세요. ]");
        System.out.print(">> ");

        Scanner sc = new Scanner(System.in);

        String season = sc.nextLine();

        // switch문에는 정수, 문자형 변수를 써야함
        switch (season){
            case SPRING:
                System.out.println("봄에는 여의도를 가세요!");
            case "여름":
                System.out.println("봄에는 여의도를 가세요!");
            case "가울":
                System.out.println("봄에는 여의도를 가세요!");
            case "겨울":
                System.out.println("봄에는 여의도를 가세요!");
        }
    }
}
