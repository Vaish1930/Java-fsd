import java.util.Scanner;

public class Range {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input range");
        int l = sc.nextInt();
        int r = sc.nextInt();
        int sum = 0;

        for (int i = l; i <= r; i++) {
            sum += i;
        }

        System.out.println("Sum of Natural numbers from L to R is " + sum);
        sc.close();
    }
}
