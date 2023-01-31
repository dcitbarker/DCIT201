import java.util.Scanner;

public class Main2 {
    public static void main(String[] arg) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");

        a = scanner.nextInt();

        System.out.println("Enter Second number");

        b = scanner.nextInt();

        c = a + b;
        System.out.println("Sum is " + c);
    }
}
