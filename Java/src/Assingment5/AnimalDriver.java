package Assingment5;
/*
Driver Class For Animals
 */

public class AnimalDriver {

    public static void main(String[] arg) {

        // Lion subclass of Animal
        Lion lion = new Lion();
        lion.setName("The Lion");
        lion.setAge(15);

        System.out.println();
        System.out.println("Animal: " + lion.getName());
        System.out.println("Age: " + lion.getAge());
        System.out.println("Sound: " + lion.makeSound());


        // Tiger subclass of Animal
        Tiger tiger = new Tiger();
        tiger.setName("The Tiger");
        tiger.setAge(22);

        System.out.println();
        System.out.println("Animal: " + tiger.getName());
        System.out.println("Age: " + tiger.getAge());
        System.out.println("Sound: " + tiger.makeSound());


        // Elephant subclass of Animal
        Elephant elephant = new Elephant();
        elephant.setName("The Elephant");
        elephant.setAge(150);

        System.out.println();
        System.out.println("Animal: " + elephant.getName());
        System.out.println("Age: " + elephant.getAge());
        System.out.println("Sound: " + elephant.makeSound());

    }
}
