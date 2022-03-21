package solid.principles.isp.good;

import solid.principles.isp.good.interfaces.RotateArms;
import solid.principles.isp.good.interfaces.SpinAround;

public class RobootWithoutAntennas implements SpinAround, RotateArms {
    private String name = "Bob";

    @Override
    public void spinAround() {
        System.out.println("Spin around");
    }

    @Override
    public void rotateArms() {
        System.out.println("Rotate arms");
    }

}
