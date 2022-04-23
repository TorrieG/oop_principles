package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class CastingObject {
    public static void main(String[] args) {
        Cat cat1 = new Cat(); // no casting

        Animal animal1 = new Cat();//up-casting Cat in the shape of Animal
        Object object1 = new Cat();//up-casting Cat in the shape of Object

        List<Animal> animals = new ArrayList<>(); //up-casting ArrayList in the shape of List

        /*
        Down-casting
        -putting bigger data into smaller
        -happens explicitly
        BUT: there could be data loss with primitives
        there can be Exceptions thrown with object if done improperly
         */

        Animal a1 = new Dog();//up-casted
        //a1.bark(); //bark(); not available yet
        Dog dog = (Dog) a1;//down-casting Dog back to Animal

        a1.eat();
        ((Dog) a1).bark();
        dog.eat();


    }
}
