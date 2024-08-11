// Base class
class Employee {
    String name;
    int id;

    void setDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }

    void work() {
        System.out.println("Employee is working");
    }
}

// Derived class 1 (Inherits from Employee)
class Manager extends Employee {
    String department;

    void setDepartment(String department) {
        this.department = department;
    }

    @Override
    void work() {
        System.out.println("Manager is managing the " + department + " department");
    }
}

// Derived class 2 (Inherits from Manager)
class ProjectManager extends Manager {
    String projectName;

    void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    void work() {
        System.out.println("Project Manager is overseeing the project: " + projectName);
    }
}

// Main class with the main method
public class EmployeeRolesExample {
    public static void main(String[] args) {
        // Creating an instance of ProjectManager
        ProjectManager pm = new ProjectManager();

        // Setting details
        pm.setDetails("Alice", 1001);
        pm.setDepartment("Software Development");
        pm.setProjectName("AI Research");

        // Displaying details and demonstrating method overriding
        pm.displayDetails();
        pm.work();  // Output: Project Manager is overseeing the project: AI Research
    }
}
