import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Limits....");
        int limit=scanner.nextInt();
        System.out.println("You Entered :" +limit);

        int a=0,b=1,c;
        for(int i=0;i<=limit;i++){
            if(i==0 || i==1)
                System.out.print(" "+i);
            
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
        }
    }
}
