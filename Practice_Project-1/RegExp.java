import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {
        // Regular Expression

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = pattern.matcher("john12@gmail.com");

        if (matcher.find()) {
            System.out.println("Email is Valid");
        } else {
            System.out.println("Email is Invalid");

        }
    }
}
