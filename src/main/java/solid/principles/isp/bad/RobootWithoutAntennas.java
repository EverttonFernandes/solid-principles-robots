package solid.principles.isp.bad;

import solid.principles.isp.bad.Exception.AntennaException;

public class RobootWithoutAntennas implements RobotsExercices {
    private String name = "Bob";

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
        System.out.println("Oops! But i dont't have antennas");
        throw new AntennaException();
    }
}
