package principles.dip.good;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import solid.principles.dip.good.CutterArm;
import solid.principles.dip.good.CutterRobot;

import static org.mockito.Mockito.times;

class CutterRobotTest {

    @Mock
    private CutterArm cutterArm;

    private CutterRobot cutterRobot;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        cutterRobot = new CutterRobot(cutterArm);
    }

    @Test
    void shouldCutSlice(){
        cutterRobot.cutSlice();
        Mockito.verify(cutterArm, times(1)).cut();
    }

}
