public class LogicalOperator {
    public static void main(String[] args) {
        int value1 = 3; // value1 is initialized to 1
        int value2 = 6; // value2 is initialized to 2

        // Corrected condition: use value1 instead of value
        if ((value1 == 3) && (value2 == 6)) {
            System.out.println("value1 is 3 AND value2 is 6");
        }
        if ((value2%value2 == 0) && (value1*2 == value2)) {
            System.out.println("value2 is a multiple of value1");
        }

        if ((value1 == 3) || (value2 == 3)) {
            System.out.println("Either of the value is 3");
        }
        if ((value1%2 == 0) || (value2%2 == 0)) {
            System.out.println("One of the value is Even");
        }
    }
}


