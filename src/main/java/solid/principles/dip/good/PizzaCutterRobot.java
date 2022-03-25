package solid.principles.dip.good;

public class PizzaCutterRobot {
    private final String name = "Bob";
    private final CutPizza cutPizza;

    public PizzaCutterRobot(CutPizza cutPizza) {
        this.cutPizza = cutPizza;
    }

}
