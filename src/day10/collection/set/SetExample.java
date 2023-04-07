package day10.collection.set;

import java.util.*;

/*
    - 집합 자료구조
    - 저장순서를 보장하지 않음
    - 인덱스, 키를 사용하지 않아서 개별탐색이 불리함
    - 저장값의 중복을 허용하지 않음
 */
public class SetExample {

    public static void main(String[] args) {
        Set<String> foodSet = new HashSet<>();

        // 데이터 추가 add(E e)
        foodSet.add("김말이");
        foodSet.add("닭꼬치");
        foodSet.add("단무지");
        foodSet.add("김말이");
        foodSet.add("김밥");

        System.out.println(foodSet);

        Iterator<String> it = foodSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(1,1,1,1,2,3,45,6,7)
        );

        HashSet<Object> numberSet = new HashSet<>(numbers);
        System.out.println("numberSet = " + numberSet);

    }

}
