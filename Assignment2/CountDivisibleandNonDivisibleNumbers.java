import java.util.Scanner;

public class CountDivisibleandNonDivisibleNumbers {
    public static void main(String[] args) {
        // We init the variables to be used

        int size, divisor, divisibleCount, nonDivisibleCount, i;
        size = divisor = divisibleCount = nonDivisibleCount = i = 0;

        Scanner input = new Scanner(System.in);

        // Ask the user for the size of the collection
        System.out.print("Enter the size of the collection: ");
        size = input.nextInt();

        // We init an array of double data type
        double[] numbers = new double[size];
        double[] divisibleNumbers = new double[size];

        // Do-While loop to input the numbers
        do {
            System.out.println("Enter the value of number " + (i + 1));
            numbers[i] = input.nextDouble();
            i++;
        } while (i < size);

        // Ask the user for the divisor
        System.out.print("Enter a divisor: ");
        divisor = input.nextInt();

        // Do-While loop checks the divisibility
        i = 0;
        do {
            if (numbers[i] % divisor == 0) {
                divisibleNumbers[divisibleCount] = numbers[i];
                divisibleCount++;
            } else
                nonDivisibleCount++;

            i++;
        } while (i < size);

        // Print statements to showcase the results
        System.out.println("The number of non-divisible numbers are " + nonDivisibleCount);
        System.out.println("The number of divisible numbers are " + divisibleCount);

        // Do-While loop to show the divisible numbers
        i = 0;
        do {
            System.out.println("The divisible numbers are " + divisibleNumbers[i]);
            i++;
        } while (i < divisibleCount);

        input.close();
    }
}
