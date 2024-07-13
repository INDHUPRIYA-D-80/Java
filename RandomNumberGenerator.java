import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10);
        System.out.println(n);
        while (n != 5) {
            n = rand.nextInt(11);
            System.out.println(n);
        }
    }
}
