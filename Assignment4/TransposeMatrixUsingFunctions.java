import java.util.*;

class TransposeMatrixUsingFunctions {

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

    public static int[][] transposeMatrix(int[][] matrix, int nRows, int nCols) {
        int[][] transposedMatrix = new int[nCols][nRows];
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    public static void printMatrix(int[][] matrix, int nRows, int nCols) {
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSymmetric(int[][] matrix, int nRows, int nCols) {
        if (nRows != nCols) {
            return false;
        }
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
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
        int[][] transposedMatrix = transposeMatrix(matrix, nRows, nCols);

        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix, nCols, nRows);

        if (isSymmetric(matrix, nRows, nCols)) {
            System.out.println("The original matrix is symmetric.");
        } else {
            System.out.println("The original matrix is not symmetric.");
        }
    }
}
