package solid.principles.srp.good.chef;

import solid.principles.srp.ActionValidator.RobotActionValidator;
import solid.principles.srp.good.abstration.RobotAbstraction;
import solid.principles.srp.good.actions.RobotAction;

public class ChefRobot extends RobotAbstraction implements RobotActionValidator {

    private final String name;
    private final RobotAction action;

    public ChefRobot(String name, RobotAction action) throws Exception {
        this.name = name;
        this.action = validateAction(action);
    }

    @Override
    public RobotAction validateAction(RobotAction action) throws Exception {
        if (!RobotAction.COOK.equals(action)) {
            throw new Exception("I'm can only cooking");
        }
        return action;
    }

    @Override
    public void robotPresentation() {
        System.out.println(showName());
        System.out.println(showProfession());
        System.out.println(showAction());
    }

    @Override
    public String showName() {
        return "Hello my name is: ".concat(this.name);
    }

    @Override
    public String showProfession() {
        return "I am a chef";
    }

    @Override
    public String showAction() {
        return "I'm cooking";
    }
}
