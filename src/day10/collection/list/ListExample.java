package day10.collection.list;

import java.util.*;

public class ListExample {

/*
    - 저장 데이터의 순서를 보장
    - 인덱스를 가지고 있음
    - 중복 데이터를 저장 가능
 */
    public static void main(String[] args) {
        List<String> foodList = new ArrayList<>();

        // add(E e) : 끝 추가
        foodList.add("짜장면");
        foodList.add("짬뽕");
        foodList.add("닭강정");
        foodList.add("파스타");
        foodList.add("리조또");

        // add(index, element) : 중간삽입
        foodList.add(2,"족발");

        // size() : 저장된 데이터 개수를 반환
        int size = foodList.size();
        System.out.println("size = " + size);

        System.out.println(foodList);

        // indexOf(E e) : 해당 데이터의 인덱스 반환
        int index = foodList.indexOf("파타");
        System.out.println("index = " + index);

        // contains(E e) : 해당 데이터 저장 유무 확인
        System.out.println(foodList.contains("짜장면"));

        // remove(index), remove(obj)
        foodList.remove(1);
        foodList.remove("파스타");
        System.out.println("foodList = " + foodList);

        // set(index, newElement) : 수정
        foodList.set(0, "가자");
        System.out.println("foodList = " + foodList);

        // get(index) : 리스트에 저장된 데이터 참조
        String s = foodList.get(1);
        System.out.println("s = " + s);

        // 반복문 처리
        for (int i = 0; i < foodList.size(); i++) {
            System.out.println(foodList.get(i));
        }

        for (String s1 : foodList) {
            System.out.println("s1 = " + s1);
        }

        // clear() : 내부 데이터 전체 삭제
        foodList.clear();
        System.out.println("foodList = " + foodList);
        System.out.println(foodList.isEmpty());

        // 리스트에 초기값 넣고 시작하기
        List<Object> tvxq = new ArrayList<>(
                Arrays.asList("유노윤호", "최강창민")
        );
        System.out.println("tvxq = " + tvxq);

        // 정렬( 듀얼 피벗 퀵 정렬)
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(5,29,31,2,4,19,3,1)
        );
        System.out.println("numbers = " + numbers);
        // 오름차 정렬
        Collections.sort(numbers);

        System.out.println("numbers = " + numbers);

        // 내림차 정렬
        numbers.sort(Comparator.reverseOrder());

        System.out.println("numbers = " + numbers);

    }
}
