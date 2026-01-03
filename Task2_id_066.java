import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2_id_066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int c=0;

            int[] numbers = new int[size];


            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }


            System.out.print("Enter a number to divide each element: ");
            int divisor = scanner.nextInt();


            try {
                System.out.println("enter which index you want to divide");


                try {
                    int i=scanner.nextInt();
                    int result = numbers[i] / divisor;
                    System.out.println("Result of dividing element " + i + ": " + result);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Error: Array index out of bounds.");
                }
            }
            catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integer values.");
        } finally {
            scanner.close();
        }
    }
}