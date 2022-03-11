package solid.principles.srp;

import solid.principles.srp.bad.RobotDoesEverythingBad;

public class SRPMain {
    public static void main(String[] args) {
        RobotDoesEverythingBad robotDoesEverythingBad = new RobotDoesEverythingBad("Bob", "cut");
        robotDoesEverythingBad.robotPresentation();
    }
}
