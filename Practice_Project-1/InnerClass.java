class OuterClass {

    public class InnerClass {
        void show() {

            System.out.println("Inner Class");
        }
    }
}

class Test {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.show();
    }
}