package practice_project_4;

import java.util.Scanner;

public class QuickSort {
    int partition(int ar[], int start, int end) {
        int pivot = ar[end]; // pivot element
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++) {

            if (ar[j] < pivot) {
                i++;
                int t = ar[i];
                ar[i] = ar[j];
                ar[j] = t;
            }
        }
        int t = ar[i + 1];
        ar[i + 1] = ar[end];
        ar[end] = t;
        return (i + 1);
    }

    void quick(int ar[], int start, int end) {
        if (start < end) {
            int p = partition(ar, start, end);
            quick(ar, start, p - 1);
            quick(ar, p + 1, end);
        }
    }

    void displayArray(int ar[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(ar[i] + " ");
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

        QuickSort quickSort = new QuickSort();
        System.out.println("\nBefore sorting array elements are - ");
        quickSort.displayArray(ar, size);
        quickSort.quick(ar, 0, size - 1);
        System.out.println("\nAfter sorting array elements are - ");
        quickSort.displayArray(ar, size);
        System.out.println();
        sc.close();
    }
}
