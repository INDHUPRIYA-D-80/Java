import java.util.Scanner;
public class Challenge3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a,b;
        System.out.println("Enter to two numbers(Range to Print):");
        a = scan.nextInt(); 
        b = scan.nextInt(); 
        System.out.println("The Output is");
        for(int i =a;i<=b;i++){// Print the range of numbers
            System.out.println(i);
        }
        System.out.println("Even numbers from 1 to 10 is...");
        for(int j=1;j<=10;j++){
            if(j%2==0){
                System.out.println(j);
            }
        }
        System.out.println("No of odd numbers from 1 to 10 ");
        int count =0;
        for(int i=1;i<=10;i++){
            if( i%2 !=0){
                count =count+1;
            }
        }
        System.out.println(count);
    }
    
}
