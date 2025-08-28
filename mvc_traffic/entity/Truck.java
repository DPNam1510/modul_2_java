package mvc_traffic.entity;

public class Truck {
    private  int controlplate;
    private String name;
    private int date;
    private String people;
    private int payload;
    public int   getControlplate() {
        return controlplate;
    }
    public void setControlplate(int controlplate) {
        this.controlplate = controlplate;
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
    public int getPayload() {
        return payload;
    }
    public void setPayload(int payload) {
        this.payload = payload;
    }
    @Override
    public String toString() {
        return "Truck: ControlPlate: " + controlplate
                + ", Name: " + name
                + ", Date: " + date
                + ", People: " + people
                + ", Payload: " + payload;
    }
}
