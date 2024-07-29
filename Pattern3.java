import java.util.*;

public class Pattern3 {

    // Full Square Pattern
    public static void printFullSquarePattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Right-Angled Triangle Pattern
    public static void printRightAngledTrianglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Inverted Right-Angled Triangle Pattern
    public static void printInvertedRightAngledTrianglePattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Right-Angled Triangle Pattern with Leading Spaces
    public static void printRightAngledTriangleWithSpaces(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Inverted Right-Angled Triangle Pattern with Leading Spaces
    public static void printInvertedRightAngledTriangleWithSpaces(int n) {
        int num = 2 * n - 2;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            num = num - 2;
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[]) {
        int n = 6;
        
        System.out.println("Full Square Pattern:");
        printFullSquarePattern(n);
        System.out.println();

        System.out.println("Right-Angled Triangle Pattern:");
        printRightAngledTrianglePattern(n);
        System.out.println();

        System.out.println("Inverted Right-Angled Triangle Pattern:");
        printInvertedRightAngledTrianglePattern(n);
        System.out.println();

        System.out.println("Right-Angled Triangle Pattern with Leading Spaces:");
        printRightAngledTriangleWithSpaces(n);
        System.out.println();

        System.out.println("Inverted Right-Angled Triangle Pattern with Leading Spaces:");
        printInvertedRightAngledTriangleWithSpaces(n);
        System.out.println();
    }
}
