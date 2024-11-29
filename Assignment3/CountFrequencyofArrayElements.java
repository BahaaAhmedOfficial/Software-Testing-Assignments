/*
Write a program to take the size of an array and the array elements as
input. The program should calculate the frequency of each unique
element in the array and display each element along with its frequency.
*/

import java.util.Scanner;
import java.util.HashMap;

public class CountFrequencyofArrayElements {
    public static void main(String[] args) {

        int size = 0, count = 0, uniqueCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        size = input.nextInt();
        double[] numbers = new double[size];
        double[] uniqueNumbers = new double[size];

        // For loop to input the numbers
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the value of number " + (i + 1));
            numbers[i] = input.nextDouble();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (numbers[i] != uniqueNumbers[j]) {
                    uniqueCount++;
                }
            }
        }

        System.out.println(uniqueCount);

        // for (int i = 0; i < size; i++) {
        //     for (int j = 0; j < size; j++) {
        //         if (numbers[i] == numbers[j]) {
        //             count++;
        //         }
        //     }
        //     System.out.println("The number " + numbers[i] + " is present in the array " + count + " time(s)");
        //     count = 0;
        // }

        // HashMap<Double, Integer> frequencies = new HashMap<>();

    }
}
