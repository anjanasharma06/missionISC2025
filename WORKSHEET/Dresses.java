package WORKSHEET;

/*WAP to calculate the numbers of dresses one can make from a given length of cloth.
 If each dress takes 5 meters of cloth. */

import java.util.Scanner;
public class Dresses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the meters of clothes : ");
        int meters=sc.nextInt();
        int Dresses=0;
        Dresses=meters/5;
        System.out.println("NO. OF DRESSES:"+Dresses);
    }
}
