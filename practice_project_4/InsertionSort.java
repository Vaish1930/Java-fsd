package practice_project_4;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array");
        int size = sc.nextInt();
        int ar[] = new int[size];

        System.out.println("Input numbers in Array");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Before Insertion Sort");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        insertionSort(ar);// sorting array using insertion sort

        System.out.println("After Insertion Sort");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
