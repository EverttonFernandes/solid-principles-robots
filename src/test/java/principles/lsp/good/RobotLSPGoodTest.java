package principles.lsp.good;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solid.principles.lsp.good.ChildRobot;

class RobotLSPGoodTest {

    @Test
    void shouldMakeCappuccino() {
        ChildRobot childRobot = new ChildRobot();
        Assertions.assertEquals("Here's your cappuccino", childRobot.makeCappuccino());
    }

    @Test
    void shouldMakeCoffee() {
        ChildRobot childRobot = new ChildRobot();
        Assertions.assertEquals("I'm Eden, son of Sam here's your coffee", childRobot.makeCoffee());
    }

}
