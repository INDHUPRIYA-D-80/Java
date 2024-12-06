public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        // String initialization
        String str = "test";
        System.out.println("String is: " + str);

        String str1 = new String("test");
        System.out.println("Another string: " + str1);

        // Array initialization and access
        int arr[] = new int[3]; // Allocate enough space for 3 elements
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
         
        // Display array contents
        System.out.println("Array contents:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println("Array Address:"+arr); 
    }
}
