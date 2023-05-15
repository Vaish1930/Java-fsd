import java.util.Scanner;

public class Range {

    static int sum(int n) {
        int sum = (n * (n + 1)) / 2;
        return sum;
    }

    static int sumInRange(int l, int r) {
        return sum(r) - sum(l - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input range");
        int l = sc.nextInt();
        int r = sc.nextInt();

        System.out.println("Sum of Natural numbers from L to R is " + sumInRange(l, r));
        sc.close();
    }
}
