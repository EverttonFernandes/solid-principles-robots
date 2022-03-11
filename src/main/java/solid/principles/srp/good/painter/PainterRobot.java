package solid.principles.srp.good;

public class PainterRobot {

    private final String name;

    public PainterRobot(String name) {
        this.name = name;
    }

    public static void robotPresentation() {
        System.out.println("Hello my name is: ");
        System.out.println("I am a painter");
    }

}
