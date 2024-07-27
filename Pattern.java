import java.util.*;

public class Pattern {

    // Function to print the first pattern
    public static void printBoxPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Function to print the second pattern
    public static void printNumberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Function to print the third pattern
    public static void printIncrementalNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Function to print the fourth pattern
    public static void printDecrementalNumbers(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Driver function
    public static void main(String args[]) {
        int n = 6;
        System.out.println("Box Pattern:");
        printBoxPattern(n);

        System.out.println("\nNumber Pyramid Pattern:");
        printNumberPyramid(n);

        System.out.println("\nIncremental Numbers Pattern:");
        printIncrementalNumbers(n);

        System.out.println("\nDecremental Numbers Pattern:");
        printDecrementalNumbers(n);
    }
}
