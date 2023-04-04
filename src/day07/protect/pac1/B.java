package day07.protect.pac1;

public class B {

    void test(){
        A a1 = new A(10);
        A a2 = new A("zzz");

        a1.f1 = 1;
        a1.f2 = 2;

    }
}
