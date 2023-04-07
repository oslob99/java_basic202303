package day10.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();

        // put(K, V) : 데이터 추가
        map.put("지갑잔액",5000);
        map.put("지렁이",1000);

        System.out.println(map.size());

        // get(key) : 데이터 참조
        Object dinner = map.get("지렁이");
        System.out.println("dinner = " + dinner);
        // Object로 리턴 받으면 다운캐스팅 기억하기

        map.put("저녁메뉴","짬뽕");
        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println("key = " + key);
            System.out.println("map.get(key) = " + map.get(key));
        }






    }
}
