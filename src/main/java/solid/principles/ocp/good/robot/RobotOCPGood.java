package solid.principles.ocp.good.robot;

import solid.principles.ocp.good.abstraction.Arm;

public class RobotOCPGood {

    private final String name;
    private final Arm arm;

    public RobotOCPGood(String name, Arm arm) {
        this.name = name;
        this.arm = arm;
    }

    public String useArm() {
        return this.arm.useArm();
    }

    public String getName() {
        return name;
    }
}
