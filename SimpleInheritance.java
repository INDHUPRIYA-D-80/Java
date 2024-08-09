public class SimpleInheritance {
    // Base class (Single Inheritance)
    static class Person {
        String name;

        void setName(String name) {
            this.name = name;
        }

        void getName() {
            System.out.println("Name: " + name);
        }
    }

    // Derived class (Single Inheritance)
    static class Student extends Person {
        int studentId;

        void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        void getStudentId() {
            System.out.println("Student ID: " + studentId);
        }
    }

    // Another base class (Hierarchical Inheritance)
    static class Teacher extends Person {
        String subject;

        void setSubject(String subject) {
            this.subject = subject;
        }

        void getSubject() {
            System.out.println("Subject: " + subject);
        }
    }

    // Derived class (Hierarchical Inheritance)
    static class TeachingAssistant extends Teacher {
        String assignedClass;

        void setAssignedClass(String assignedClass) {
            this.assignedClass = assignedClass;
        }

        void getAssignedClass() {
            System.out.println("Assigned Class: " + assignedClass);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Single Inheritance example
        Student student = new Student();
        student.setName("John");
        student.setStudentId(101);
        student.getName();        // Output: Name: John
        student.getStudentId();   // Output: Student ID: 101

        // Hierarchical Inheritance example
        Teacher teacher = new Teacher();
        teacher.setName("Mr. Smith");
        teacher.setSubject("Mathematics");
        teacher.getName();        // Output: Name: Mr. Smith
        teacher.getSubject();     // Output: Subject: Mathematics

        TeachingAssistant ta = new TeachingAssistant();
        ta.setName("Alice");
        ta.setSubject("Computer Science");
        ta.setAssignedClass("CS101");
        ta.getName();             // Output: Name: Alice
        ta.getSubject();          // Output: Subject: Computer Science
        ta.getAssignedClass();    // Output: Assigned Class: CS101
    }
}
