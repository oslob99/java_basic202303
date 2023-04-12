package day13.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>(
                List.of(
                    new Student("홍철수", 14, 79),
                    new Student("박영희", 11, 43),
                    new Student("손흥민", 17, 17),
                    new Student("감우성", 22, 89)
                )
        );

        studentList.add(new Student("하하",18,24));

        // 나이 순으로 오름차 정렬(나이 적은순)
        studentList.sort(Comparator.comparingInt(Student::getAge));

        // 이름 가나다순으로 오름차 정렬
        studentList.sort(Comparator.comparing(Student::getName));

        studentList.forEach(System.out::println);







    }
}
