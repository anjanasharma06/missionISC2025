package RECURSION;
/*
Write a java program to find the product of a given number
using recursion
   */

public class product {
    public int prod(int n)
    {
        if(n==0)
        return 0;
        if(n<10)
        return n;
        return (n%10)*prod(n/10);
        
    }

    public static void main(String[] args) {
        product ob=new product();
        int result=ob.prod(151);
        System.out.println(result);
        
    }
}
