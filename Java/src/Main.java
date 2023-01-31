import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        int operator;
        double result = 0;

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Operation number: 1. Addition 2. Subtraction 3. Multiplication 4. Division");
        operator = scanner.nextInt();

        System.out.println("Enter first number");

        calculator.setLeftOperand(scanner.nextInt());

        System.out.println("Enter Second number");
        calculator.setRightOperand(scanner.nextInt());

        switch (operator) {
            case 1:
                result = calculator.add();
            break;
            case 2:
                result = calculator.subtract();
            break;
            case 3:
                result = calculator.multiply();
            break;
            case 4:
                result = calculator.division();
                break;
            default: System.out.println("Invalid operation");
        }

        System.out.println("Result is " + result);


//        System.out.println("Sum is " + calculator.add());
//        System.out.println("Subtraction is " + calculator.subtract());
//        System.out.println("Divide is " + calculator.division());
//        System.out.println("Multiply is " + calculator.multiply());
    }
}
