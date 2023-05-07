package access_modifiers;

class AccessDef {
    void display() {
        System.out.println("Default");
    }
}

// Implementing default Access Modifier
class AccessDef1 {
    public static void main(String[] args) {
        AccessDef ob = new AccessDef();
        ob.display();
    }
}