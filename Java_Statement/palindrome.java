package Java_Statement;
import java. util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        int n=num,rem,sum=0;
        while (num>0)
        {
            rem=num%10;
            sum=(sum*10)+rem;
            num/=10;
        }
        if (n==sum)
            System.out.println("It is a palindrome  number");
        else
            System.out.println("It is not a palindrome number");
    }
}
