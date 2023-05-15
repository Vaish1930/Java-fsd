package linked_list;

import java.util.Scanner;

public class DoublyList {

    DoublyList prev;
    int data;
    DoublyList next;

    public DoublyList(DoublyList prev, int data, DoublyList next) {
        this.prev = prev;
        this.next = next;
        this.data = data;
    }

    public DoublyList getPrev() {
        return prev;
    }

    public void setPrev(DoublyList prev) {
        this.prev = prev;
    }

    public DoublyList getNext() {
        return next;
    }

    public void setNext(DoublyList next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void push(DoublyList newNode) {
        DoublyList head = this;
        while (head.next != null) {
            head = head.next;
        }
        head.setNext(newNode);
        newNode.setPrev(head);
    }

    public void display() {
        DoublyList head = this.next;
        DoublyList last = this.next;

        while (head != null) {
            System.out.print(head.data + " -> ");
            last = head;
            head = head.next;
        }
        System.out.println("\nRverse Direction");
        while (last != null && last.data != 0) {
            System.out.print(last.data + " -> ");
            last = last.prev;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DoublyList doublyList = new DoublyList(null, 0, null);

        while (true) {
            System.out.println("\nInput data in Linked-List or press 0 to exit");
            int data = sc.nextInt();
            if (data == 0) {
                break;
            }

            doublyList.push(new DoublyList(null, data, null));

        }
        System.out.println("Traversing in forward Direction");
        if (doublyList != null)
            doublyList.display();

        sc.close();
    }

}

// null 1 a2 -> a1 2 3a-> 2a 30 null
