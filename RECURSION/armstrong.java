package RECURSION;

public class armstrong {
    public  int num(int n)
    {
        if(n==0)
        return 0;
        return 1+num(n/10);
        
    }
    public  int arm(int n,int num)
    {
        if(n==0)
        return 0;
        if(n==1)
        return 1;
      int digit = n % 10;
        return (int)Math.pow(digit, num) + arm(n / 10, num);
    } 
    public static void main(String args[])
    {
        armstrong ob=new armstrong();
        int n = 1596;
        int show=ob.num(n);
        int result=ob.arm(n, show);
        
        if (result == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
