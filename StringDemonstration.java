public class StringDemonstration {
    public static void main(String[] args) {

        // String
        String s = "java is simple";
        System.out.println("Length of string : " + s.length());
        System.out.println("string in uppercase : " + s.toUpperCase());
        System.out.println("Character at index 1: " + s.charAt(1));
        System.out.println("Index of a: " + s.indexOf('a'));

        // String Buffer
        System.out.println("\nString Buffer ");
        StringBuffer s1 = new StringBuffer();
        s1.append("Hello");
        s1.append(" World");
        System.out.println("String Buffer : " + s1.toString());
        System.out.println("Length of string Buffer : " + s1.length());

        // String Builder

        System.out.println("\nString Builder ");
        StringBuilder s2 = new StringBuilder();
        s2.append("Good");
        s2.append(" morning!");
        System.out.println("String Builder : " + s2.toString());
        int capacity = s2.capacity();
        System.out.println("Caapacity of String Builder : " + capacity);

        // String to string Buffer
        System.out.println("\nString to String Buffer ");
        StringBuffer s3 = new StringBuffer(s);
        s3.append(" (Buffer)");
        System.out.println("\nString after converting to String Buffer : " + s3);

        // String to String Builder
        System.out.println("\nString to String Builder ");
        StringBuilder s4 = new StringBuilder(s);
        s4.append(" (Builder)");
        System.out.println("\nString after converting to String Builder : " + s4);

    }
}
