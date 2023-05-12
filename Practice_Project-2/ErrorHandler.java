public class ErrorHandler {

    // throws
    static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    // throw
    static Error validateEngineerName(String name) {
        if (!name.contains("Er")) {
            throw new Error("Invalid Enginner Name");
        }
        return null;
    }

    public static void main(String[] args) {
        try {
            int resultDivision = divide(12, 0);
            System.out.println(resultDivision);
        } catch (Exception e) {
            // finally

            System.out.println("\nError " + e.getMessage());
            try {
                validateEngineerName("John Snow");

            } catch (Error e1) {

                System.out.println(e1.getMessage());
            }
        } finally {
            System.out.println("Code Terminated");
        }
    }
}
