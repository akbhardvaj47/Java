
import java.util.*;

public class sumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number....");
        int num = scanner.nextInt();
        int sum = 0;
        int rem;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        
        System.out.println("Sum of total digits are " + sum);
    }

}
