package practice_project_4;

import java.util.Scanner;

public class MergeSort {
    void merge(int ar[], int beg, int mid, int end) {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        /* copy data to temp arrays */
        for (i = 0; i < n1; i++)
            LeftArray[i] = ar[beg + i];
        for (j = 0; j < n2; j++)
            RightArray[j] = ar[mid + 1 + j];

        i = 0;
        j = 0;
        k = beg;

        while (i < n1 && j < n2) {
            if (LeftArray[i] <= RightArray[j]) {
                ar[k] = LeftArray[i];
                i++;
            } else {
                ar[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            ar[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            ar[k] = RightArray[j];
            j++;
            k++;
        }
    }

    void mergeSort(int ar[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSort(ar, beg, mid);
            mergeSort(ar, mid + 1, end);
            merge(ar, beg, mid, end);
        }
    }

    void displayArray(int ar[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(ar[i] + " ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array");
        int size = sc.nextInt();
        int ar[] = new int[size];

        System.out.println("Input numbers in Array");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        MergeSort mergeSorting = new MergeSort();
        System.out.println("\nBefore sorting array elements are - ");
        mergeSorting.displayArray(ar, size);
        mergeSorting.mergeSort(ar, 0, size - 1);
        System.out.println("\nAfter sorting array elements are - ");
        mergeSorting.displayArray(ar, size);
        System.out.println("");

        sc.close();
    }
}
