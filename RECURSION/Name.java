package RECURSION;

/*Write a java program to print “Your Name” 10 time using
recursion. */

public class Name {
    public void names(int n)
    {
        if(n==0)
        return;
        System.out.println("NARUTO   KAKASHI   SASUKE  SAKURA");
        names(n-1);
    }
    public static void main(String[] args) {
        Name ob=new Name();
        ob.names(102);
    }
}
