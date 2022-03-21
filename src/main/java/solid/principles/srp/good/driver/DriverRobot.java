package solid.principles.srp.good.driver;

import solid.principles.srp.RobotActionValidator;
import solid.principles.srp.good.RobotAction;

public class DriverRobot implements RobotActionValidator {

    private String name;
    private RobotAction action;

    public DriverRobot(String name, RobotAction action) throws Exception {
        this.name = name;
        this.action = validateAction(action);
    }

    @Override
    public RobotAction validateAction(RobotAction action) throws Exception {
        if (!RobotAction.DRIVE.equals(action)) {
            throw new Exception("I'm can only drive");
        }
        return action;
    }

    public static void robotPresentation() {
        System.out.println("Hello my name is: ");
        System.out.println("I am a driver");
    }

    private void drive() {
        System.out.println("I am driving");
    }
}
