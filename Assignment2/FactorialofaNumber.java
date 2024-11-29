import java.util.Scanner;

public class FactorialofaNumber {
    public static void main(String[] args) {

        // We init the variables
        int number = 0; // variable of type int because there is no factorial for fractions
        int factorial = 1;
        Scanner input = new Scanner(System.in);
        // Ask the user to input the number
        System.out.println("             Enter the number you want the factorial of: ");
        number = input.nextInt();

        if (number >= 0) {
            int loop = number; // Make a variable for the loop

            for (int i = 0; i < loop; i++) {
                factorial = factorial * number;
                number--;
            }
            System.out.println("The factorial is: " + factorial);

        } else
            System.out.println("There is no factorials for negative numbers");

        input.close();
    }
}
