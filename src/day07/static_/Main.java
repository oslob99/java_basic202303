package day07.static_;

import static day07.static_.Utility.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(Count.x);
        System.out.println(Math.random());

        Count.m1();

        Count c1 = new Count();
        Count c2 = new Count();

        Count.x = 10;
        c2.y = 20;

        Count.x++;

        System.out.printf("c1 = x: %d, y: %d\n", c1.x, c1.y);
        System.out.printf("c1 = x: %d, y: %d\n", c2.x, c2.y);


        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();

        cal1.color = "빨강";
        cal2.color = "초록";

//        System.out.println("cal1 = " + cal1.color);

       Calculator.calcAreaCircle(5);

       Calculator sharp = new Calculator();
       sharp.paint("노랑");

       makeLine();


    }
}
