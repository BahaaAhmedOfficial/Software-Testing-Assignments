import java.lang.reflect.Array;
import java.util.*;

/*
Write a program to take the size of an array and the array elements as input.
The program should find and print the second largest unique element in the array.
If there is no second largest element (e.g., all elements are the same), print "No second largest element."
*/

public class FindTheSecondLargestElementInAnArray {
    public static void main(String[] args) {
        int size = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        size = input.nextInt();
        double[] numbers = new double[size];

        // For loop to input the numbers
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the value of number " + (i + 1));
            numbers[i] = input.nextDouble();
        }
        if (size == 1) {
            System.out.println("No second largest element");
        }

        // Check if the arrays consists only of duplicate elements
        int flag = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                
            }
        }

        
        if (flag > 0) {
            System.out.println("No second largest element");
        } else {
            Arrays.sort(numbers);
            System.out.println(numbers[1]);
        }
    }
}
