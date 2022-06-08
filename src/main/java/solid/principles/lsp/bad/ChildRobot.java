package solid.principles.lsp.bad;

import solid.principles.lsp.FatherRobot;
import solid.principles.lsp.bad.Exception.WaterException;

final class ChildRobot extends FatherRobot {
    private final String name = "Eden";

    @Override
    protected String makeCoffee() {
        System.out.println("I can't make coffee but here's water");
        throw new WaterException();
    }
}
