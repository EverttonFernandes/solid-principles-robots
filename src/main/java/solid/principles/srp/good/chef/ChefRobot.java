package solid.principles.srp.good.chef;

import solid.principles.srp.good.RobotAction;

public class ChefRobot {

    private String name;
    private RobotAction action;

    public ChefRobot(String name, RobotAction action) throws Exception {
        this.name = name;
        this.action = validateAction(action);
    }

    private RobotAction validateAction(RobotAction action) throws Exception {
        if (!RobotAction.COOK.equals(action)) {
            throw new Exception("I'm can only cooking");
        }
        return action;
    }

    public static void robotPresentation() {
        System.out.println("Hello my name is: ");
        System.out.println("I am a chef");
    }

    private void toCook() {
        System.out.println("I'm cooking");
    }
}
