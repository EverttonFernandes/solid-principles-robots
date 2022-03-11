package solid.principles.srp.bad;

public class RobotDoesEverythingBad {
    private String name;
    private String action;

    public RobotDoesEverythingBad(String name, String action) {
        this.name = name;
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public String getAction() {
        return action;
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

    public void MakeFoodMowingTheGrassPaintTheWallAndDrive() {
        if ("cook".equals(this.getAction())) {
            this.toCook();
        }

        if ("cut".equals(this.getAction())) {
            this.cutGrass();
        }

        if ("paint".equals(this.getAction())) {
            this.paint();
        }

        if ("drive".equals(this.getAction())) {
            this.drive();
        }

    }

    private void toCook() {
        System.out.println("I'm cooking");
    }

    private void cutGrass() {
        System.out.println("I am cutting grass");
    }

    private void paint() {
        System.out.println("I'am painting");
    }

    private void drive() {
        System.out.println("I am driving");
    }

}
