package custom_exception;

public class MyException extends Exception {

    String name;

    public MyException(String name) {
        if (!name.contains("Er")) {
            this.name = "Invalid Enginner Name";
        }

    }

    @Override
    public String toString() {
        return this.name;
    }

}
