
import java.util.Scanner;

public class switchCalculator {
    public static void main(String[] args) {
        // int a=10;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Select Your Choice...");
        char choice=scanner.next().charAt(0);
        System.out.println("Enter First Number...");
        float num1=scanner.nextInt();
        System.out.println("Enter Second Number...");
        float num2=scanner.nextInt();
        float res;

        switch(choice){
            case '+':
            res=num1+num2;
            System.out.println(res);
            break;
            case '-':
            res=num1-num2;
            System.out.println(res);
            break;
            case '*':
            res=num1*num2;
            System.out.println(res);
            break;
            case '/':
            res=num1/num2;
            System.out.println(res);
            break;
        }
    }
}
