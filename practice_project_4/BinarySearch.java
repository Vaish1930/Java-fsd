package practice_project_4;

import java.util.Scanner;

public class BinarySearch {

    public static void binarySearch(int ar[], int num, int start, int end) {
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (ar[mid] == num) {
                System.out.println("Element found at index " + mid);

                break;
            }

            else if (ar[mid] < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (start > end)
            System.out.println("Number not found");

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
