package solid.principles.srp.veryBad;

public class RobotDoesEverythingVeryBad {
    private String name;
    private String action;

    public RobotDoesEverythingVeryBad(String name, String action) {
        this.name = name;
        this.action = action;
    }

    public void robotPresentation() {
        System.out.println("Hello my name is: " + this.name);
        System.out.println("I am a chef");
        System.out.println("I am a gardener");
        System.out.println("I am a painter");
        System.out.println("I am a driver");

        if (getAction() == "cook") {
            System.out.println("I'm cooking");
        }

        if (getAction() == "cut") {
            System.out.println("I am cutting grass");
        }

        if (getAction() == "paint") {
            System.out.println("I'am painting");
        }

        if (getAction() == "drive") {
            System.out.println("I am driving");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

}
