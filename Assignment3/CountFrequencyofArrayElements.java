/*
Write a program to take the size of an array and the array elements as
input. The program should calculate the frequency of each unique
element in the array and display each element along with its frequency.
*/

import java.util.Scanner;

public class CountFrequencyofArrayElements {
    public static void main(String[] args) {
        int size = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        size = input.nextInt();
        double numbers[] = new double[size];
        int frequency[] = new int[size];
        // For loop to input the numbers
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the value of number " + (i + 1));
            numbers[i] = input.nextDouble();
        }

        // The logic to determine the frequency
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
        }

        // For loop to print out the elements and their frequency
        System.out.println("Element | frequency");
        for (int i = 0; i < size; i++) {
            if (frequency[i] != visited) {
                System.out.println(numbers[i] + "     | " + frequency[i]);
            }
        }

        input.close();
    }
}
