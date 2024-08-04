import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
    private ArrayList<Book> books = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BookManager manager = new BookManager();
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
                    addBook();
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    deleteBook();
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
        System.out.println("\nBook Manager");
        System.out.println("1. Add Book");
        System.out.println("2. View Books");
        System.out.println("3. Delete Book");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    // Add a book to the list
    private void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        books.add(new Book(title, author));
        System.out.println("Book added successfully!");
    }

    // View all books in the list
    private void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
    }

    // Delete a book from the list
    private void deleteBook() {
        viewBooks();
        if (!books.isEmpty()) {
            System.out.print("Enter the number of the book to delete: ");
            int index = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            if (index > 0 && index <= books.size()) {
                books.remove(index - 1);
                System.out.println("Book deleted successfully!");
            } else {
                System.out.println("Invalid number. Please try again.");
            }
        }
    }
}
