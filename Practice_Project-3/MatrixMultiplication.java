// Matrix Multiplication
public class MatrixMultiplication {

    public static void main(String args[]) {
        int a[][] = { { 1, 7, 8 }, { 2, 6, 8 }, { 3, 3, 3 } };
        int b[][] = { { 11, 10, 1 }, { 21, 24, 2 }, { 36, 3, 32 } };

        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
