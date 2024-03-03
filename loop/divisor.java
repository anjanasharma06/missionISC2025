package loop;

import java.util.Scanner;
       
public class divisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enterr the number");
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
          if( n%1==0 && n%i==0){
            
            System.out.println("Divisor:" +i);
            c++;
          }
        
        }
        System.out.println(c);
    }
}
