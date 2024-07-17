import java.util.Scanner;

// Base class for demonstrating inheritance
class Animal {
    String name;

    // Default constructor
    Animal() {
        this.name = "Unnamed";
    }

    // Parameterized constructor
    Animal(String name) {
        this.name = name;
    }

    // Method to display animal sound
    void makeSound() {
        System.out.println("Animal sound");
    }
}

// Single inheritance: Dog class extends Animal class
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    // Overridden method
    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

// Multilevel inheritance: Puppy class extends Dog class
class Puppy extends Dog {
    Puppy(String name) {
        super(name);
    }

    void puppyBehavior() {
        System.out.println(name + " is a cute puppy.");
    }
}

// Hierarchical inheritance: Cat class also extends Animal class
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Meow Meow");
    }
}

// Hybrid inheritance is demonstrated through interfaces
interface Pet {
    void showAffection();
}

class PetDog extends Dog implements Pet {
    PetDog(String name) {
        super(name);
    }

    @Override
    public void showAffection() {
        System.out.println(name + " is showing affection.");
    }
}

// Main class
public class JavaConceptsDemo {

    // Method overloading
    void display(int number) {
        System.out.println("Integer: " + number);
    }

    void display(String text) {
        System.out.println("String: " + text);
    }

    // Method with parameter and return keyword
    int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String and int declaration, input from user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // If-else statement
        if (age < 18) {
            System.out.println("You are a minor.");
        } else {
            System.out.println("You are an adult.");
        }

        // Ternary operator
        String ageGroup = (age < 18) ? "Minor" : "Adult";
        System.out.println("Age group: " + ageGroup);

        // For loop
        System.out.println("For loop demonstration:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }

        // While loop
        System.out.println("While loop demonstration:");
        int j = 0;
        while (j < 5) {
            System.out.println("j: " + j);
            j++;
        }

        // Do-while loop
        System.out.println("Do-while loop demonstration:");
        int k = 0;
        do {
            System.out.println("k: " + k);
            k++;
        } while (k < 5);

        // Creating objects and demonstrating method overloading
        JavaConceptsDemo demo = new JavaConceptsDemo();
        demo.display(10);
        demo.display("Hello");

        // Function with parameter and return keyword
        int sum = demo.addNumbers(5, 10);
        System.out.println("Sum: " + sum);

        // Creating objects and demonstrating inheritance
        Dog dog = new Dog("Buddy");
        dog.makeSound();

        Puppy puppy = new Puppy("Tiny");
        puppy.makeSound();
        puppy.puppyBehavior();

        Cat cat = new Cat("Whiskers");
        cat.makeSound();

        PetDog petDog = new PetDog("Max");
        petDog.showAffection();

        // For-each loop
        String[] names = { "Alice", "Bob", "Charlie" };
        System.out.println("For-each loop demonstration:");
        for (String n : names) {
            System.out.println("Name: " + n);
        }

        scanner.close();
    }
}
