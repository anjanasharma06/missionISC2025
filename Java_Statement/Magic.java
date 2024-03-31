package Java_Statement;
import java.util.*;
public class Magic 
{
    int n;
    Magic(){
        n=0;
    }
    void getnum(int nn){
        n=nn;
    }
    int Sum_of_digits(int num){
        int sum=0;
        int dig=0;
        while(num!=0){
            dig=num%10;
            sum=sum+dig;
            num=num/10;
        }
        return sum;
    }
    void ismagic(){
        int num;
        int sum=Sum_of_digits( n);
        while(sum>9){
       
        num=sum;
        sum=Sum_of_digits(num);
    }
    if(sum==1)
        System.out.println("Magic");
        else
        System.out.println("not a magic");
    
}
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of n:");
       int n=sc.nextInt();
       Magic obj=new Magic();
       obj.getnum( n);
       obj.Sum_of_digits(n);
        obj. ismagic();
       
}
}
