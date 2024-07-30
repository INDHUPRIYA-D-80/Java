public class Pattern4 {
        // Function to print the first pattern (Right-Angled Triangle of Stars)
        public static void printPattern1(int n) {
            System.out.println("Right-Angled Triangle of Stars:");
            int i, j;
            for (i = 0; i < n; i++) {
                for (j = n - i; j > 1; j--) {
                    System.out.print(" ");
                }
                for (j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    
        // Function to print the second pattern (Inverted Right-Angled Triangle of Numbers)
        public static void printPattern2(int n) {
            System.out.println("Inverted Right-Angled Triangle of Numbers:");
            int i, j;
            for (i = 1; i <= n; i++) {
                for (j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (j = i; j <= n; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    
        // Function to print the third pattern (Diamond Shape of Numbers)
        public static void printPattern3(int n) {
            System.out.println("Diamond Shape of Numbers:");
            int i, j;
            // Printing the upper part
            for (i = 1; i <= n; i++) {
                for (j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (j = i; j <= n; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            // Printing the lower part
            for (i = n - 1; i >= 1; i--) {
                for (j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (j = i; j <= n; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    
        // Function to print the fourth pattern (Hollow Pyramid)
        public static void printPattern4(int n) {
            System.out.println("Hollow Pyramid:");
            int i, j, k;
            for (i = 1; i <= n; i++) {
                for (j = i; j < n; j++) {
                    System.out.print(" ");
                }
                for (k = 1; k <= (2 * i - 1); k++) {
                    if (k == 1 || i == n || k == (2 * i - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    
        // Function to print the fifth pattern (Inverted Hollow Pyramid)
        public static void printPattern5(int n) {
            System.out.println("Inverted Hollow Pyramid:");
            int i, j, k;
            for (i = n; i >= 1; i--) {
                for (j = i; j < n; j++) {
                    System.out.print(" ");
                }
                for (k = 1; k <= (2 * i - 1); k++) {
                    if (k == 1 || i == n || k == (2 * i - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    
        // Driver Function
        public static void main(String args[]) {
            int n = 6;
            printPattern1(n);
            System.out.println();
            printPattern2(n);
            System.out.println();
            printPattern3(n);
            System.out.println();
            printPattern4(n);
            System.out.println();
            printPattern5(n);
        }
     
}
