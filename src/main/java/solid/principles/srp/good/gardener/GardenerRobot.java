package solid.principles.srp.good.gardener;

import solid.principles.isp.RobotActionValidator;
import solid.principles.srp.good.RobotAction;

public class GardenerRobot implements RobotActionValidator {
    private String name;
    private RobotAction action;

    public GardenerRobot(String name, RobotAction action) throws Exception {
        this.name = name;
        this.action = validateAction(action);
    }

    @Override
    public RobotAction validateAction(RobotAction action) throws Exception {
        if (!RobotAction.CUT.equals(action)) {
            throw new Exception("I'm can only cut grass");
        }
        return action;
    }

    public static void robotPresentation() {
        System.out.println("Hello my name is: ");
        System.out.println("I am a gardener");
    }

    private void cutGrass() {
        System.out.println("I am cutting grass");
    }

}
