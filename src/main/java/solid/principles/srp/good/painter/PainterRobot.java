package solid.principles.srp.good.painter;

import solid.principles.srp.RobotActionValidator;
import solid.principles.srp.good.RobotAction;

public class PainterRobot implements RobotActionValidator {

    private final String name;
    private final RobotAction action;

    public PainterRobot(String name, RobotAction action) throws Exception {
        this.name = name;
        this.action = validateAction(action);
    }

    @Override
    public RobotAction validateAction(RobotAction action) throws Exception {
        if (!RobotAction.PAINT.equals(action)) {
            throw new Exception("I'm can only paint");
        }
        return action;
    }

    public static void robotPresentation() {
        System.out.println("Hello my name is: ");
        System.out.println("I am a painter");
    }

    private void paint() {
        System.out.println("I'am painting");
    }

}
