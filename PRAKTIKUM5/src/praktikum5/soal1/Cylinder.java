package praktikum5.soal1;
public class Cylinder extends Shape {
    private double radius;
    private double height;
    public Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }
    public double area() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    public String toString() {
        return super.toString() + " with radius " + radius + " and height " + height;
    }
}