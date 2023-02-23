package Assignment3;

/*
CAR CLASS
 */
public class Car {
    private String make, model;
    private int year;
    private double speed;


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public double accelerate() {
        return this.speed += 10;
    }

    public double brake() {
        return this.speed -= 7;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
