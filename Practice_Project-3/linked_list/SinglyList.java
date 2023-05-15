package linked_list;

import java.util.Scanner;

public class SinglyList {
    SinglyList next;
    int data;

    public SinglyList(SinglyList next, int data) {
        this.next = next;
        this.data = data;
    }

    public SinglyList getNext() {
        return next;
    }

    public void setNext(SinglyList next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void push(SinglyList newNode) {
        SinglyList head = this;
        while (head.next != null) {
            head = head.next;
        }
        head.setNext(newNode);
    }

    public int delete(int dataDelete) {

        SinglyList head = this, previosusNode = null;

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
        SinglyList head = this.next;
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SinglyList singlyList = new SinglyList(null, 0);

        while (true) {
            System.out.println("\nInput data in Linked-List or press 0 to exit");
            int data = sc.nextInt();
            if (data == 0) {
                break;
            }

            singlyList.push(new SinglyList(null, data));

        }
        if (singlyList != null)
            singlyList.display();

        System.out.println("\nEnter data you want to delete");
        int deleteData = sc.nextInt();

        singlyList.delete(deleteData);
        if (singlyList != null)
            singlyList.display();
        sc.close();
    }

}

// 1 -> 2-> 30