package polymorphism;

public class TestPolymorphism {

    public static void main(String[] args) {

        System.out.println("\n----------Testing Animal objects----------\n");
        Animal a1 = new Animal();
        a1.eat();
        a1.sleep();

        System.out.println("\n----------Testing Dog objects----------\n");
        Dog d1 = new Dog();
        d1.eat();
        d1.sleep();
        d1.bark();

        System.out.println("\n----------Dog object in the shape of Animal----------\n");
        Animal a2 = new Dog(); // up-casting
        a2.eat();
        a2.sleep();
        a2.eat("food");
        //a2.bark(); //compiler error


    }
}
