package day04.array;

public class Main {

    public static void main(String[] args) {

        StringList foodList = new StringList();
        foodList.push("짜장면");
        foodList.push("뽂음밥");
        foodList.push("탕수육");

        StringList userNameList = new StringList();
        userNameList.push("김철수");
        userNameList.push("박영희");

        foodList.pop();
        userNameList.pop();

        System.out.println(foodList.isEmpty());
        foodList.clear();
        System.out.println(foodList.isEmpty());
        System.out.println("foodList = " + foodList);
        System.out.println("foodList.size() = " + foodList.size());

        System.out.println("userNameList = " + userNameList);
        System.out.println("userNameList.size() = " + userNameList.size());
    }
}
