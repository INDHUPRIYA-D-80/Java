// OutPut
// John
// 15
// 5.99
// D
// true
// Hello
// John Doe
// 61
// Student name: John Doe
// Student id: 15
// Student age: 23
// Student fee: 75.25
// Student grade: B



public class Variables {
    public static void main(String[] args) {
        String name = "John";
        System.out.println(name);
        
        int myNum = 15;
        System.out.println(myNum);
        
        myNum = 5; // Reassigning value to myNum instead of redeclaring
        float myFloatNum = 5.99f;
        System.out.println(myFloatNum);
        
        char myLetter = 'D';
        System.out.println(myLetter);
        
        boolean myBool = true;
        System.out.println(myBool);
        
        String myText = "Hello";
        System.out.println(myText);
        
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);
        
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';
        
        // Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);
    }
}
