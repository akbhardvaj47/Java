
import java.util.Scanner;

// public class sumOfArray {
//     public static void main(String[] args) {
//         double[] arr={10,20,30,40,50};
//         double sum=0;
//         for (int i=0;i<arr.length;i++){
//             sum=sum+arr[i];
//         }
//         double avg=sum/arr.length;
//         System.out.println(avg);
//     }
// }

public class sumOfArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Size of Array...");
        int n=scanner.nextInt();   //n=size of array 

        double[] arr=new double[n];  //creating an array of size n
        System.out.println("Enter Elements of array...");
        for(int i=0;i<n;i++){
        arr[i]=scanner.nextDouble();   //taking input from user of size n
        }

        double sum=0;  
        for (int j=0;j<arr.length;j++){
            sum=sum+arr[j];
        }

        double avg=(double)sum/arr.length;
        System.out.println("The average of Array : "+avg);
    }
}
