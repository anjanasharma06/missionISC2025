package Java_Statement;

import java.util.Scanner;
public class Spy_No {
   int num;
    Spy_No(){
        num=0;
    }
    void isSpy(int num){
        int prod=1,sum=0,dig=0;
        while(num!=0){
            dig=num%10;
            prod=prod*dig;
            sum=sum+dig;
            num=num/10;
        }
        if(prod==sum)
        System.out.println("It is a Spy No.");
        else
        System.out.println("It is not a Spy No.");
    } 
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no. ");
    int n=sc.nextInt();
    Spy_No ob=new Spy_No();
    ob.isSpy(n);
}
}

