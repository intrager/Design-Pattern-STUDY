package state.after;

public class AdvancedLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("빨리 달립니다");
    }

    @Override
    public void jump() {
        System.out.println("높이 Jump 합니다");
    }

    @Override
    public void turn() {
        System.out.println("조금 더 하면 돌 수 있을듯");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("Advanced Level 입니다");
    }
}
