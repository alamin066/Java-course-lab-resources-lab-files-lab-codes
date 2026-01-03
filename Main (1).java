import java.sql.*;
import java.util.Scanner;

public class Main {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/javaLab";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "1234";

    public static void main(String[] args) {
        Connection connection = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            Scanner scanner = new Scanner(System.in);

            System.out.println("How many records would you like to insert?");
            int insertCount = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            String insertQuery = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement insertStmt = connection.prepareStatement(insertQuery);

            for (int i = 0; i < insertCount; i++) {
                System.out.println("Enter name for record " + (i + 1) + ":");
                String name = scanner.nextLine();
                System.out.println("Enter email for record " + (i + 1) + ":");
                String email = scanner.nextLine();

                insertStmt.setString(1, name);
                insertStmt.setString(2, email);
                insertStmt.addBatch(); // Add to batch
            }

            int[] insertRows = insertStmt.executeBatch();
            System.out.println(insertRows.length + " row(s) inserted.");


            System.out.println("How many records would you like to delete?");
            int deleteCount = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            String deleteQuery = "DELETE FROM users WHERE name = ?";
            PreparedStatement deleteStmt = connection.prepareStatement(deleteQuery);

            for (int i = 0; i < deleteCount; i++) {
                System.out.println("Enter name to delete for record " + (i + 1) + ":");
                String nameToDelete = scanner.nextLine();
                deleteStmt.setString(1, nameToDelete);
                deleteStmt.addBatch();
            }

            int[] deleteRows = deleteStmt.executeBatch();
            System.out.println(deleteRows.length + " row(s) deleted.");


            String selectQuery = "SELECT * FROM users";
            PreparedStatement selectStmt = connection.prepareStatement(selectQuery);
            ResultSet resultSet = selectStmt.executeQuery();

            System.out.println("\nCurrent records in the 'users' table:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String retrievedName = resultSet.getString("name");
                String retrievedEmail = resultSet.getString("email");
                System.out.println("ID: " + id + ", Name: " + retrievedName + ", Email: " + retrievedEmail);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error occurred.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
