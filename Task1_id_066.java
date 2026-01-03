import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_id_066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();


            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);


            int result;
            int div;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    div = num1 / num2;
                    System.out.println("Result: " + div);
                    break;
                default:
                    System.out.println("Invalid operator!");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integer values.");
        }  finally {
            scanner.close();
            System.out.println("task done.....");
        }
    }
}