import java.util.Scanner;

// Queue Implemetation
public class Queue {

    int size = 5;
    int items[] = new int[size];
    int front, rear;

    Queue() {
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    void enQueue(int element) {

        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }

            rear++;
            items[rear] = element;
            System.out.println("Insert " + element);
        }
    }

    int deQueue() {
        int element;

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];

            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Deleted element :" + element);
            return (element);
        }
    }

    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {

            System.out.println("Elements in queue are: ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + "\n");

        }
    }

    public static void main(String[] args) {

        Queue queue = new Queue();
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        while (choice != 4) {
            System.out.println("\nChose one from the below options");
            System.out.println("\n1.EnQueue\n2.Dequeue\n3.Display Queue\n4.Exit");
            System.out.println("\nEnter your choice \n");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter value you want to insert");
                    int val = sc.nextInt();
                    queue.enQueue(val);

                    break;
                }
                case 2: {
                    queue.deQueue();
                    break;
                }
                case 3: {
                    queue.display();
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