package series;

import java.util.Scanner;

public class sum5 {
     public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the nth term");
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++)
    {
        if(i%2!=0)
        {
            sum=sum+(int)Math.pow(1,2);
        }
        else 
        sum=sum-(int)Math.pow(i,3);
    }
    System.out.print(sum);
}
}
