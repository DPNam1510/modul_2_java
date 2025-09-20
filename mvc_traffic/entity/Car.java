package mvc_traffic.entity;


public class Car extends Vehicle {
    private int seat;
    private String type;

    public Car() {
    }

    public Car(int controlPlate, String name, int date, String people, int seat, String type) {
        super(controlPlate, name, date, people);
        this.seat = seat;
        this.type = type;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getInfoToCSV() {
        return this.getControlPlate() + ","
                + this.getName() + ","
                + this.getDate() + ","
                + this.getPeople() + ","
                + this.getSeat() + ","
                + this.getType() + ",";
    }

    @Override
    public String toString() {
        return "Car[" + super.toString()
                + "seat=" + seat
                + ",type=" + type
                + "]";
    }

}
