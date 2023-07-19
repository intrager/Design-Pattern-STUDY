package command;

public class CeilingFanOnMediumCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanOnMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.medium();
    }
}
