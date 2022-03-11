package solid.principles.srp.good;

public class GardenerRobot {
    private String name;

    public GardenerRobot(String name) {
        this.name = name;
    }

    public static void robotPresentation() {
        System.out.println("Hello my name is: ");
        System.out.println("I am a gardener");
    }

}
