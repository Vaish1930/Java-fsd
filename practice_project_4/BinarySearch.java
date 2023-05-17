package practice_project_4;

import java.util.Scanner;

public class BinarySearch {

    public static void binarySearch(int ar[], int num, int start, int end) {

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

        BinarySearch.binarySearch(ar, num, 0, size - 1);

        sc.close();
    }

}
