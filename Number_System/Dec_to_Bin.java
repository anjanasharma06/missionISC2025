package Number_System;
/* the decimal number 2 in binary is 10. */
public class Dec_to_Bin {
    public static void main(String[] args) {
        int sum=0;
        int n=100;
        int rem=0;
        int i=1;
        
        while(n!=0)
        {
        rem=n%2;
        sum+=rem*i;
        i*=10;
        n=n/2;
    }
    System.out.println("The decimal to binary is: "+sum);
    }
}