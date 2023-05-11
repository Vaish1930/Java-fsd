package object_oriented_implementation;

public class Child extends Parent {

    void talking() {
        System.out.println("Childish talking");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.talking();

    }
}
