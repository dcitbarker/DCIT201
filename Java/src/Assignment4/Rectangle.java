package Assignment4;

/*
RECTANGLE CLASS - I wish to attempt the use of Java Record:
A special type of class declaration aimed at reducing the
boilerplate code - No constructor or setter needed here
 */
public record Rectangle(double width, double height) {

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
