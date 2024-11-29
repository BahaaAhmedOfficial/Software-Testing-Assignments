import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number_1, number_2, result = 0;
        char operation;

        System.out.print("Please enter the 1st number: ");
        number_1 = input.nextDouble();

        System.out.print("Please enter the 2nd number: ");
        number_2 = input.nextDouble();

        System.out.print("Please enter the operation you would like to perform: ");
        operation = input.next().charAt(0);

        input.close();

        switch (operation) {
            case '+':
                result = number_1 + number_2;
                System.out.println("The result is " + result);
                break;

            case '-':
                result = number_1 + -number_2;
                System.out.println("The result is " + result);
                break;

            case '/':
                if (number_2 == 0) {
                    System.out.print("Error, you cannot divide by zero!");
                    break;
                } else {
                    result = number_1 / number_2;
                    System.out.println("The result is " + result);
                    break;
                }

            case '*':
                result = number_1 * number_2;
                System.out.println("The result is " + result);
                break;

            case '%':
                result = number_1 % number_2;
                System.out.println("The result is " + result);
                break;

            default:
                System.out.println("The operator you chose is not valid.");
                break;
        }
    }
}
