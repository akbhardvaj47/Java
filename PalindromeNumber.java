import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number....");
        int num = scanner.nextInt();
        int rev = 0;
        int temp=num;
        int rem;
        while (temp > 0) {
            rem = temp % 10;
            rev=rev*10+rem;
            temp = temp / 10;
        }
        System.out.println("You Entered Number  " + rev);
        if(num==rev){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");

        }
    }

}

