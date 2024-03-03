package loop;
import java.util.*;
public class perfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enterr the number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
          if( n%1==0 && n%i==0){
            sum=sum+i;
          }
        }
          if (sum==n) {
            System.out.println( "Perfect" );
          }
           else{
            System.out.println( "not a perfect no." );
           }
          
        
        }
       
    
}
