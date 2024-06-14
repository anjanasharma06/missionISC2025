package Java_Statement;

import java.util.Scanner;

public class Smith {


    public int inputs()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VALUE");
        int n=sc.nextInt();
        return n;
    }


    public int isPrime(int num)
    {
        for (int i = 2; i < num; i++) {
            if(num%i==0)
            return 0;
        }
        return 1;
    }


    public int sod(int n)
    {
        int sum=0;
        while (n>0) {
            int dig=n%10;
            sum=sum+dig;
            n=n/10; 
        }
        return sum;
    }


    public int sodPrime(int n)
    {
        int sum1=0;
        for (int i = 2; i <=n; i++) {
            while (n%i==0) {
                sum1=sum1+sod(i);   //factors of n and their sum also
                n=n/i;
            } 
        }
        return sum1;    
    }


    public void Check(int n)
    {
        if(sod(n)==sodPrime(n))
        System.out.println("Smith Number");
        else 
        System.out.println("NOT a smith");
    }
    public static void main(String[] args) {
        Smith ob=new Smith();
        int n=ob.inputs();
        int result=ob.sodPrime(n);
        int resu=ob.sod(n);
        System.out.println(result);
        System.out.println(resu);
        ob.Check(n);
    }
}
