package series;

import java.util.Scanner;

public class fsum2 {
     public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the nth term");
    int n=sc.nextInt();
    double sum=0.0;
    for(int i=2;i<=n;i++)
    {
        if(i%2==0)
        sum=sum+(double)(1/(i*i));
        else
        sum=sum-(double)(1/(i*i));
    }
    System.out.print(sum);
}
}
