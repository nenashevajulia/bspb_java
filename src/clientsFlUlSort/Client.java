package clientsFlUlSort;

import java.util.Random;

public class Client {
    protected int id;
    protected long inn;

    public int getId() {
        return id;
    }

    public long getInn() {
        return inn;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setInn(long inn) {

        this.inn = inn;
    }

    public int generateId() {
        Random random = new Random();
        return Math.abs(random.nextInt());
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + " inn=" + inn + '}';
    }
}
