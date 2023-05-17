package practice_project_4;

import java.util.Scanner;

public class BubbleSort {
    static void bubbleSort(int[] ar) {
        int n = ar.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (ar[j - 1] > ar[j]) {
                    temp = ar[j - 1];
                    ar[j - 1] = ar[j];
                    ar[j] = temp;
                }

            }
        }

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

        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        bubbleSort(ar);

        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        sc.close();
    }
}
