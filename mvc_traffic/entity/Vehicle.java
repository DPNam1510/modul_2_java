package mvc_traffic.entity;

public abstract class Vehicle  {
    private int controlPlate;
    private String name;
    private int date;
    private String people;

    public Vehicle() {

    }

    public Vehicle(int controlPlate, String name, int date, String people) {
        this.controlPlate = controlPlate;
        this.name = name;
        this.date = date;
        this.people = people;
    }

    public int getControlPlate() {
        return controlPlate;
    }

    public void setControlPlate(int controlPlate) {
        this.controlPlate = controlPlate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public abstract String getInfoToCSV();

    @Override
    public String toString() {
        return "Vehical [controlPlate:" + controlPlate
                + ", name:" + name
                + ", date:" + date
                + ", people:" + people + "]";
    }
}
