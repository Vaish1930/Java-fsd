/**
 * DemoTypeCasting
 * Writing a program in Java to implement implicit and explicit type casting
 */
public class DemoTypeCasting {
    public static void main(String[] args) {

        // Implicit type casting - automatically done by compiler
        char a = 'y';

        int c = a + 12; // a that stores 'y' is automatically converted into integer
        System.out.println("Before Implicit type-casting : " + a);
        System.out.println("After Implicit type-casting : " + c);

        // Explicit type casting - user have to do manually
        double n = 12.34;
        int x = (int) n;

        System.out.println("Before explicit type-casting : " + n);
        System.out.println("After explicit type-casting : " + x);

    }

}