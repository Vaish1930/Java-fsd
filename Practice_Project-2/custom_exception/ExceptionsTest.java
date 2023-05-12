package custom_exception;

public class ExceptionsTest {
    public static void main(String[] args) {
        try {
            throw new MyException("John Snow");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
