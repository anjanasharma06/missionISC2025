package Java_Statement;
import java.util.*;
public class Neon {
    int n;
    Neon(){
        n=0;
    }
    void isNeon(int num)
    {
        int rem=0;
        int quo=0,sum=0,temp=num;
        int sq=num*num;
        if(num<10){    // there are only 3 neon no. (0,1,9)
        rem=sq%10;
        quo=sq/10;
        sum=rem+quo;
        }
        if(sum==temp)
        System.out.println("Neon no.");
        else
        System.out.println("Not a Neon no. ");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=sc.nextInt();
        Neon ob=new Neon();
        ob.isNeon(n);
    }
}
