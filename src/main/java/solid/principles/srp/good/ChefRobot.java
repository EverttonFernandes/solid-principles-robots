package solid.principles.srp.good;

public class ChefRobot {

    private String name;

    public ChefRobot(String name) {
        this.name = name;
    }

    public static void robotPresentation() {
        System.out.println("Hello my name is: ");
        System.out.println("I am a chef");
    }
}
