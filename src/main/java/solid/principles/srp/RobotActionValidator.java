package solid.principles.srp;

import solid.principles.srp.good.RobotAction;

public interface RobotActionValidator {
    RobotAction validateAction(RobotAction action) throws Exception;
}
