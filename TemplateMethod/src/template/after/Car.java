package template.after;

public abstract class Car {

    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }

    public abstract void drive();
    public abstract void stop();

    public void washCar() {} // 구현하고 싶을 때 하면 됨

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }
}
