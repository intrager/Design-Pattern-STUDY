package template.before;

public class CarTest {

    public static void main(String[] args) {

        AICar myCar = new AICar();
        myCar.startCar();
        myCar.drive();
        myCar.stop();
        myCar.turnOff();
        System.out.println("===========================");

        ManualCar hisCar = new ManualCar();
        hisCar.startCar();
        hisCar.drive();
        hisCar.stop();
        hisCar.turnOff();
        System.out.println("===========================");

        HybridCar yourCar = new HybridCar();
        yourCar.startCar();
        yourCar.drive();
        yourCar.stop();
        yourCar.turnOff();
        System.out.println("===========================");
    }
}
