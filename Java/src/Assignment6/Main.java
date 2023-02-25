package Assignment6;
// MAIN CLASS - creates 2 Rectangle and Circle Objects
public class Main {

    public static void main(String[] arg) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(12);
        rectangle1.setHeight(10);
        rectangle1.setColor("Blue");

        System.out.println();
        System.out.println("RECTANGLE 1");
        System.out.println(rectangle1.ToString());
        System.out.println();

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setWidth(6);
        rectangle2.setHeight(5);
        rectangle2.setColor("Green");

        System.out.println("RECTANGLE 2");
        System.out.println(rectangle2.ToString());
        System.out.println();

        Circle circle1 = new Circle();
        circle1.setRadius(5);
        circle1.setColor("Yellow");
        System.out.println("CIRCLE 1");
        System.out.println(circle1.ToString());

        Circle circle2 = new Circle();
        circle2.setRadius(10);
        circle2.setColor("Orange");

        System.out.println();
        System.out.println("CIRCLE 2");
        System.out.println(circle2.ToString());
    }
}
