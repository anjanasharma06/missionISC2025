package ARRAY;
/*WAP to input the monthly salary of 10 employees and find the
number of employees earning above 5000 salaries. */
import java.util.Scanner;

public class employ {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SALARY");
        int c=0;
        int arr[]=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]>5000)
            c++;
        }
        System.out.println(c);
       
    }
}
