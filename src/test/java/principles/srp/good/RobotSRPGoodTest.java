package principles.srp.good;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solid.principles.srp.good.actions.RobotAction;
import solid.principles.srp.good.chef.ChefRobot;
import solid.principles.srp.good.driver.DriverRobot;
import solid.principles.srp.good.gardener.GardenerRobot;
import solid.principles.srp.good.painter.PainterRobot;

class RobotSRPGoodTest {

    @Test
    void shouldCreatePainterRobot() throws Exception {
        PainterRobot painterRobot = new PainterRobot("R2D2", RobotAction.PAINT);
        Assertions.assertEquals("I am a painter", painterRobot.showProfession());
        Assertions.assertEquals("I am painting", painterRobot.showAction());
    }

    @Test
    void shouldNotCreatePainterRobotWhenGivenWrongResponsibility() throws Exception {
        Assertions.assertThrows(Exception.class, () -> {
            new PainterRobot("R2D2", RobotAction.COOK);
        }, "I'm can only paint");
    }

    @Test
    void shouldCreateGardenerRobot() throws Exception {
        GardenerRobot gardenerRobot = new GardenerRobot("HAL 9000", RobotAction.CUT);
        Assertions.assertEquals("I am a gardener", gardenerRobot.showProfession());
        Assertions.assertEquals("I am cutting grass", gardenerRobot.showAction());
    }

    @Test
    void shouldNotCreateGardenerRobotWhenGivenWrongResponsibility() throws Exception {
        Assertions.assertThrows(Exception.class, () -> {
            new GardenerRobot("HAL 9000", RobotAction.PAINT);
        }, "I'm can only cut grass");
    }

    @Test
    void shouldCreateDriverRobot() throws Exception {
        DriverRobot driverRobot = new DriverRobot("K9", RobotAction.DRIVE);
        Assertions.assertEquals("I am a driver", driverRobot.showProfession());
        Assertions.assertEquals("I am driving", driverRobot.showAction());
    }

    @Test
    void shouldNotCreateDriverRobotWhenGivenWrongResponsibility() throws Exception {
        Assertions.assertThrows(Exception.class, () -> {
            new DriverRobot("K9", RobotAction.COOK);
        }, "I'm can only drive");
    }

    @Test
    void shouldCreateChefRobot() throws Exception {
        ChefRobot chefRobot = new ChefRobot("WALL - E", RobotAction.COOK);
        Assertions.assertEquals("I am a chef", chefRobot.showProfession());
        Assertions.assertEquals("I'm cooking", chefRobot.showAction());
    }

    @Test
    void shouldNotCreateChefRobotWhenGivenWrongResponsibility() throws Exception {
        Assertions.assertThrows(Exception.class, () -> {
            new ChefRobot("WALL - E", RobotAction.DRIVE);
        }, "I'm can only cooking");
    }

}
