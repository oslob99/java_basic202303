package day10.generic;

import day04.array.StringList;
import day09.musicsys.Singer;

import java.security.PublicKey;

public class Main {

    public static void main(String[] args) {
        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();

        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana());
        Banana banana = bb.getBanana();

        Basket<Apple> apples = new Basket();
        apples.setFruit(new Apple());
//        apples.setFruit(new Banana());

        Apple fruit = apples.getFruit();

        Basket<Banana> bananas = new Basket<>();
//        bananas.setFruit(new Apple());
        bananas.setFruit(new Banana());

        Banana fruit1 = bananas.getFruit();

        MyList<String> sl = new MyList<>();
        sl.push("짬뽕");
        sl.push("짜장");
        sl.push("탕수육");

        System.out.println("sl = " + sl);

        MyList<Integer> numbers = new MyList<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);

        System.out.println("numbers = " + numbers);

        MyList<Singer> singers = new MyList<>();
        singers.push(new Singer("아이유",new StringList("hello")));
        System.out.println("singers = " + singers.isEmpty());

    }
}
