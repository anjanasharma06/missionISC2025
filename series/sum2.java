package series;

import java.util.Scanner;

public class sum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nth term");
        int n=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            sum=sum+ (int)Math.pow(i, 3);
            else
            sum=sum- (int)Math.pow(i, 3);
        }
        System.out.print(sum);
}
}
