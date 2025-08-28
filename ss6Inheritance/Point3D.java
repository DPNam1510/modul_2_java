package ss6Inheritance;

public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getz() {
        return z;
    }

    public void setz(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }
    @Override
    public String toString() {
        return "Poin3D:["+ super.toString()+","+getz()+"]";
    }
}
