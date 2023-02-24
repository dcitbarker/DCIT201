package Calculator;

public class Rectangle extends Shape implements IShape{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle() {}

    @Override
    public double area() {
        return length * breadth;
    }

    @Override
    public double perimeter() {
        return (length * 2) * (breadth * 2);
    }
}
