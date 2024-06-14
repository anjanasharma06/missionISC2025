package RECURSION;

public class Increasing {
    public void number(int n)
    {
        if(n==11)
        return;
        System.out.println(n);
        number(n+1);
    }
    public static void main(String[] args) {
        Increasing ob=new Increasing();
        ob.number(1);
    }
}
