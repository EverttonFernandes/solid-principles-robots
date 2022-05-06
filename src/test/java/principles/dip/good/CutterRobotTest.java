package principles.dip.good;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import solid.principles.dip.good.CutterArm;
import solid.principles.dip.good.CutterRobot;

class CutterRobotTest {

    @Mock
    private CutterArm cutterArm;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shoudCutSlice(){
        CutterRobot cutterRobot = new CutterRobot(cutterArm);
        cutterRobot.cutSlice();
    }
}
