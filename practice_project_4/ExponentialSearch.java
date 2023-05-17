package practice_project_4;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch {

    public static int exponentialSearch(int ar[], int num) {
        if (ar[0] == num) {
            return 0;
        }
        int i = 1;
        while (i < ar.length && ar[i] <= num) {
            i = i * 2;
        }
        return Arrays.binarySearch(ar, i / 2, Math.min(i, ar.length), num);
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

        int result = ExponentialSearch.exponentialSearch(ar, num);
        if (result < 0) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at " + result);
        }

        sc.close();
    }
}
