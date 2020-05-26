import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busstop;

    @Before
    public void before(){
        bus = new Bus("Glasgow", 20);
        person = new Person();
        busstop = new BusStop("Glasgow");
    }

    @Test
    public void hasDestination() {
        assertEquals("Glasgow", bus.getDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(20, bus.getCapacity());
    }

    @Test
    public void getPassengersNumber() {
        assertEquals(0, bus.getPassengerNumber());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengerNumber());
    }

    @Test
    public void cantAddPassengerBeyondCapacity() {
        Bus smallBus = new Bus("Glasgow", 1);

        smallBus.addPassenger(person);
        smallBus.addPassenger(person);
        assertEquals(1, smallBus.getPassengerNumber());
    }


    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(0, bus.getPassengerNumber());
    }

    @Test
    public void cantRemovePassengerZero() {
        bus.removePassenger(person);
        assertEquals(0, bus.getPassengerNumber());
    }

    @Test
    public void canPickUpPassengerFromBusStop(){
        busstop.addPerson(person);
        bus.pickUp(busstop);
        assertEquals(0, busstop.getQueueSize());
        assertEquals(1, bus.getPassengerNumber());
    }
    @Test
    public void cantPickUpPassengerFromBusStopWithNoPeople(){
        busstop.addPerson(person);
        bus.pickUp(busstop);
        bus.pickUp(busstop);
        assertEquals(0, busstop.getQueueSize());
        assertEquals(1, bus.getPassengerNumber());
    }


}
