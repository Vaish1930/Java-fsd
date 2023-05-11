package object_oriented_implementation;

// class and objects

public class Employee {

    static String Employee_name;
    static int Employee_salary;

    static void set(String name, int salary) {
        Employee_name = name;
        Employee_salary = salary;
    }

    static void get() {
        System.out.println("Employee name is: " + Employee_name);
        System.out.println("Employee CTC is: " + Employee_salary);
    }

    public static void main(String args[]) {
        Employee.set("John", 10000);
        Employee.get();
    }

}
