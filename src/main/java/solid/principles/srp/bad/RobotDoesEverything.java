package solid.principles.srp.bad;

public class RobotDoesEverything {
    private String name;

    public RobotDoesEverything(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void robotPresentation() {
        System.out.println("Hello my name is: " + this.sayName());
        System.out.println("I am a chef");
        System.out.println("I am a gardener");
        System.out.println("I am a painter");
        System.out.println("I am a driver");
    }

    private String sayName() {
        return getName();
    }

    public void toCook() {
        System.out.println("I'm cooking");
    }

    public void cutGrass() {
        System.out.println("I am cutting grass");
    }

    public void paint() {
        System.out.println("I'am painting");
    }

    public void drive() {
        System.out.println("I am driving");
    }

}
