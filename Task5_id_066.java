import java.util.InputMismatchException;
import java.util.Scanner;


class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class Task5_id_066 {


    public static String calculateGrade(int mark1, int mark2, int mark3) throws InvalidGradeException {

        if (mark1 < 0 || mark1 > 100 || mark2 < 0 || mark2 > 100 || mark3 < 0 || mark3 > 100) {
            throw new InvalidGradeException("Marks must be between 0 and 100.");
        }

        int average = (mark1 + mark2 + mark3) / 3;

        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter marks for subject 1: ");
            int mark1 = scanner.nextInt();
            System.out.print("Enter marks for subject 2: ");
            int mark2 = scanner.nextInt();
            System.out.print("Enter marks for subject 3: ");
            int mark3 = scanner.nextInt();

            String grade = calculateGrade(mark1, mark2, mark3);
            System.out.println("Your grade is: " + grade);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numeric values for marks.");
        } catch (InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
