package day13;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static day07.static_.Utility.makeLine;
import static day13.Menu.*;
import static java.util.stream.Collectors.*;

public class Mapping {

    public static void main(String[] args) {

        // stream의 map : 리스트에서 원하는 정보만 추출

        // 메뉴 목록에서 요리의 이름들만 목록으로 추출

        List<String> dishNames = menuList.stream()
                .map(dish -> dish.getName())
                .collect(toList());

        makeLine();

        List<String> words = List.of(
                "safari", "chrome", "ms edge"
                , "opera", "firefox"
        );
        List<Integer> wordLengths = words.stream()
                .map(w -> w.length())
                .collect(toList());
        System.out.println("wordLengths = " + wordLengths);

        makeLine();

        // 메뉴 목록에서 메뉴이름과 칼로리를 추출하는데
        // 칼로리를 정수가 아닌 문자열로 kcal을 뒤에 붙여서 추출 후
        // 메뉴이름: xxKcal 로 반복 출력

        List<SimpleDish> simpleDishList = menuList.stream()
                .map(SimpleDish::new)
                .collect(toList());

        simpleDishList.forEach(System.out::println);


        /*
        * 메뉴 목록에서 칼로리가 500칼로리보다 큰
        * 음식들을 필터링 한 다음에 음식의 이름과 타입만
        * 추출해서 출력해주세요*/
        makeLine();

        List<HardDish> hardDishList = menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(HardDish::new)
                .collect(toList());

        hardDishList.forEach(System.out::println);

        makeLine();
        // 메뉴 목록에 있는 요리들의 총 칼로리수 구하기
        int totalCal = menuList.stream()
                .mapToInt(d -> d.getCalories())
                .sum();
        System.out.println("totalCal = " + totalCal);




    }
}
