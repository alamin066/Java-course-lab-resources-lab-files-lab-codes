import java.util.ArrayList;
import java.util.Scanner;

class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();


    public void addStudent(String name, int age, char grade) {
        students.add(new Student(name, age, grade));
        System.out.println("Student added successfully.");
    }


    public void removeStudentByIndex(int index) {
        if (index >= 0 && index < students.size()) {
            students.remove(index);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }


    public void removeStudentByName(String name) {
        boolean removed = students.removeIf(student -> student.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("No student found with the name: " + name);
        }
    }


    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("Student List:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }


    public void findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        System.out.println("No student found with the name: " + name);
    }


    public void updateStudentDetails(int index, String name, int age, char grade) {
        if (index >= 0 && index < students.size()) {
            Student student = students.get(index);
            student.setName(name);
            student.setAge(age);
            student.setGrade(grade);
            System.out.println("Student details updated successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }


    public void sortStudentsByAge() {
        students.sort((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));
        System.out.println("Students sorted by age.");
    }

 
    public void checkStudentExists(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Student exists: " + student);
                return;
            }
        }
        System.out.println("No student found with the name: " + name);
    }
}
