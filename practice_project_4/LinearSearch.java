package practice_project_4;

import java.util.Scanner;

// Implementing Linear Search

public class LinearSearch {

    public static boolean linearSearch(int ar[], int num) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array");
        int size = sc.nextInt();
        int ar[] = new int[size];
        System.out.println("Input numbers in Array");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.println("Input number you want to search");
        int num = sc.nextInt();

        if (LinearSearch.linearSearch(ar, num) == true) {
            System.out.println("Number Found");
        } else {
            System.out.println("Number not found");
        }

        sc.close();
    }
}
