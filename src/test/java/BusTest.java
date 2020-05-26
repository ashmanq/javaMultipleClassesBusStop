import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;

    @Before
    public void before(){
        bus = new Bus("Glasgow", 20);
    }

    @Test
    public void hasDestination() {
        assertEquals("Glasgow", bus.getDestination());
    }
}
