package Assignment4;
/*
DRIVER CLASS for demonstrating the use of Inheritance
 */
public class EmployeeDriver {

    public static void main(String[] arg) {

        Employee employee = new Employee();

        employee.setName("Anthony Barker");
        employee.setJobTitle("SEO");
        employee.setAge(20);
        employee.setGender("Male");
        employee.setSalary(4000.0);

        System.out.println();
        System.out.println("EMPLOYEE RECORDS");
        System.out.println("Employee: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Gender: " + employee.getGender());
        System.out.println("Current Salary: " + employee.getSalary());
        System.out.println();

    }
}
