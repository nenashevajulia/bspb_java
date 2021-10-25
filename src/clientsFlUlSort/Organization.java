package clientsFlUlSort;


public class Organization extends Client {

    private String name;
    private long ogrn;

    public String getName() {
        return name;
    }

    public long getOgrn() {
        return ogrn;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setOgrn(long ogrn) {

        this.ogrn = ogrn;
    }

    @Override
    public String toString() {
        return "Organization{" + " id=" + getId() + " name=" + name + " inn=" + getInn() + " ogrn=" + ogrn + '}';
    }

}

