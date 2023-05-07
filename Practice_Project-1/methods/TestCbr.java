package methods;

// 2. Call by reference

public class TestCbr {
    int sum(int a, int b) {
        System.out.println("Calling by Reference");
        return a + b;

    }

    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 14;
        var ob = new TestCbr();
        System.out.print("Sum :" + ob.sum(num1, num2));
    }
}
