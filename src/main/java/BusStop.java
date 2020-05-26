import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public int getQueueSize() {
        return this.queue.size();
    }

    public String getName() {
        return this.name;
    }

    public void addPerson(Person person) {
        this.queue.add(person);
    }

    public Person removePerson() {
        if (getQueueSize() > 0){
            return this.queue.remove(0);
        }
        return null;
    }
}
