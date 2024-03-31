package series;

import java.util.Scanner;

public class sum3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nth term");
        int n=scanner.nextInt();
        System.out.println("Enter the 'a' value");
        int a=scanner.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum=sum+(int)Math.pow(a, i);
        }
        System.out.print("sum"+sum);
    }
}
