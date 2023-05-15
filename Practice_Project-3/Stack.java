
// Implemented Stack
import java.util.Scanner;

class Stack {

    private int arr[];
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
        }

        System.out.println("Insert " + x);
        arr[++top] = x;
    }

    public int pop() {

        if (isEmpty()) {
            System.out.println("STACK EMPTY");
        }

        return arr[top--];
    }

    public int getSize() {
        return top + 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print("Elements in the Stack " + arr[i] + "\n");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        while (choice != 4) {
            System.out.println("Chose one from the below options...\n");
            System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");
            System.out.println("\nEnter your choice \n");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter value you want to insert");
                    int val = sc.nextInt();
                    stack.push(val);

                    break;
                }
                case 2: {
                    stack.pop();
                    break;
                }
                case 3: {
                    stack.display();
                    break;
                }
                case 4: {
                    System.out.println("Exit");
                    break;
                }
                default: {
                    System.out.println("Please Enter valid choice ");
                }
            }
        }
        sc.close();
    }
}