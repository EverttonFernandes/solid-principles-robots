package solid.principles.dip.bad;

import solid.principles.dip.bad.Exception.CutterPizzaException;

public class PizzaCutterArm {
    private final String name = "pizzaCutterArm";
    private final CutterPizza cutterPizza;

    public PizzaCutterArm(CutterPizza cutterPizza) {
        this.cutterPizza = isCutterPizza(cutterPizza);
    }

    private CutterPizza isCutterPizza(CutterPizza cutterPizza) {
        if (cutterPizza != null && cutterPizza.getClass().equals(CutterPizza.class)) {
            return cutterPizza;
        }
        throw new CutterPizzaException();
    }

    void cutPizza() {
        if (this.cutterPizza != null){
            System.out.println("Cut pizza");
        }
    }
}
