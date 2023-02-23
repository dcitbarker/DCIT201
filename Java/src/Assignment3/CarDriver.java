package Assignment3;
/*
CAR MAIN CLASS
 */
public class CarDriver {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------");
        Car car_1 = new Car();
        car_1.setMake("Toyota");
        car_1.setModel("RAV4");
        car_1.setYear(2018);
        car_1.setSpeed(120.0);

        System.out.println("Car 1 Details:\nMake: " + car_1.getMake());
        System.out.println("Model: " + car_1.getModel());
        System.out.println("Year: " + car_1.getYear());
        System.out.println("Speed: " + car_1.getSpeed());

        System.out.println("Increasing the Speed by 10mph: " + car_1.accelerate());
        System.out.println("Reducing the Speed by 7mph: " + car_1.brake());

        System.out.println("-----------------------------------------------------");


        Car car_2 = new Car();
        car_2.setMake("Toyota");
        car_2.setModel("CHR");
        car_2.setYear(2017);
        car_2.setSpeed(100.0);

        System.out.println("Car 2 Details:\nMake: " + car_2.getMake());
        System.out.println("Model: " + car_2.getModel());
        System.out.println("Year: " + car_2.getYear());
        System.out.println("Speed: " + car_2.getSpeed());

        System.out.println("Increasing the Speed by 10mph: " + car_2.accelerate());
        System.out.println("Reducing the Speed by 7mph: " + car_2.brake());

        System.out.println("-----------------------------------------------------");
    }
}