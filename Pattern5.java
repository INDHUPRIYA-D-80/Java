public class Pattern5 {

    // Function to demonstrate pattern 1 (Diamond Shape)
    public static void printPattern1(int n) {
        int i, j;
        // outer loop to handle upper part
        for (i = 1; i <= n; i++) {
            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print stars
            for (j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // outer loop to handle lower part
        for (i = n - 1; i >= 1; i--) {
            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print stars
            for (j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Function to demonstrate pattern 2 (Hollow Pyramid)
    public static void printPattern2(int n) {
        int i, j;

        // Printing the upper part
        for (i = 1; i <= n; i++) {
            // inner loop to print spaces
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // inner loop to print value of j
            for (j = i; j <= n; j++) {
                if (j == i || j == n || i == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            // printing new line for each row
            System.out.println();
        }

        // Printing the lower part
        for (i = n - 1; i >= 1; i--) {
            // inner loop to print spaces
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // inner loop to print value of j
            for (j = i; j <= n; j++) {
                if (j == i || j == n || i == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            // printing new line for each row
            System.out.println();
        }
    }

    // Function to print Pascal's triangle
    public static void printPascal(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                // for left spacing
                System.out.print(" ");
            }

            // used to represent x(i, k)
            int x = 1;
            for (int k = 1; k <= i; k++) {
                // The first value in a line is always 1
                System.out.print(x + " ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
    }

    // Function to demonstrate pattern 3 (Right Angle Triangle)
    public static void printPattern3(int n) {
        int i, j;

        // outer loop to handle upper part
        for (i = 1; i <= n; i++) {
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // outer loop to handle lower part
        for (i = n - 1; i >= 1; i--) {
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Function to demonstrate pattern 4 (Inverted Right Angle Triangle)
    public static void printPattern4(int n) {
        int i, j;

        // outer loop to handle rows
        for (i = n; i >= 1; i--) {
            // inner loop to handle columns
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // printing new line for each row
            System.out.println();
        }

        // outer loop to handle rows
        for (i = 2; i <= n; i++) {
            // inner loop to handle columns
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // printing new line for each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String[] args) {
        int n = 6;
        
        System.out.println("Pattern 1 (Diamond Shape):");
        printPattern1(n);
        
        System.out.println("\nPattern 2 (Hollow Pyramid):");
        printPattern2(n);
        
        System.out.println("\nPascal's Triangle:");
        printPascal(4);
        
        System.out.println("\nPattern 3 (Right Angle Triangle):");
        printPattern3(4);
        
        System.out.println("\nPattern 4 (Inverted Right Angle Triangle):");
        printPattern4(n);
    }
}
