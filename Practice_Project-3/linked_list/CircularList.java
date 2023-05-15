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

    public void push(CircularList newNode) {
        newNode.setNext(this);
        CircularList head = this;

        while (head.next != this) {
            head = head.next;
        }
        head.setNext(newNode);
    }

    public int delete(int dataDelete) {

        CircularList head = this, previosusNode = null;

        while (head.data != dataDelete) {
            previosusNode = head;
            head = head.next;
        }
        if (previosusNode == null) {
            head = head.next;
        } else {

            previosusNode.next = head.next;
        }
        return dataDelete;
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
                circularList.setNext(circularList);
            } else {

                circularList.push(node);
            }

        }
        circularList.display();

        System.out.println("\nEnter data you want to delete");
        int deleteData = sc.nextInt();

        circularList.delete(deleteData);
        circularList.display();
        sc.close();
    }
}
