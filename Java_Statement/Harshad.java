package Java_Statement;
import java.util.*;
public class Harshad {
    int n;
    Harshad(){
        n=0;
    }
    void check(int num){
        int sum=0;
        int dig=0;
        while(num!=0){
            dig=num%10;
            sum=sum+dig;
            num=num/10;
        }
        if(num%sum==0)
        System.out.println("Harshad no.");
        else
        System.out.println("not a Harshad no.");

    }
   
    
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the no:");
        int n=sc.nextInt();
        Harshad ob=new Harshad();
        ob.check(n);
    }
}
