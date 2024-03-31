package Java_Statement;
import java.util.*;
public class Armstrong {
    int n;
    Armstrong(){
        n=0;
    }
    void isArm(int num){
        int sum=0,temp=num;
        
        while(num!=0){
            int dig=num%10;
            sum=sum+(int)Math.pow(dig, 3);
            num=num/10;
        }
        if(sum==temp)
        System.out.println("Armstrong No.");
        else
        System.out.println("Not an Armstrong No.");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. ");
        int n=sc.nextInt();
        Armstrong ob=new Armstrong();
        ob.isArm(n);
    }
}
