package day45_Abstraction.shape;

public class Cube extends Shape implements Volume{

    private double side;

    public Cube(String name, double side) {
        super(name);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0){
            throw new RuntimeException("Invalid Side: " + side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return 6*side*side;
    }

    @Override
    public double perimeter() {
        return 12*side;
    }

    @Override
    public double volume() {
        return side*side*side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                super.toString() +
                ", volume=" + volume() +
                ", side=" + side +
                '}';
    }
}
