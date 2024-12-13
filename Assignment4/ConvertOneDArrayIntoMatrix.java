import java.util.*;

public class ConvertOneDArrayIntoMatrix {

    public static boolean validateMatrixDimensions(int[] array, int nRows, int nCols) {
        if (array.length != (nRows * nCols)) {
            System.out.println("Cannot create a matrix out of the provided elements");
            return false;
        }
        return true;
    }

    public static void convertIntoTwoD(int[] array, int nRows, int nCols) {
        if (!validateMatrixDimensions(array, nRows, nCols))
            return;

        int[][] matrix = new int[nRows][nCols];
        int index = 0;

        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                matrix[i][j] = array[index++];
            }
        }

        System.out.println("2D Matrix:");
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumOfEachRow(int[] array, int nRows, int nCols) {
        if (!validateMatrixDimensions(array, nRows, nCols))
            return;

        System.out.println("Sum of each row:");
        for (int i = 0; i < nRows; i++) {
            int sum = 0;
            for (int j = 0; j < nCols; j++) {
                sum += array[i * nCols + j];
            }
            System.out.println("Row " + (i + 1) + ": " + sum);
        }
    }

    public static void sumOfEachColumn(int[] array, int nRows, int nCols) {
        if (!validateMatrixDimensions(array, nRows, nCols))
            return;

        System.out.println("Sum of each column:");
        for (int i = 0; i < nCols; i++) {
            int sum = 0;
            for (int j = 0; j < nRows; j++) {
                sum += array[j * nCols + i];
            }
            System.out.println("Column " + (i + 1) + ": " + sum);
        }
    }

    public static void diagonalSums(int[] array, int nRows, int nCols) {
        if (!validateMatrixDimensions(array, nRows, nCols))
            return;

        if (nRows != nCols) {
            System.out.println("Diagonals can only be calculated for square matrices.");
            return;
        }

        int mainDiagonalSum = 0;
        int antiDiagonalSum = 0;

        for (int i = 0; i < nRows; i++) {
            mainDiagonalSum += array[i * nCols + i];
            antiDiagonalSum += array[i * nCols + (nCols - i - 1)];
        }

        System.out.println("Main diagonal sum: " + mainDiagonalSum);
        System.out.println("Anti-diagonal sum: " + antiDiagonalSum);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.print("Enter the number of rows: ");
        int nRows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int nCols = input.nextInt();

        convertIntoTwoD(array, nRows, nCols);
        sumOfEachRow(array, nRows, nCols);
        sumOfEachColumn(array, nRows, nCols);
        diagonalSums(array, nRows, nCols);
    }
}
