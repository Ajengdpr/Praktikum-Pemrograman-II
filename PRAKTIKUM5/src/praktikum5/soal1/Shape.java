package praktikum5.soal1;
public abstract class Shape {
    protected String shapeName;

    public Shape(String name) {
        shapeName = name;
    }
    public abstract double area();

    public String toString() {
        return "Shape: " + shapeName;
    }
}