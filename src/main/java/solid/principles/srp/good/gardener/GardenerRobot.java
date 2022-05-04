package solid.principles.srp.good.gardener;

import solid.principles.srp.ActionValidator.RobotActionValidator;
import solid.principles.srp.good.abstration.RobotAbstraction;
import solid.principles.srp.good.actions.RobotAction;

public class GardenerRobot extends RobotAbstraction implements RobotActionValidator {

    private final String name;
    private final RobotAction action;

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

    @Override
    public void robotPresentation() {
        showName();
        showProfession();
        showAction();
    }

    @Override
    public void showName() {
        System.out.println("Hello my name is: ".concat(this.name));
    }

    @Override
    public void showProfession() {
        System.out.println("I am a gardener");
    }

    @Override
    public void showAction() {
        System.out.println("I am cutting grass");
    }

}
