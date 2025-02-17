import java.util.*;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Value..");
        int input=scanner.nextInt();
        System.out.println("Enter Power..");
        int pow=scanner.nextInt();

        int res=1;
        for(int i=pow;i>=1;i--){
            res=res*input;
        }
        System.out.println("Result : "+res);
    }
}
