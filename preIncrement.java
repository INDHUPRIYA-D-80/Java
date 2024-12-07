public class preIncrement {
    public static void main(String[] args) {
        int i = 3; // i is initialized to 3
        System.out.println(i);
        i++; // Post-increment: i becomes 4, but the increment is not printed here
        System.out.println(i); // Prints 4

        ++i; // Pre-increment: i becomes 5
        System.out.println(i); // Prints 5

        System.out.println(++i); // Pre-increment: i becomes 6, then 6 is printed

        System.out.println(i++); // Post-increment: i (6) is printed, then i becomes 7

        System.out.println(i); // Prints 7 (i was incremented in the previous step)
    }
}
