package access_modifiers;

class AccessProtec {
    protected void display() {
        System.out.println("Protected Access Modifier");
    }

}

// Implementing protected Access Modifier
class AccessProtec_1 extends AccessProtec {

    public static void main(String[] args) {
        AccessProtec ob = new AccessProtec();

        ob.display();
    }
}