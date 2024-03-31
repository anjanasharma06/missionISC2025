package series;

import java.util.*;
public class sum_ofseries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nth term");
        int n=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
        sum=sum+(int)Math.pow(2, i);
            }
            else
        {
        sum=sum+(int)Math.pow(2, i);
    }
}
System.out.println("sum of the series:"+sum);
    }
}

