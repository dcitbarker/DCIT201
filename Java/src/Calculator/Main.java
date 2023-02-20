package Calculator;

import javax.sql.rowset.serial.SerialArray;
import java.sql.Array;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        int operator;
        double result = 0;

        Calculator calculator = new Calculator();
        Calculator calculator2 = new Calculator();
        Calculator calculator3 = new Calculator();
        Calculator calculator4 = new Calculator();
        Calculator calculator5 = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Operation number: 1. Addition 2. " +
                "Subtraction 3. Multiplication 4. Division");
        operator = scanner.nextInt();

        System.out.println("Enter first number");
        calculator.setLeftOperand(scanner.nextInt());

        System.out.println("Enter Second number");
        calculator.setRightOperand(scanner.nextInt());

        switch (operator) {
            case 1 -> result = calculator.add();
            case 2 -> result = calculator.subtract();
            case 3 -> result = calculator.multiply();
            case 4 -> result = calculator.division();
            default -> System.out.println("Invalid operation");
        }

        System.out.println("Result is " + result);

        int home = 2;
        double v = Math.sqrt(4);


    }




}
