import java.util.Scanner;

public class VerifyIdentityMatrix {
    public static int[][] inputMatrix(Scanner input, int nRows, int nCols) {
        int[][] matrix = new int[nRows][nCols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static boolean isIdentity(int[][] matrix, int nRows, int nCols) {
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                if (i == j && matrix[i][j] != 1) {
                    return false;
                } else if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows for the matrix: ");
        int nRows = input.nextInt();
        System.out.print("Enter the number of columns for the matrix: ");
        int nCols = input.nextInt();

        int[][] matrix = inputMatrix(input, nRows, nCols);

        if (isIdentity(matrix, nRows, nCols)) {
            System.out.println("The matrix is an identity");
        } else {
            System.out.println("The matrix is not an identity");
        }
    }
}
