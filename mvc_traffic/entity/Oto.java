package mvc_traffic.entity;

public class Oto {
    private String controlPlate;
    private String name;
    private int date;
    private String email;
    private String people;
    private int seats;
    private String typeCar;

    public String getControlPlate() {
        return controlPlate;
    }

    public void setControlPlate(String controlPlate) {
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPeople() {
        return people;
    }
    public void setPeople(String people) {
        this.people = people;
    }
    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public String getTypeCar() {
        return typeCar;
    }
    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }
    @Override
    public String toString() {
        return "Oto: ControlPlate: " + controlPlate
                + ", Name: " + name
                + ", Date: " + date
                + ", Email: " + email
                + ", People: " + people
                + ", Seats: " + seats
                + ", TypeCar: " + typeCar;
    }

}
