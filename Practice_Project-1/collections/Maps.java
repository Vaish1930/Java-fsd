package collections;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        // Hash Map
        HashMap<String, String> person = new HashMap<String, String>();

        person.put("First-name", "John");
        person.put("Last-name", "Snow");
        person.put("age", "23");
        person.put("occupation", "Software-Developer");
        person.put("location", "LA");

        System.out.println("Hash Map of person : " + person);
        person.replace("age", "23", "20");
        System.out.println("Hash Map of person after Updating: " + person);
    }
}
