package day12.lambda;

import day05.member.Gender;
import day05.member.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static day07.static_.Utility.makeLine;
import static day12.lambda.Color.*;
import static day12.lambda.FilterApple.*;
import static day12.lambda.MappingApple.MappingAppleByColor;
import static day12.lambda.MappingApple.map;

public class Maiin {

    public static void main(String[] args) {

        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
        new Apple(80, GREEN),
        new Apple(155, RED),
        new Apple(120, GREEN),
        new Apple(82, RED),
        new Apple(12, YELLOW),
        new Apple(196, GREEN),
        new Apple(21, RED),
        new Apple(82, GREEN)
        );

        System.out.println("========= 녹색 사과 필터링 ===========");
        List<Apple> greenApples = filterGreenApples(appleBasket);
        for (Apple greenApple : greenApples) {
            System.out.println("greenApple = " + greenApple);
        }

        System.out.println("========= 노란색 사과 필터링 ===========");
        List<Apple> colorApples = filterApplesByColor(appleBasket,YELLOW);

        for (Apple colorApple : colorApples) {
            System.out.println("colorApple = " + colorApple);
        }

        System.out.println("========= 원하는 조건 필터링 ===========");
        List<Apple> filterAples = filterApples(appleBasket,new LightApplePredicate());
        for (Apple filterAple : filterAples) {
            System.out.println(filterAple);
        }
        makeLine();
        // 빨강 사과 필터링
        List<Apple> filterApples1 = filterApples(appleBasket, new ApplePredicate() {

            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == RED;
            }
        });
        for (Apple apple : filterApples1) {
            System.out.println(apple);
        }

        makeLine();
        // 녹색이면서 100g보다 큰 사과들만 필터링 (익명)
        List<Apple> filterApples2 = filterApples(appleBasket,
              (apple) -> apple.getColor() == GREEN && apple.getWeight() > 100);
        for (Apple apple : filterApples2) {
            System.out.println(apple);
        }

        makeLine();

        filter(appleBasket,apple -> apple.getWeight() >= 100 && apple.getWeight() <= 150);

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);

        filter(numbers, n -> n%2 == 0);

        List<String> wordList = List.of("moments", "hello", "apple","banana","ace","base");

        List<String> filter1 = filter(wordList, w -> w.length() == 5);
        for (String s : filter1) {
            System.out.println("s = " + s);
        }

        List<String> filter3 = wordList.stream().filter(w -> w.length()<5).collect(Collectors.toList());
        for (String s : filter3) {
            System.out.println("s = " + s);
        }

        List<Color> colorList = MappingAppleByColor(appleBasket);
        for (Color color : colorList) {
            System.out.println(color);
        }


        makeLine();

        List<Color> colorList1 = MappingAppleByColor(appleBasket);
        System.out.println("colorList1 = " + colorList1);

        // 회원정보에서 회원의 닉네임만 추출
        List<Member> memberList = List.of(
                new Member(1, "abc1@ddd.com", "1234", "홍길동", Gender.MALE, 33)
                ,new Member(2, "abc2@ddd.com", "4444", "김길동", Gender.FEMALE, 23)
                ,new Member(3, "abc3@ddd.com", "3333", "이길동", Gender.MALE, 43)
                ,new Member(4, "abc4@ddd.com", "5555", "박길동", Gender.FEMALE, 53)
                ,new Member(5, "abc5@ddd.com", "1111", "송길동", Gender.MALE, 63)
        );

        List<Integer> nameList = map(memberList, m -> m.age);
        System.out.println("nameList = " + nameList);


    }
}
