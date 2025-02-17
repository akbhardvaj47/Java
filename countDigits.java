
import java.util.*;

public class countDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int num = scanner.nextInt();
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count = count + 1;
        }
        System.out.println("Number of digits are "+count);
    }

}
