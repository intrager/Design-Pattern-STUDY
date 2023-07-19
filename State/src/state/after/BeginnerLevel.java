package state.after;

public class BeginnerLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("천천히 달립니다");
    }

    @Override
    public void jump() {
        System.out.println("Jump 할 줄 모름ㅎ");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 줄 모름ㅎ");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("Beginner Level 입니다");
    }
}
