package Assignment1;
/*
DRIVER CLASS for creating a few Person objects from the person Class
We then set the properties and get the properties
 */
public class PersonDriver {
    // storing sample people in a String array
    static String[] prs1 = {"Anthony", "Barker", "20", "male", "024549574"};
    static String[] prs2 = {"Tony", "Shedeur", "19", "male", "0209141666"};
    static String[] prs3 = {"PC", "Barker", "22", "Female", "0240214327"};

    public static void main(String[] args) {
        Person person_1 = new Person();   // first person object

        // SETTERS FOR PERSON 1
        // Setting person object properties from array
        person_1.setFirstName(prs1[0]);
        person_1.setLastName(prs1[1]);
        person_1.setAge(prs1[2]);
        person_1.setGender(prs1[3]);
        person_1.setPhoneNumber(Integer.parseInt(prs1[4]));   // casting to int


        // SETTERS FOR PERSON 2
        Person person_2 = new Person();   // second person object
        person_2.setFirstName(prs2[0]);
        person_2.setLastName(prs2[1]);
        person_2.setAge(prs2[2]);
        person_2.setGender(prs2[3]);
        person_2.setPhoneNumber(Integer.parseInt(prs2[4]));   // casting to int


        // SETTERS FOR PERSON 3
        Person person_3 = new Person();   // third person object
        person_3.setFirstName(prs3[0]);
        person_3.setLastName(prs3[1]);
        person_3.setAge(prs3[2]);
        person_3.setGender(prs3[3]);
        person_3.setPhoneNumber(Integer.parseInt(prs3[4]));   // casting to int

        // using the getters in Person objects to retrieve data stored in the properties
        System.out.println("DETAILS OF PERSON 1:");
        System.out.println("FullName : " + person_1.getFullName());
        System.out.println("Age: " + person_1.getAge());
        System.out.println("Gender: " + person_1.getGender());
        System.out.println("Phone Number: " + person_1.getPhoneNumber());

        System.out.println();
        System.out.println("--------------------------");
        System.out.println("DETAILS OF PERSON 2:");
        System.out.println("FullName : " + person_2.getFullName());
        System.out.println("Age: " + person_2.getAge());
        System.out.println("Gender: " + person_2.getGender());
        System.out.println("Phone Number: " + person_2.getPhoneNumber());

        System.out.println();
        System.out.println("--------------------------");
        System.out.println("DETAILS OF PERSON 3:");
        System.out.println("FullName : " + person_3.getFullName());
        System.out.println("Age: " + person_3.getAge());
        System.out.println("Gender: " + person_3.getGender());
        System.out.println("Phone Number: " + person_3.getPhoneNumber());
    }
}