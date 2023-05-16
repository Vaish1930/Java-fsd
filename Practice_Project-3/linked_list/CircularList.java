package linked_list;

import java.util.Scanner;

public class CircularList {
    CircularList next;
    int data;

    public CircularList(CircularList next, int data) {
        this.next = next;
        this.data = data;
    }

    public CircularList getNext() {
        return next;
    }

    public void setNext(CircularList next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public CircularList push(CircularList newNode) {
        CircularList head = this;
        if (head.data > newNode.data) {
            while (head.next != this) {
                head = head.next;
            }
            newNode.setNext(this);
            head.setNext(newNode);
            return newNode;
        } else {
            while (newNode.data > head.next.data && head.next != this) {
                head = head.next;
            }
            newNode.setNext(head.getNext());
            head.setNext(newNode);
            return this;
        }
    }

    public void display() {
        CircularList head = this;

        do {
            System.out.print(head.data + " -> ");
            head = head.next;
        } while (head != this);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CircularList circularList = null;

        while (true) {
            System.out.println("\nInput data in Linked-List or press 0 to exit");
            CircularList node = new CircularList(null, sc.nextInt());
            if (node.data == 0) {
                break;
            }

            if (circularList == null) {
                circularList = node;
                circularList.setNext(node);
            } else {

                circularList = circularList.push(node);

            }

        }
        circularList.display();

        sc.close();
    }
}
