package RECURSION;
/*
Write a java program to find the factorial of a given number
using recursion */
public class factorial {
    public int num1(int n)
    {
        if(n==0||n==1)
        return 1;
        return n*num1(n-1) ;
        
    }

    public static void main(String[] args) {
     factorial ob=new factorial();
       int number= ob.num1(6);
        System.out.println(number);
    }
}