import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busstop;
    private Person person;

    @Before
    public void before() {
        busstop = new BusStop("Glasgow");
        person = new Person();
    }

    @Test
    public void hasEmptyQueue() {
        assertEquals(0, busstop.getQueueSize());
    }

    @Test
    public void hasname() {
        assertEquals("Glasgow", busstop.getName());
    }


    @Test
    public void canAddPerson() {
        busstop.addPerson(person);
        assertEquals(1, busstop.getQueueSize());
    }

    @Test
    public void canRemovePerson() {
        busstop.addPerson(person);
        busstop.removePerson();
        assertEquals(0, busstop.getQueueSize());
    }
}
