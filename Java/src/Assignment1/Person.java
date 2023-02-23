package Assignment1;
/*
PERSON CLASS
 */
public class Person {

    private String FirstName, LastName, Age, Gender;
    private int phoneNumber;

    public String getFullName() {
        return this.FirstName + " " + this.LastName;
    }

    public String getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }


    public void setFirstName(String fName) {
        this.FirstName = fName;
    }

    public void setLastName(String lName) {
        this.LastName = lName;
    }

    public void setAge(String age) {
        Age = age;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
