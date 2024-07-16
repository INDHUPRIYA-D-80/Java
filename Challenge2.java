import java.util.Scanner;

public class Challenge2 {

     public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Your mark");
    int mark1= scan.nextInt();
    if(mark1>35){

        System.err.println("You have Passed");
    }
    else{
        System.out.println("Sorry!.. You have failed");
    }
    System.out.println("Enter Your Income");
    int sal= scan.nextInt();
    if(sal<7000){

        System.err.println("Hurrah!.. Your eligible for Scholarship");
    }
    else{
        System.out.println("Sorry!..You aren't eligible for scholarship");
    }
    System.out.println("Enter a num(to check it is divisible by 3 and 5 or not)");
    int num1= scan.nextInt();
    if(num1%3==0 && num1%5==0){

        System.err.println("The number is divisible by 3 and 5");
    }
    else{
        System.out.println("The number is not divisible by 3 and 5");
    }
    System.out.println("Enter a num(to check it is even or odd)");
    int n1=scan.nextInt();
    if(n1%2==0){
        System.out.println("The number is EVEN number");
    }
    else{
        System.out.println("The number is ODD number");
    }
    scan.close();
}
}
