package series;

import java.util.Scanner;

public class sum4 {
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the nth term");
    int n=sc.nextInt();
    int sum=0,a=1;
    for(int i=1;i<=n;i++)
    {
    sum=sum+(i*++a);
    }
    System.out.print(sum);
    
}
}