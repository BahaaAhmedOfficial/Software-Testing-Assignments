
import java.util.Scanner;

public class AgeAndDrivingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double age = 0;
        String response = "";

        System.out.print("Enter your age: ");
        age = input.nextDouble();
        input.nextLine();

        if (age >= 18) {
            System.out.print("Do you have a valid driver's license? (Yes/No): ");
            response = input.nextLine();
            if (response.equalsIgnoreCase("Yes")) {
                System.out.print("Eligible to Drive");
            } else {
                System.out.print("Not eligible to drive.");
            }

        } else if (age < 18) {
            System.out.print("Do you have a parent's consent? (Yes/No): ");
            response = input.nextLine();
            if (response.equalsIgnoreCase("Yes")) {
                System.out.print("Eligible to Drive with Parental Consent.");
            } else {
                System.out.print("Not eligible to drive.");
            }
        }

        input.close();
    }
}
