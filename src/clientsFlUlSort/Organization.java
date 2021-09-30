package clientsFlUlSort;

public class Organization extends Clients {
    private final String name;
    private final long ogrn;

    public Organization(int id, long inn, String name, long ogrn) {
        super(id, inn);
        this.name = name;
        this.ogrn = ogrn;
    }

    @Override
    public String toString() {
        return "Organization{" + " id=" + getId() + " name=" + name + " inn=" + getInn() + " ogrn=" + ogrn + '}';
    }
}
