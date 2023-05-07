package methods;

// 1. Call by value

public class TestCbv {

    int sum(int a, int b) {
        System.out.println("Calling by value");
        return a + b;
    }

    public static void main(String[] args) {
        var ob = new TestCbv();
        int sum = ob.sum(12, 24);
        System.out.print("Addition of two number " + sum);
    }
}
