import java.util.Scanner;

public class RotateRight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Input numbers in Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
        for (int l = 0; l < arr.length; l++) {
            System.out.print(arr[l] + " ");
        }

        for (int l = 0; l < 5; l++) {
            int j, last;
            last = arr[arr.length - 1];

            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }

        System.out.println();

        System.out.println("Array after right rotation: ");
        for (int l = 0; l < arr.length; l++) {
            System.out.print(arr[l] + " ");
        }
        sc.close();
    }

}
