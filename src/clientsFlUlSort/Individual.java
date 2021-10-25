package clientsFlUlSort;

public class Individual extends Client {

    private String fio;
    private int year;
    private String gender;

    public String getFio() {
        return fio;
    }

    public int getYear() {
        return year;
    }

    public String getGender() {

        return gender;
    }

    public void setFio(String fio) {

        this.fio = fio;
    }

    public void setYear(int year) {

        this.year = year;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Individual{" + " id=" + getId() + " fio=" + fio + " year=" + year + " gender=" + gender + " inn=" + getInn() + '}';
    }
}
