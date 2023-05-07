package constructors;

//  Two types of constructors in java
// 1. Default constructor
// 2.Parameterized constructor

public class Construct {

    int a;
    int b;

    Construct() {
        System.out.println("Default constructor called\n");
    }

    Construct(int a, int b) {
        System.out.println("Parameterized constructor called");

        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        new Construct();
        var construct = new Construct(12, 14);
        System.out.println("a :" + construct.a);
        System.out.println("b :" + construct.b);
    }
}
