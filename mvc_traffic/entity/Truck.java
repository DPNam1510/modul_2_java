package mvc_traffic.entity;

public class Truck extends Vehicle {
    private int weight;

    public Truck() {
    }

    public Truck(int controlPlate, String name, int date, String people, int weight) {
        super(controlPlate, name, date, people);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
@Override
public String getInfoToCSV(){
        return this.getControlPlate() + ","
                + this.getName() + ","
                + this.getDate() + ","
                + this.getPeople() + ","
                + this.getWeight();
}
    @Override
    public String toString() {
        return "Truck{"
                + super.toString()
                + "weight=" + weight +
                "} ";
    }

}
