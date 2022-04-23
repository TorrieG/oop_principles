package polymorphism;

public class Dog extends Animal{

    public void bark(){
        System.out.println("Dog barks");
    }

    @Override
    public void eat(String s) {
        System.out.println("Dog eats "+s);
    }
}
