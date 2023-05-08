public class ArrayImplementation {
    public static void main(String[] args) {
        // Implementing array

        System.out.println("Single-Dimensional Array \n");
        int ar[] = { 12, 3, 56, 78, 32, 67, 35, 25, 67, 36 };

        for (int i = 0; i < ar.length; i++) {
            System.out.println("Element at index " + i + " is : " + ar[i]);
        }
        System.out.println();

        // Multi-Dimensional Array
        int a[][] = { { 2, 4, 8 }, { 3, 6, 9 }, { 7, 14, 21 } };
        System.out.println("Multi-Dimensional Array \n");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }

    }

}