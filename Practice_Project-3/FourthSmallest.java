import java.util.Arrays;
import java.util.Scanner;

public class FourthSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        System.out.println("Input numbers in Array");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Array original");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        Arrays.sort(numbers);
        System.out.println("\nFourth Smallest Elemnt in array " + numbers[3]);
        sc.close();
    }
}
