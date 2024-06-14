package RECURSION;

public class Counter {
    int sum=1;
    public int num(int n)
    {
       
        if(n==0)
        return 0;
        return sum+num(n/10);
        
    }

    public static void main(String[] args) {
        Counter ob=new Counter();
        int result=ob.num(151);
        System.out.println(result);
        
    }
}
