package principles.isp.good;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solid.principles.isp.good.RobotWithAntennas;

class RobotWithAntennasTest {

    private RobotWithAntennas robotWithAntennas;

    @BeforeEach
    public void setUp() {
        robotWithAntennas = new RobotWithAntennas();
    }

    @Test
    void shouldSpinAround() {
        Assertions.assertEquals("Spin around", robotWithAntennas.spinAround());
    }

    @Test
    void shouldRotateArms() {
        Assertions.assertEquals("Rotate arms", robotWithAntennas.rotateArms());
    }

    @Test
    void shouldWiggleAntennas() {
        Assertions.assertEquals("Wiggle antennas", robotWithAntennas.wiggleAntennas());
    }

}
