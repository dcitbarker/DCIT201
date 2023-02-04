import java.util.Scanner;

public class Calculator {
    // properties
    private int leftOperand;
    private int rightOperand;
    int anotherVariableForDemonstration; // Camel Casing

    /**
     * constructor is a method that defines the rules for creating classes
     a constructor cannot have a return type
     must have same named as class. A class can have multiple constructors
     By default, every class has a no-arg constructor
     */

    public Calculator(){}

    public Calculator(int leftOperand, int rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    // methods

    /**
     * signature of a method
     * it begins with the visibility modifier: public, protected, private
     * Public: accessible to all
     * Protected means accessible to all in the same package
     * private: accessible only to class in which it was defined
     * Next: return type - datatype or object returned by the method using
     * the RETURN keyword
     */
    // Method overloading - defining an re-existing method but with different params



    public int add() {
        return this.leftOperand + this.rightOperand;
    }

    public int subtract() {
        return this.leftOperand - this.rightOperand;
    }

    public int multiply() {
        return this.leftOperand * this.rightOperand;
    }

    public int division() {
        return this.leftOperand / this.rightOperand;
    }

    // getters and setters: just methods named  using property name prepended
    // by the word get or set
    // getters return the value of the property it is named after.
    // setters set the value of the property they are named after.
    // used to gain access to properties we have declared to be private


    public int getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(int leftOperand) {
        this.leftOperand = leftOperand;
    }

    public int getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(int rightOperand) {
        this.rightOperand = rightOperand;
    }
}
