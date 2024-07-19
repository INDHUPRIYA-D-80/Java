import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.println("Enter 'C' to convert to Celsius or 'F' to convert to Fahrenheit: ");
        char scale = scanner.next().charAt(0);

        if (scale == 'C' || scale == 'c') {
            double celsius = (temperature - 32) * 5/9;
            System.out.println("Temperature in Celsius: " + celsius);
        } else if (scale == 'F' || scale == 'f') {
            double fahrenheit = (temperature * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else {
            System.out.println("Invalid scale entered!");
        }

        scanner.close();
    }
}
