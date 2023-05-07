package access_modifiers;

class AccessPri {
    private void display() {
        System.out.println("Private Access Modifier");
    }
}

// Implementing private Access Modifier
class AccessPri1 {
    public static void main(String[] args) {
        AccessPri ob = new AccessPri();
        // ob.display(); // Error as display() has private access in AccessPri
    }
}