package object_oriented_implementation;

// Function overloading is compile time polymorphism

public class Child extends Parent {

    @Override
    void talking() {
        System.out.println("Childish talking");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.talking();

    }
}
