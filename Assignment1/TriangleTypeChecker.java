import java.util.Scanner;

public class TriangleTypeChecker {
    public static void main(String[] args) {
        double side1, side2, side3 = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the 1st side: ");
        side1 = input.nextDouble();

        System.out.print("Enter the length of the 2st side: ");
        side2 = input.nextDouble();

        System.out.print("Enter the length of the 3st side: ");
        side3 = input.nextDouble();

        // First we check if the sides for a triangle or not
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            // Checking if all sides are equal
            if (side1 == side2 && side2 == side3) {
                System.out.print("The triangle is Equilateral");
            }
            // Checking if two sides are equal
            else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.print("The triangle is Isosceles");
            }
            // If it is not Equilateral or Isosceles then it is Scalene
            else
                System.out.print("The triangle is Scalene");
        }

        // The sides do not meet the requirements
        else
            System.out.print("The sides do not form a triangle");

        input.close();
    }
}
