package command;

public class CeilingFan {
    String location = "";
    int level;

    public static final int HIGH = 2;
    public static final int MEDIUM = 1;
    public static final int LOW = 0;

    public CeilingFan(String location) {
        this.location = location;
    }

    // Turns the ceiling fan on to high
    public void high() {
        level = HIGH;
        System.out.println(location + " ceiling fan is on high");
    }

    // Turns the ceiling fan on to medium
    public void medium() {
        level = MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    // Turns the ceiling fan on to low
    public void low() {
        level = LOW;
        System.out.println(location + " ceiling fan is on low");
    }

    // Turns the ceiling fan off
    public void off() {
        level = 0;
        System.out.println(location + " ceiling fan is off");
    }

    public int getSpeed() {
        return level;
    }
}
