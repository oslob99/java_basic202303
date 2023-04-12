package day13.comparator;

import day13.Dish;
import day13.Menu;

import java.util.Comparator;
import java.util.stream.Collectors;

import static day07.static_.Utility.makeLine;
import static day13.Menu.*;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Sorting {
    public static void main(String[] args) {

        // stream의 정렬 sorted

        // 메뉴 목록중 칼로리가 낮은 순으로 정렬

        menuList.stream()
                .sorted(comparing(d ->d.getCalories()))
                .collect(toList())
                .forEach(d -> System.out.println(d));

        makeLine();

        // 메뉴 목록중 이름으로 내림차 정렬
        menuList.stream()
                .sorted(comparing(Dish::getName).reversed())
                .collect(toList())
                .forEach(d -> System.out.println(d));

    }

}
