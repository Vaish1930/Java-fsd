import java.util.Arrays;

public class FourthSmallest {
    public static void main(String[] args) {
        int numbers[] = { 12, 3, 5, 19, 7, 78, 43, 21, 2 };
        System.out.println("Array original");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        Arrays.sort(numbers);
        System.out.println("\nFourth Smallest Elemnt in array " + numbers[3]);
    }
}
