package solid.principles.dip.bad;

public class PizzaCutterRobot {
    private final String name = "Bob";
    private PizzaCutterArm pizzaCutterArm;

    public PizzaCutterRobot(PizzaCutterArm pizzaCutterArm) {
        this.pizzaCutterArm = pizzaCutterArm;
    }

    void cutPizza(CutterPizza cutterPizza) {
        pizzaCutterArm = new PizzaCutterArm(cutterPizza);
        pizzaCutterArm.cutPizza();
    }
}
