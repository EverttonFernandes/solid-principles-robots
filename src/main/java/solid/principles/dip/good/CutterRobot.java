package solid.principles.dip.good;

public class CutterRobot {
    private final String name = "Bob";
    private final CutterArm cutterArm;

    public CutterRobot(CutterArm cutterArm) {
        this.cutterArm = cutterArm;
    }

    public void cutSlice() {
        this.cutterArm.cut();
    }
}
