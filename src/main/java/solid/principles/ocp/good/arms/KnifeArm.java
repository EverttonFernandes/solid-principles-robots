package solid.principles.ocp.good.arms;

import solid.principles.ocp.good.abstraction.Arm;

public class KnifeArm implements Arm {
    @Override
    public String useArm() {
        return "I can cut";
    }
}
