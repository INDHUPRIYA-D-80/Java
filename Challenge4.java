import java.util.Scanner;

public class Challenge4 {
    void evenodd(int n){
        if(n%2==0){
            System.out.println("It is Even");        
        }
        else{
            System.out.println("It is Odd");
        }
    }
    void passfail(int m){
        if(m>=35){
            System.out.println("You have passed SucessFully");
        }
        else{
            System.out.println("Sorry!.You have failed");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check Even or Odd");
        int a=scan.nextInt();
        Challenge4 o1 = new Challenge4();
        o1.evenodd(a);
        System.out.println("Enter your mark Out of 100");
        int mark = scan.nextInt();
        o1.passfail(mark);
    }
    
}
