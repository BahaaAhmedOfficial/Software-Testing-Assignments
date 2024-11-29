import java.util.Scanner;


public class SummationofNumbersinaCollection {
    public static void main(String[] args) {
        // We init the vairables to be used
        int size = 0;
        double sum = 0; // The user might input a double or a float
        Scanner input = new Scanner(System.in);

        // Ask the user for the size of the collection
        System.out.print("Enter the size of the collection: ");
        size = input.nextInt();

        // We init an array of double data type
        double[] numbers = new double[size];

        // Do-While loop to input the numbers
        int i = 0;
        do {
            System.out.println("Enter the value of number " + (i + 1));
            numbers[i] = input.nextDouble();
            i++;
        } while (i < size);

        // Do-While loop to calc the sum
        i = 0;
        do {
            sum += numbers[i];
            i++;
        } while (i < size);

        System.out.println("The sum of the numbers is: " + sum);
        input.close();
    }
}
