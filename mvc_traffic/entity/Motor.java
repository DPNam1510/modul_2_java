package mvc_traffic.entity;

public class Motor extends Vehicle  {
    private int power;

    public Motor() {

    }

    @Override
    public String getInfoToCSV() {
        return this.getControlPlate() + ","
                + this.getName() + ","
                + this.getDate() + ","
                + this.getPeople() + ","
                + this.getPower();
    }

    public Motor(int controlPlate, String name, int date, String people, int power) {
        super(controlPlate, name, date, people);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Motor[" + super.toString()
                + "power=" + power
                + "]";
    }
}
