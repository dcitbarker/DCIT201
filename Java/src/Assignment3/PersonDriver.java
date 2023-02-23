package Assignment3;
/*
PERSON DRIVER CLASS
 */
public class PersonDriver {

    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------");
        Person person_1 = new Person();
        person_1.setName("Anthony Baker");
        person_1.setAge(20);
        person_1.setAddress("Evandy Annex A");

        System.out.println("Person 1 Details:\nName: " + person_1.getName());
        System.out.println("Age: " + person_1.getAge());
        System.out.println("Address: " + person_1.getAddress());

        System.out.println("-----------------------------------------------------");

        Person person_2 = new Person();
        person_2.setName("Tony Shedeur");
        person_2.setAge(22);
        person_2.setAddress("East Legon - 23 Link");

        System.out.println("Person 2 Details:\nName: " + person_2.getName());
        System.out.println("Age: " + person_2.getAge());
        System.out.println("Address: " + person_2.getAddress());

        System.out.println("-----------------------------------------------------");



    }
}
