package solid.principles.lsp.good;

import solid.principles.lsp.FatherRobot;

public class ChildRobot extends FatherRobot implements MakeCappuccino {
    private final String name = "Eden";

    @Override
    public String makeCoffee() {
        return "I'm Eden, son of Sam ".concat(super.makeCoffee());
    }

    @Override
    public String makeCappuccino() {
        return "Here's your cappuccino";
    }

}
