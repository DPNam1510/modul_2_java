package ss6Inheritance;

public class Clinder extends CircleClinder {
    private double height;

    public Clinder(double height, String color, double radius) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * getArea();
    }

    @Override
    public String toString() {
        return "Clinder["+super.toString()+", Height: " + height + ", Volume: " + getVolume()+ "]";
    }

}
