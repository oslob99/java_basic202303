package day02;

public class ArrayBasic {
    public static void main(String[] args) {

        // 배열 객체 생성
        int[] arr = new int[5];
        System.out.println("arr = " + arr);

        arr[0] = 50;
        arr[1] = 77;
        arr[2] = arr[0] + 20;
        arr[3] = (int) 66.7;
        arr[4] = 100;

        // 자바의 배열 immutable(불변성)

        System.out.printf("배열의 길이: %d\n", arr.length);

        for (int i : arr) {// iter 단축키
            System.out.println(i);
        }

    }
}
