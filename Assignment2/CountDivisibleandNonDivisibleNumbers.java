import java.util.Scanner;

public class CountDivisibleandNonDivisibleNumbers {
    public static void main(String[] args) {
        // We init the vairables to be used

        int size, divisor, divisibleCount, nonDivisbleCount, i;
        size = divisor = divisibleCount = nonDivisbleCount = i = 0;

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

        // Do-While loop checks the divisiblity
        i = 0;
        do {
            if (numbers[i] % divisor == 0) {
                divisibleNumbers[divisibleCount] = numbers[i];
                divisibleCount++;
            } else
                nonDivisbleCount++;

            i++;
        } while (i < size);

        // Print statments to showcase the results
        System.out.println("The number of non-divisble numbers are " + nonDivisbleCount);
        System.out.println("The number of divisble numbers are " + divisibleCount);

        // Do-While loop to show the divisible numbers
        i = 0;
        do {
            System.out.println("The divisble numbers are " + divisibleNumbers[i]);
            i++;
        } while (i < divisibleCount);
    }
}
