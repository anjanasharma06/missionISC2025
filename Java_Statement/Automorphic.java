package Java_Statement;
import java.util.*;
public class Automorphic {
    int n;

        Automorphic(){
            n=0;
        }
        void isAutomorphic(long num){
         long sum=0,c=0;
        long temp=num,sq=num*num, dig=0;
        while(num!=0){
            dig=num%10;
            c++;
            num=num/10;
        }
        sum=sq % (long)Math.pow(10, c);
        if(temp==sum)
        System.out.println("Auto");
        else
        System.out.println("not");
    }

public static void main(String[] args) {
      
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no. ");
    long n=sc.nextInt();
    Automorphic ob=new Automorphic();
    ob.isAutomorphic(n);
}
}
