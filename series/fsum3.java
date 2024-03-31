package series;

import java.util.Scanner;

public class fsum3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 'a' value");
        int a=scanner.nextInt();
        double sum=1.0;
        for(int i=2;i<=10;i++)
        {
            sum=sum+(double)(a/i);
        }
    System.out.print(sum);
    }
}
