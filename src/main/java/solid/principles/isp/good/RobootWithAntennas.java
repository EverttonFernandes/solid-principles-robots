package solid.principles.isp.good;

import solid.principles.isp.good.interfaces.RotateArms;
import solid.principles.isp.good.interfaces.SpinAround;
import solid.principles.isp.good.interfaces.WiggleAntennas;

public class RobootWithAntennas implements SpinAround, RotateArms, WiggleAntennas {
    private String name = "Joe";

    @Override
    public void spinAround() {
        System.out.println("Spin around");
    }

    @Override
    public void rotateArms() {
        System.out.println("Rotate arms");
    }

    @Override
    public void wiggleAntennas() {
        System.out.println("Wiggle antennas");
    }
}
