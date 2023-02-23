package Assignment3;

/*
CIRCLE CLASS
 */
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {
    private double radius;

    public double getArea() {
        double number = Math.PI * Math.pow(this.radius, 2);  // using Math power method
        BigDecimal bd = new BigDecimal(number).
                setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        double number = 2 * Math.PI * this.radius;
        BigDecimal bd = new BigDecimal(number).
                setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
