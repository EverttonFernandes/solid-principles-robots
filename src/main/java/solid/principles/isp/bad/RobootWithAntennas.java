package solid.principles.isp.bad;

public class RobootWithAntennas implements RobotsExercices {
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
