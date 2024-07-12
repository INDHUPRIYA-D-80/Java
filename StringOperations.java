// OUTPUT:
        // The length of the txt string is: 26
        // HELLO WORLD
        // hello world
        // 7
        // John Doe
        // John Doe
        // 1020
        // We are the so-called "Vikings" from the north.
        // It's alright.
        // The character \ is called backslash.


public class StringOperations {
    public static void main(String[] args){
        //TO FIND LENGTH OF A STRING
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        //TO CONVERT TO UPPER AND LOWER CASE 
        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt1.toLowerCase());   // Outputs "hello world"
        
        //TO FIND THE LOCATION OF A PARTICULAR STRING
        String sam = "Please locate where 'locate' occurs!";
        System.out.println(sam.indexOf("locate")); // Outputs 7
        
        //TO CONCATANATE THE OUTPUT WITH +
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        //TO CONCATENATE THE OUTPUT WITH FUNCTION
        String fName = "John ";
        String lName = "Doe";
        System.out.println(fName.concat(lName));

        //CONCATENATING THE NUMBERS 
        String x = "10";
        String y = "20";
        String z = x + y;  // z will be 1020 (a String)
        System.out.println(z);

        //DISPLAYING THE SPECIAL CHARACTERS
        String t = "We are the so-called \"Vikings\" from the north.";
        System.out.println(t);
        String t1 = "It\'s alright.";
        System.out.println(t1);
        String t2 = "The character \\ is called backslash.";
        System.out.println(t2);
    } 
}
