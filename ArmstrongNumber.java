import java.util.*;
public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number....");
        int num = scanner.nextInt();
        int sum = 0;
        int temp=num;
        int rem;
        while (temp > 0) {
            rem = temp % 10;
            // sum=sum*10+rem;
            sum=sum+rem*rem*rem;
            temp = temp / 10;
        }
        System.out.println("You Entered Number  " + num);
        if(num==sum){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");

        }
    }

}


