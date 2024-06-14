package WORKSHEET;

/*WAP to calculate the number of HCF of a number.
If the LCM and product of the number are given.  */

import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the LCM and PRODUCT of two no.: ");
        int LCM=sc.nextInt();
        int pro=sc.nextInt();
        int HCF=0;
        HCF=pro/LCM;
        System.out.println("HCF:"+HCF);
}
}
