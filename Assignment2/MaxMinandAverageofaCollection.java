import java.util.Scanner;

public class MaxMinandAverageofaCollection {
    public static void main(String[] args) {
        // We init the vairables to be used
        int size = 0;
        Scanner input = new Scanner(System.in);

        // Ask the user for the size of the collection
        System.out.print("Enter the size of the collection: ");
        size = input.nextInt();

        // We init an array of double data type
        double[] numbers = new double[size];

        // For loop to input the numbers
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the value of number " + (i + 1));
            numbers[i] = input.nextDouble();
        }

        // For loop to get the max
        double max = numbers[0];
        for (int i = 0; i < size; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("The maximum is: " + max);

        // For loop to get the min
        double min = numbers[0];
        for (int i = 0; i < size; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("The minimum is: " + min);

        // For loop to get the sum
        double sum = 0;
        for (int i = 0; i > size; i++) {
            sum += numbers[i];
        }
        System.out.println("The average is: " + sum / size);
    }
}