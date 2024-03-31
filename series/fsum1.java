package series;

import java.util.Scanner;

public class fsum1 {
     public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the nth term");
    int n=sc.nextInt();
    double sum=0.0;
    for(int i=1;i<=n;i++)
    {
        if((i*2)%4!=0)
        sum =sum+(double)(1/(i*2));
        else
        sum=sum-(1/(i*2));
    }
    System.out.println(sum);
}
}
