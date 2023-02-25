package Assignment4;

import java.util.Arrays;

/*
DRIVER CLASS FOR STUDENTS grades - Demonstrating Array of Objects
 */
public class StudentDriver {

    public static void main(String[] arg) {

        Student[] student = {
                new Student("Anthony Barker", 20, new double[]{85.0, 90.6, 89.0, 100, 98.6}),
                new Student("Tony Shedeur", 22, new double[]{80.0, 80.6, 80.0, 70, 90.6}),
                new Student("PC Shedeur", 23, new double[]{80.0, 94.6, 87.0, 90, 91.5}),
                new Student("Shedeur Barker", 19, new double[]{82.8, 94.6, 80.0, 100, 95.6}),
                };

        // using a loop to run through the Student Array and calling the Average Method on each object
        System.out.println();
        System.out.println("STUDENT AVERAGE GRADES");
        System.out.println("==================================");
        for(Student each_student : student) {
            System.out.println("Name: " + each_student.getName() + " - " + each_student.getAge() + " years old");
            System.out.println("Grades: " + Arrays.toString(each_student.getGrades()));
            System.out.println("Average Grade: " + each_student.getAverage());
            System.out.println();
        }

    }
}
