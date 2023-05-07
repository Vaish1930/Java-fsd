package access_modifiers;

public class AccessPub {
    public void display() {
        System.out.println("Public Access Modifier");
    }
}

// Implementing Public Access Modifier
class AccessPub_1 extends AccessPub {

    public static void main(String[] args) {
        var ob = new AccessPub();

        ob.display();
    }
}