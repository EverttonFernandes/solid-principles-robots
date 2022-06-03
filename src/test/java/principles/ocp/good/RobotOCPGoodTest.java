package principles.ocp.good;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import solid.principles.ocp.good.abstraction.Arm;
import solid.principles.ocp.good.robot.RobotOCPGood;

class RobotOCPGoodTest {

    @Mock
    private Arm arm;

    private RobotOCPGood robotOCPGood;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        robotOCPGood = new RobotOCPGood("XP51c", arm);
    }

    @Test
    void shouldUseKnife() {
        BDDMockito.given(arm.useArm()).willReturn("I can cut");
        robotOCPGood.useArm();
        Assertions.assertEquals("I can cut", robotOCPGood.useArm());
    }

    @Test
    void shouldUsePainter() {
        BDDMockito.given(arm.useArm()).willReturn("I can paint");
        robotOCPGood.useArm();
        Assertions.assertEquals("I can paint", robotOCPGood.useArm());
    }

}
