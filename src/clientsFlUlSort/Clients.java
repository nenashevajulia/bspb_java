package clientsFlUlSort;

public class Clients {
    private final int id;
    private final long inn;

    public Clients(int id, long inn) {
        this.id = id;
        this.inn = inn;
    }

    public int getId() {
        return id;
    }

    public long getInn() {
        return inn;
    }

    @Override
    public String toString() {
        return "Clients{" + "id=" + id + " inn=" + inn + '}';
    }
}
