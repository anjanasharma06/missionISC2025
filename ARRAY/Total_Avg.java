package ARRAY;
/*WAP to store the marks of 5 subjects of a student and display
the total marks and average marks.
 */
import java.util.Scanner;

public class Total_Avg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE MArks");
        int sum=0;
        double avg=0;
        int arr[]=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
            avg=sum/arr.length;
        }
       System.out.println("total sum are:"+sum+" total avg: "+avg);
    }
}
