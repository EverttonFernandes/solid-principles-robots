package solid.principles.isp.good;

import solid.principles.isp.good.interfaces.RotateArms;
import solid.principles.isp.good.interfaces.SpinAround;

public class RobotWithoutAntennas implements SpinAround, RotateArms {
    private String name = "Bob";

    @Override
    public String spinAround() {
        return "Spin around";
    }

    @Override
    public String rotateArms() {
        return "Rotate arms";
    }

}
