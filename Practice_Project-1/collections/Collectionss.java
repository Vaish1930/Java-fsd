package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Collectionss {

    static void arrayListImplemetation() {
        // ArrayList
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Papaya");
        fruits.add("Strawberry");

        System.out.println("\nArray List of Fruits : " + fruits);
        fruits.remove(1);
        System.out.println("\nArray List of Fruits after removing element at index 1 : " + fruits);
    }

    static void linkedListImplementation() {
        // Linked List
        LinkedList<Integer> fruitsPrice = new LinkedList<Integer>();
        fruitsPrice.add(124);
        fruitsPrice.add(100);
        fruitsPrice.add(12);
        fruitsPrice.add(15);
        fruitsPrice.add(50);
        System.out.println("\nLinked List of FruitsPrice : " + fruitsPrice);
        fruitsPrice.removeLast();
        System.out.println("\nLinked List of FruitsPrice after removing Last elemet : " + fruitsPrice);
    }

    static void hashSetImplementation() {
        // HashSet

        HashSet<String> fruits = new HashSet<String>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Papaya");
        fruits.add("Strawberry");
        fruits.add("Mango");
        System.out.println("\nHash set of Fruits : " + fruits);

    }

    static void vectorListImplemetation() {
        // Vector
        Vector<String> fruits = new Vector<String>();
        fruits.addElement("Kiwi");
        fruits.addElement("Banana");
        fruits.addElement("Grapes");
        fruits.addElement("BlueBerry");
        fruits.addElement("Strawberry");

        System.out.println("\nVector of Fruits : " + fruits);

    }

    public static void main(String[] args) {
        arrayListImplemetation();
        linkedListImplementation();
        hashSetImplementation();
        vectorListImplemetation();
    }
}
