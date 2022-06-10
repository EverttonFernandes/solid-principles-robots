package principles.isp.good;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solid.principles.isp.good.RobotWithoutAntennas;

class RobotWithoutAntennasTest {

    private RobotWithoutAntennas robotWithoutAntennas;

    @BeforeEach
    public void setUp() {
        robotWithoutAntennas = new RobotWithoutAntennas();
    }

    @Test
    void shouldSpinAround() {
        Assertions.assertEquals("Spin around", robotWithoutAntennas.spinAround());
    }

    @Test
    void shouldRotateArms() {
        Assertions.assertEquals("Rotate arms", robotWithoutAntennas.rotateArms());
    }

}
