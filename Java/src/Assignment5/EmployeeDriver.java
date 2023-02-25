package Assignment5;
/*
Driver Class for Employee
 */
public class EmployeeDriver {

    public static void main(String[] arg) {

// first employee
        Employee employee1 = new Employee();

        System.out.println();
        employee1.setName("Anthony Barker");
        employee1.setPosition("C.E.O");
        employee1.setEmail("abarker@st.ug.edu.gh");
        employee1.setPhone("0245349574");
        employee1.setSalary(4500.50);

        System.out.println("Name: " + employee1.getName());
        System.out.println("Position: " + employee1.getPosition());
        System.out.println("Email: " + employee1.getEmail());
        System.out.println("Contact: " + employee1.getPhone());
        System.out.println("Salary: " + employee1.getSalary());
        System.out.println();

// second Employee
        Employee employee2 = new Employee();
        employee2.setName("Tony Shedeur");
        employee2.setPosition("SEO");
        employee2.setEmail("pcshedeur@gmail.com");
        employee2.setPhone("0209141666");
        employee2.setSalary(9500.50);

        System.out.println("Name: " + employee2.getName());
        System.out.println("Position: " + employee2.getPosition());
        System.out.println("Email: " + employee2.getEmail());
        System.out.println("Contact: " + employee2.getPhone());
        System.out.println("Salary: " + employee2.getSalary());
        System.out.println();


    }
}
