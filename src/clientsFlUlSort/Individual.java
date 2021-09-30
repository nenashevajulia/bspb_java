package clientsFlUlSort;

public class Individual extends Clients {
    private String fio;
    private int year;
    private String gender;


    public Individual(int id, String fio, int year, String gender, long inn) {
        super(id, inn);
        this.fio = fio;
        this.year = year;
        this.gender = gender;
    }

    public int getYear() {
        return year;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Individual{" + " id=" + getId() + " fio=" + fio + " year=" + year + " gender=" + gender + " inn=" + getInn() + '}';
    }
}
