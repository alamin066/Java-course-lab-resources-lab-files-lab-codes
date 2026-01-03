import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 9) {
            System.out.println("Student Management System");
            System.out.println("1. Add a Student");
            System.out.println("2. Remove a Student by Index");
            System.out.println("3. Remove a Student by Name");
            System.out.println("4. Display All Students");
            System.out.println("5. Find Student by Name");
            System.out.println("6. Update Student Details");
            System.out.println("7. Sort Students by Age");
            System.out.println("8. Check if a Student Exists");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                System.out.print("Enter grade (A/B/C): ");
                char grade = scanner.next().charAt(0);
                sms.addStudent(name, age, grade);
            } else if (choice == 2) {
                System.out.print("Enter index to remove: ");
                int index = scanner.nextInt();
                sms.removeStudentByIndex(index);
            } else if (choice == 3) {
                System.out.print("Enter name to remove: ");
                String name = scanner.nextLine();
                sms.removeStudentByName(name);
            } else if (choice == 4) {
                sms.displayAllStudents();
            } else if (choice == 5) {
                System.out.print("Enter name to find: ");
                String name = scanner.nextLine();
                sms.findStudentByName(name);
            } else if (choice == 6) {
                System.out.print("Enter index to update: ");
                int index = scanner.nextInt();
                scanner.nextLine(); // Consume the newline
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new age: ");
                int age = scanner.nextInt();
                System.out.print("Enter new grade (A/B/C): ");
                char grade = scanner.next().charAt(0);
                sms.updateStudentDetails(index, name, age, grade);
            } else if (choice == 7) {
                sms.sortStudentsByAge();
            } else if (choice == 8) {
                System.out.print("Enter name to check: ");
                String name = scanner.nextLine();
                sms.checkStudentExists(name);
            } else if (choice == 9) {
                System.out.println("Exiting... Goodbye!");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
