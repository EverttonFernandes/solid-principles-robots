package solid.principles.srp.ActionValidator;

import solid.principles.srp.good.actions.RobotAction;

public interface RobotActionValidator {
    RobotAction validateAction(RobotAction action) throws Exception;
}
