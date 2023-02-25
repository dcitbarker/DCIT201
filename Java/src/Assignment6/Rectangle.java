package Assignment6;
// RECTANGLE CLASS - extends Abstract Class
public class Rectangle extends AbstractShape {

    private double width, height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public String ToString() {

        return "A Rectangle of Width: " +
                getWidth() +
                ", Height: " +
                getHeight() +
                ", Color: " +
                getColor() +
                ", has Area: " +
                getArea() +
                " and Perimeter: " +
                getPerimeter();
    }
}
