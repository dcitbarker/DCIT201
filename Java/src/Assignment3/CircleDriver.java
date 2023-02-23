package Assignment3;

/*
CIRCLE MAIN/ DRIVER CLASS
 */
public class CircleDriver {

    public static void main(String[] args) {

        System.out.println("-----------------------------------------------------");
        Circle circle_1 = new Circle();
        circle_1.setRadius(4);

        System.out.println("A Circle of Radius " +
                circle_1.getRadius() + "m has \nArea: " +
                circle_1.getArea() + " meters square and Circumference: " +
                circle_1.getCircumference() + "m");


        System.out.println("-----------------------------------------------------");
        Circle circle_2 = new Circle();
        circle_2.setRadius(9);

        System.out.println("A Circle of Radius " +
                circle_2.getRadius() + "m has \nArea: " +
                circle_2.getArea() + " meters square and Circumference: " +
                circle_2.getCircumference() + "m");

        System.out.println("-----------------------------------------------------");
    }
}
