package RECURSION;

public class Decreasing {
    public void number(int n)
    {
        if(n==0)
        return;
        System.out.println(n);
        number(n-1);
    }
    public static void main(String[] args) {
        Decreasing ob=new Decreasing();
        ob.number(10);
    }
}
