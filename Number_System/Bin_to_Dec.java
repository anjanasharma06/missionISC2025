package Number_System;
/*Binary number = 10101.
 Decimal number :
⇒ 1 x 24 + 0 x 23 + 1 x 22 + 0 x 21 + 1 x 20.
⇒ 16 + 0 + 4 + 0 + 1.
⇒ 21.
 */
import java.util.*;
public class Bin_to_Dec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the binary digit:");
        int Bin=sc.nextInt();
        System.out.println("binary digit:"+ Bin);
        
        int digit=0,dec=0;
        int i=0;
            while (Bin>0)
             {
                digit=Bin%10;
                dec+=digit*(int)Math.pow(2, i);
                i++;
                Bin/=10;
            }
        
        System.out.println("decimal no.:"+dec);
    }
}
