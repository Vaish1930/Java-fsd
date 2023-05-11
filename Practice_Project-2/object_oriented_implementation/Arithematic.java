package object_oriented_implementation;

//  run time polymorphism

public class Arithematic {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Arithematic arithematic = new Arithematic();
        System.out.println("Sum of two Numbers " + arithematic.sum(12, 34));
        System.out.println("Sum of three Numbers " + arithematic.sum(12, 34, 45));

    }
}
