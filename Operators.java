public class Operators {
    public static void main(String[] args) {
            // Arithmetic Operators
            int a = 10, b = 5;
            System.out.println("a + b = " + (a + b)); // Addition
            System.out.println("a - b = " + (a - b)); // Subtraction
            System.out.println("a * b = " + (a * b)); // Multiplication
            System.out.println("a / b = " + (a / b)); // Division
            System.out.println("a % b = " + (a % b)); // Modulus
    
            // Relational Operators
            System.out.println("a == b: " + (a == b)); // Equal to
            System.out.println("a != b: " + (a != b)); // Not equal to
            System.out.println("a > b: " + (a > b));   // Greater than
            System.out.println("a < b: " + (a < b));   // Less than
            System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
            System.out.println("a <= b: " + (a <= b)); // Less than or equal to
    
            // Logical Operators
            boolean x = true, y = false;
            System.out.println("x && y: " + (x && y)); // Logical AND
            System.out.println("x || y: " + (x || y)); // Logical OR
            System.out.println("!x: " + (!x));         // Logical NOT
    
            // Bitwise Operators
            int c = 6, d = 2;
            System.out.println("c & d: " + (c & d));  // Bitwise AND
            System.out.println("c | d: " + (c | d));  // Bitwise OR
            System.out.println("c ^ d: " + (c ^ d));  // Bitwise XOR
            System.out.println("~c: " + (~c));        // Bitwise NOT
            System.out.println("c << 1: " + (c << 1)); // Left shift
            System.out.println("c >> 1: " + (c >> 1)); // Right shift
    
            // Assignment Operators
            int e = 10;
            e += 5;  // e = e + 5
            System.out.println("e += 5: " + e);
            e -= 3;  // e = e - 3
            System.out.println("e -= 3: " + e);
            e *= 2;  // e = e * 2
            System.out.println("e *= 2: " + e);
            e /= 4;  // e = e / 4
            System.out.println("e /= 4: " + e);
            e %= 3;  // e = e % 3
            System.out.println("e %= 3: " + e);
    
            // Unary Operators
            int f = +5; // Unary plus
            System.out.println("f = +5: " + f);
            f = -f;    // Unary minus
            System.out.println("f = -f: " + f);
            f++;       // Increment
            System.out.println("f++: " + f);
            f--;       // Decrement
            System.out.println("f--: " + f);
        }   
    
}
