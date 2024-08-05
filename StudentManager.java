import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.run();
    }

    // Run the application
    public void run() {
        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Print menu options
    private void printMenu() {
        System.out.println("\nStudent Manager");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Delete Student");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    // Add a student to the list
    private void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        students.add(new Student(name, rollNumber));
        System.out.println("Student added successfully!");
    }

    // View all students in the list
    private void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (int i = 0; i < students.size(); i++) {
                System.out.println((i + 1) + ". " + students.get(i));
            }
        }
    }

    // Delete a student from the list
    private void deleteStudent() {
        viewStudents();
        if (!students.isEmpty()) {
            System.out.print("Enter the number of the student to delete: ");
            int index = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            if (index > 0 && index <= students.size()) {
                students.remove(index - 1);
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("Invalid number. Please try again.");
            }
        }
    }
}
