package Assignment4;
/*
EMPLOYMENT CLASS - Demonstrating Inheritance by extending
the Person super class
 */
public class Employee extends Person {

    private double salary;
    private String jobTitle;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

}
