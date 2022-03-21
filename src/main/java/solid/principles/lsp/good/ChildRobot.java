package solid.principles.lsp.good;

import solid.principles.lsp.FatherRobot;

final class ChildRobot extends FatherRobot implements MakeCappuccino {
    private final String name = "Eden";

    @Override
    protected void makeCoffee() {
        super.makeCoffee();
    }

    @Override
    public void makeCappuccino() {
        System.out.println("Here's your cappuccino");
    }
}
