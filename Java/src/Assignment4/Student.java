package Assignment4;
/*
STUDENT CLASS
 */
public class Student {

    private final String name;
    private final int age;
    private final double[] grades;

    // Introducing a constructor to replace the Setters
    public Student(String name, int age, double[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getGrades() {
        return grades;
    }

    public double getAverage() {
        double sum = 0.0;
        for(double each : this.grades) {
            sum += each;
        }
        return sum / (this.grades.length);
    }

}
