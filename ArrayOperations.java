import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int min = array[0];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
            sum += array[i];
        }

        double average = (double) sum / n;

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + average);

        // Sorting the array
        java.util.Arrays.sort(array);
        System.out.println("Sorted Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }
}
