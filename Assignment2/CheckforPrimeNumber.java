import java.util.Scanner;

public class CheckforPrimeNumber {
    public static void main(String[] args) {
        // Initialize the variable to be used
        int number = 0;
        Scanner input = new Scanner(System.in);

        // Ask the user for the number to check
        System.out.print("Enter the number: ");
        number = input.nextInt();

        if (number == 0 || number == 1) {
            System.out.println("The number is not a prime number.");
        } else {
            boolean isPrime = true; // Assume the number is prime

            /*
             * If the number could be divided without a
             * remainder for any number that is not itself or one then it is NOT a prime
             * number
             */

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) { // If divisible (no remainder), it's not prime
                    isPrime = false;
                    break;

                }
            }

            // Output the result
            if (isPrime) {
                System.out.println("The number is a prime number.");
            } else {
                System.out.println("The number is not a prime number.");
            }
        }
    }
}
