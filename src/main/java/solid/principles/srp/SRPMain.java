package solid.principles.srp;

import solid.principles.srp.bad.RobotDoesEverything;

public class SRPMain {
    public static void main(String[] args) {
        RobotDoesEverything robotDoesEverything = new RobotDoesEverything("Bob");
        robotDoesEverything.robotPresentation();
    }
}
