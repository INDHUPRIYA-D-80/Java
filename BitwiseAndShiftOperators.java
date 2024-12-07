public class BitwiseAndShiftOperators {
    public static void main(String[] args) {
        // Initial values
        int a = 5; // Binary: 0101
        int b = 7; // Binary: 0111

        // Bitwise AND
        System.out.println("a & b = " + (a & b)); // 0101 & 0111 = 0101 (Decimal: 5)

        // Bitwise OR
        System.out.println("a | b = " + (a | b)); // 0101 | 0111 = 0111 (Decimal: 7)

        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b)); // 0101 ^ 0111 = 0010 (Decimal: 2)

        // Bitwise Complement
        System.out.println("~a = " + (~a)); // ~0101 = 1010 (Decimal: -6, 2's complement)

        // Left Shift Operator
        System.out.println("a << 2 = " + (a << 2)); // 0101 << 2 = 10100 (Decimal: 20)

        // Right Shift Operator
        System.out.println("a >> 2 = " + (a >> 2)); // 0101 >> 2 = 0001 (Decimal: 1)

        // Unsigned Right Shift Operator
        System.out.println("a >>> 2 = " + (a >>> 2)); // 0101 >>> 2 = 0001 (Decimal: 1)
    }
}
