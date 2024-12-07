public class TwoDimensionalArray {
    public static void main(String args[]) {
        // Initializing the 2D array
        int arr[][] = { 
            { 2, 7, 9 },
            { 3, 6, 1 },
            { 7, 4, 2 }
        };

        // Looping through the 2D array to print its elements
        for (int i = 0; i < 3; i++) {  // Outer loop for rows
            for (int j = 0; j < 3; j++) {  // Inner loop for columns
                System.out.print(arr[i][j] + " ");  // Printing each element
            }
            System.out.println();  // Moving to the next line after printing a row
        }
    }
}
