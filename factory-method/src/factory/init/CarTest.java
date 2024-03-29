package factory.init;

public class CarTest {

    public static void main(String[] args) {
        CarTest test = new CarTest();
        Car car = test.produceCar("Sonata");

        Car car2 = test.produceCar("genesis");

        System.out.println(car);
        System.out.println(car2);
    }

    private Car produceCar(String name) {
        Car car = null;

        CarFactory factory = new CarFactory();
        car = factory.createCar(name);
        return car;
    }
}
