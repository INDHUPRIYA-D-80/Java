public class Pattern6 {
       // Function to demonstrate hollow diamond pattern
        public static void printHollowDiamond(int n) {
            System.out.println("Hollow Diamond Pattern:");
            int i, j;
    
            // upper part
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (j = 1; j <= 2 * i - 1; j++) {
                    if (j == 1 || j == 2 * i - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
    
            // lower part
            for (i = n - 1; i >= 1; i--) {
                for (j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (j = 1; j <= 2 * i - 1; j++) {
                    if (j == 1 || j == 2 * i - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    
        // Function to demonstrate hollow inverted pyramid pattern
        public static void printHollowInvertedPyramid(int n) {
            System.out.println("Hollow Inverted Pyramid Pattern:");
            int i, j;
    
            // upper part
            for (i = 1; i <= n; i++) {
                for (j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (j = i; j <= n; j++) {
                    if (j == i || j == n || i == 1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
    
            // lower part
            for (i = n - 1; i >= 1; i--) {
                for (j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (j = i; j <= n; j++) {
                    if (j == i || j == n || i == 1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
        }
    
        // Function to demonstrate Pascal's Triangle pattern
        public static void printPascal(int n) {
            System.out.println("Pascal's Triangle Pattern:");
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= n - i; j++) {
                    System.out.print(" ");
                }
                int x = 1;
                for (int k = 1; k <= i; k++) {
                    System.out.print(x + " ");
                    x = x * (i - k) / k;
                }
                System.out.println();
            }
        }
    
        // Function to demonstrate star pyramid pattern
        public static void printStarPyramid(int n) {
            System.out.println("Star Pyramid Pattern:");
            int i, j;
    
            // upper part
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
    
            // lower part
            for (i = n - 1; i >= 1; i--) {
                for (j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    
        // Function to demonstrate star right triangle pattern
        public static void printStarRightTriangle(int n) {
            System.out.println("Star Right Triangle Pattern:");
            int i, j;
    
            // upper part
            for (i = n; i >= 1; i--) {
                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    
            // lower part
            for (i = 2; i <= n; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    
        // Driver Function
        public static void main(String[] args) {
            int n = 6;
            printHollowDiamond(n);
            System.out.println();
            printHollowInvertedPyramid(n);
            System.out.println();
            printPascal(4);
            System.out.println();
            printStarPyramid(4);
            System.out.println();
            printStarRightTriangle(n);
        }
    
       
}
