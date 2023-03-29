package day03;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        int korScore = 10;
        int mathScore = 20;
        int engScore = 30;

        int[] kimScores = {korScore, mathScore, engScore};
        int[] parkScores = {100, 34, 99};
        int[] hongScores = {10, 100, 11};

        // 2차원 배열
        int[][] classScores = {kimScores, parkScores, hongScores};

        System.out.println(classScores[0][0]);
        System.out.println(kimScores[0]);

        System.out.println(Arrays.deepToString(classScores));

        //2차원 배열의 값 초기화
        int[][] arr2d = {
                {10,20,30},
                {40,50,60},
                {70,80,90},
                {100,200,300}
        };

        int[] arr3 = arr2d[2];

        // 2차원 배열의 순회
        for (int[] arr: arr2d) {
            for (int n : arr){
                System.out.printf("%d  ",n);
            }
            System.out.println();
        }

        // 배열의 기본값
        // 정수배열은 0이 기본값, 실수는 0.0 기본값
        // 논리는 거짓이 기본, char 배열은 기본값 공백
        // 그 나머지는 전부 null 이 기본
        String[] numbers = new String[5];

        System.out.println(Arrays.toString(numbers));


        // 5행 4열의 정수 2차원 배열을 생성만 하고 싶다
        int[][] array2d = new int[5][4];


        // 2차원 배열 수정
        array2d[2][1] = 55;
        array2d[3] = new int[]{9,8,7,6};


        for (int[] ints : array2d) {
            for (int anInt : ints) {
                System.out.printf("%3d ",anInt);
            }
            System.out.println();
        }

        // 3차원 배열
        int[][][] arr3d = {
                {
                        {10,20},
                        {30,40}
                },
                {
                        {50,60},
                        {70,80}
                },
                {
                        {90,100},
                        {110,120}
                }
        };
    }
}
