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
        System.out.println("Enter the size of the array : ");
        size = input.nextInt();
        if (size < 3) {
            System.out.println("There is no second largest number");
            System.exit(0); // Exits the code
        }
        double numbers[] = new double[size];
        int frequency[] = new int[size];

        // For loop to input the numbers
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the value of number " + (i + 1));
            numbers[i] = input.nextDouble();
        }

        // The logic to determine if the arrays consists only of one unique element
        int visited = -1; // A flag to determine whether the elements has been visited or not
        for (int i = 0; i < size; i++) {
            int count = 1; // Count of each element is (1) by default
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    frequency[j] = visited;
                }
            }
            // If the element had been visited already, we discard the count
            if (frequency[i] != visited) {
                frequency[i] = count;
            }
            if (count == size) {
                System.out.println("There is no second largest number");
                System.exit(0); // Exits the code
            }
        }

        // Logic to get the second largest in the array
        // Sort the array
        Arrays.sort(numbers);

        // Find the second largest element
        for (int i = size - 2; i >= 0; i--) {
            if (numbers[i] != numbers[i + 1]) {
                // If the current element is not equal to the next one, it's the second largest
                System.out.println("The second largest number is " + numbers[i]);
                return;
            }
        }
        // If no second largest element is found, print a message
        System.out.println("There is no second largest number");
    }
}
