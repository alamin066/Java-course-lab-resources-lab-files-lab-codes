import java.util.*;

public class StudentGrades {

    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Alice", 90);
        students.put("Bob", 85);
        students.put("Charlie", 92);

        System.out.println("Added students: " + students);

        students.put("Bob", 88);
        System.out.println("Updated grade for Bob: " + students.get("Bob"));

        students.remove("Bob");
        System.out.println("After removal: " + students);

        int grade = students.get("Alice");
        System.out.println("Grade of Alice: " + grade);

        System.out.println("All students: " + students);

        String highestStudent = "", lowestStudent = "";
        int highestGrade = Integer.MIN_VALUE, lowestGrade = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() > highestGrade) {
                highestGrade = entry.getValue();
                highestStudent = entry.getKey();
            }
            if (entry.getValue() < lowestGrade) {
                lowestGrade = entry.getValue();
                lowestStudent = entry.getKey();
            }
        }

        System.out.println("Highest grade: " + highestStudent + " with " + highestGrade);
        System.out.println("Lowest grade: " + lowestStudent + " with " + lowestGrade);
    }
}
