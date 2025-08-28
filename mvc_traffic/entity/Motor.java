package mvc_traffic.entity;

public class Motor {
    private int controlPlate;
    private String name;
    private int date;
    private String people;
    private int power;

public Motor(){

}
    public Motor(int controlPlate, String name, int date, String people, int power) {
        this.controlPlate = controlPlate;
        this.name = name;
        this.date = date;
        this.people = people;
        this.power = power;
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Motor: ControlPlate: " + controlPlate
                + ", Name: " + name
                + ", Date: " + date
                + ", People: " + people
                + ", Power: " + power;
    }
}
