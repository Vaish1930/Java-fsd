
public class TestTryAndCatch {
    public static void main(String[] args) {
        try {
            // int result = 50 / 0; // may throw exception
        }
        // handling the exception
        catch (ArithmeticException e) {
            System.out.println(e);

        }
        System.out.println("rest of the code");

    }
}
