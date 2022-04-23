package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PolymorphicCollections {

    public static void main(String[] args) {
        Cat cat1  = new Cat();
        Dog dog1 = new Dog();
        Animal animal1 = new Animal();

        System.out.println("\n--------Cat Object-------\n");
        cat1.eat();
        cat1.sleep();
        cat1.eat("fish");

        System.out.println("\n--------Dog Object-------\n");
        dog1.eat();
        dog1.sleep();
        dog1.eat("meat");

        System.out.println("\n--------Animal Object-------\n");
        animal1.eat();
        animal1.sleep();
        animal1.eat("some food");

        System.out.println("\n--------Cat and Dog Object in Animal Shape-------\n");
        Animal aCat2 = new Cat();
        aCat2.eat();
        aCat2.sleep();

        Animal aDog2 = new Dog();
        aDog2.eat();
        aDog2.sleep();

        System.out.println("\n--------Animal List-------\n");
        Animal[] animals = {cat1,aCat2,dog1,aDog2,animal1};

        int cat = 0, dog = 0;
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
        }
        System.out.println("\n--------ArrayList Collection of Animals-------\n");
        ArrayList<Animal> animalList = new ArrayList<>(Arrays.asList(animals));
        for (Animal animal : animalList) {
            animal.eat();
        }
        animalList.forEach(animal -> animal.eat());//lambda instead of loop

        new ArrayList<>(Arrays.asList(animals)).forEach(Animal::eat);//Anonymous object







    }
}
