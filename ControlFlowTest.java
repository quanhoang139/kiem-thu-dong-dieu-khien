import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ControlFlowTest {

    @Test
    public void R1() {
        assertEquals(-1, Main.calculateReward(51, 8, false));
    }

    @Test
    public void R2() {
        assertEquals(4500, Main.calculateReward(5, 11, true));
    }

}
