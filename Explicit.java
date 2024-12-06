public class Explicit {
    
    public static void main(String[] args) {
        double a = 50.50; // Corrected: Added '='
        System.out.println("Double representation: " + a);

        float f = (float) a; // Corrected: Added '=' and proper casting
        System.out.println("Float representation: " + f);

        long b = (long) a; // Corrected: Added '=' and proper casting
        System.out.println("Long representation: " + b);

        int c = (int) b; // Corrected: Added '=' and proper casting
        System.out.println("Int representation: " + c);
    }
}

