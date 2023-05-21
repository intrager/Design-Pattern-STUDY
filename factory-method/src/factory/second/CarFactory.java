package factory.second;

public abstract class CarFactory {

    final public Car manufacturingCar(String name) {
        Car car;
        preparingOthers();
        car = createCar(name);
        washCar();

        return car;
    }

    private void washCar() {
        System.out.println("wash car");
    }

    private void preparingOthers() {
        System.out.println("preparing others");
    }

    public abstract Car createCar(String name);
}
