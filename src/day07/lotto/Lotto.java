package day07.lotto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Lotto {
    static int[] randNumbers = new int[6];
    static Scanner sc = new Scanner(System.in);
    static int inputRand;
    static Set<Integer> set = new HashSet<>();
    public static void information() {
//        int i = 0;
//        int rand;
//
//        Pick: while (i<6){
//            rand = (int) (Math.random()*40 +1);
//            for (int j = 0; j < randNumbers.length; j++) {
//                if (randNumbers[j] == rand)
//                    continue Pick;
//            }
//            randNumbers[i] = rand;
//            i++;
//        }
//        for (int a: randNumbers) {
//            System.out.print(a+" ");
//        }

        Set<Integer> lott = new HashSet<>();
        int rand;
        for (int i = 0; i < 6; i++) {
            rand = (int) (Math.random()*40 +1);
            lott.add(rand);
        }
        Iterator<Integer> it = lott.iterator();

        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }


    public static void run() {
        System.out.println("구매번호 6개를 차례대로 입력하세요.");
        int i = 0;
        int rad;
        int inputRad;
        int j = 0;

        while (i < randNumbers.length) { // 사용자에게 입력받아 set에 저장
            System.out.print(i+1 + "번째 번호 >> ");
            inputRad = Integer.parseInt(sc.nextLine());

            if(set.contains(inputRad)){
                System.out.println("중복되었습니다!");
                continue;
            }else  set.add(inputRad);

            i++;
        }

//        set 출력해 보기
        Iterator<Integer> it = set.iterator();

        while (it.hasNext()){ // set을 배열에 저장
            randNumbers[j] = it.next();
            j++;
        }




    }


}
