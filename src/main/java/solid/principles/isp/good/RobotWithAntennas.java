package solid.principles.isp.good;

import solid.principles.isp.good.interfaces.RotateArms;
import solid.principles.isp.good.interfaces.SpinAround;
import solid.principles.isp.good.interfaces.WiggleAntennas;

public class RobotWithAntennas implements SpinAround, RotateArms, WiggleAntennas {
    private String name = "Joe";

    @Override
    public String spinAround() {
        return "Spin around";
    }

    @Override
    public String rotateArms() {
        return "Rotate arms";
    }

    @Override
    public String wiggleAntennas() {
        return "Wiggle antennas";
    }
}
