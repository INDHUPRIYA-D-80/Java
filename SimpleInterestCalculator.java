import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.println("Enter time in years: ");
        int time = scanner.nextInt();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();
    }
}
