package Assignment4;
/*
Driver Class for Rectangle class - A Java Record Class
 */

public class RectangleDriver {

    public static void main(String[] arg) {

        Rectangle rectangle1 = new Rectangle(20, 4);
        Rectangle rectangle2 = new Rectangle(15, 8);

        System.out.println();
        System.out.print("Area and Perimeter of Rectangle with Width: ");
        System.out.print(rectangle1.width() + " and Height: ");
        System.out.println(rectangle1.height() + " is: ");
        System.out.print(rectangle1.getArea());
        System.out.print(" and " + rectangle1.getPerimeter() + " respectively");
        System.out.println();
        System.out.println();

        System.out.print("Area and Perimeter of Rectangle with Width: ");
        System.out.print(rectangle2.width() + " and Height: ");
        System.out.println(rectangle2.height() + " is: ");
        System.out.print(rectangle2.getArea());
        System.out.print(" and " + rectangle2.getPerimeter() + " respectively");
        System.out.println();

    }

}
