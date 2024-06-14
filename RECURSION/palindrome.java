package RECURSION;
/* Write a java program to check whether a given number is
palindrome number or not using recursion */
public class palindrome
 {

    public int palin(int n)
    {
        return palin(n, 0);
    }

    public int palin(int n,int sum)
    {
        if(n==0)
        return sum;
        
       int lastdig = n%10;
        sum=sum*10+lastdig;
        return palin(n/10,sum);   
    }

    public static void main(String[] args) {
        int n=121;
        palindrome ob=new palindrome();
        int result=ob.palin(n);

        if(result==n)
        System.out.println("PALINDROME");
        else
        System.out.println("not Palindrome");
    }
}
