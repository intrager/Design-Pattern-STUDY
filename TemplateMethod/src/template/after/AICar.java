package template.after;

public class AICar extends Car {

    public void drive() {
        System.out.println("자율주행합니다.");
        System.out.println("자동차가 스스로 방향을 바꿉니다.");
    }

    public void stop() {
        System.out.println("스스로 멈춥니다.");
    }

    public void washCar() {
        System.out.println("자동으로 세차가 됩니다.");
    }
}
