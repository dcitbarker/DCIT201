package Assignment6;
// CIRCLE CLASS - extends Abstract Class
public class Circle extends AbstractShape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String ToString() {

        return "A Circle with Radius: " +
                getRadius() +
                ", Color: " +
                getColor() +
                ", has Area: " +
                getArea() +
                " and Perimeter: " +
                getPerimeter();
    }
}
