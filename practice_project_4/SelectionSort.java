package practice_project_4;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
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
        System.out.println("Before Selection Sort");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        selectionSort(ar);

        System.out.println("After Selection Sort");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
