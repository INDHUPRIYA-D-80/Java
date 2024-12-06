public class Implicit {
    public static void main(String[] args) {
        int a = 100;
        System.out.println("Int representation: " + a);

        long b = a; // Implicit widening conversion from int to long
        System.out.println("Long representation: " + b);

        float c = b; // Implicit widening conversion from long to float
        System.out.println("Float representation: " + c);
    }
}
