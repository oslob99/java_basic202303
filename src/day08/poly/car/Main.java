package day08.poly.car;

public class Main {


    public static void main(String[] args) {

        CarShop shop = new CarShop();
        shop.runTest();

        System.out.println("===========");

        Driver park = new Driver();

        park.drive(new Mustang());
        park.drive(new Stinger());


        Car mustang = new Mustang();

        mustang.accelerate();
//        mustang.powerSound();

        Stinger stinger = new Stinger();
        stinger.accelerate();


        Car car = (Mustang) shop.exportCar(6000);

        System.out.println( car instanceof Stinger);

        System.out.println("car = " + car);

        ((Mustang) car).powerSound();

    }
}
