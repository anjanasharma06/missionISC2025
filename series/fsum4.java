package series;

import java.util.Scanner;
// 
public class fsum4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 'a' value");
        double a=scanner.nextInt();
        double sum=1.0,i=2.0;
        for( i=2;i<=10;i++)
        {
            if(i%2==0)
            sum=sum-((a*a)/i);
            else
            sum=sum+((a*a)/i);
        }
        System.out.print(sum);
}
}
