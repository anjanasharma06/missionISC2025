package WORKSHEET;

//WAP to convert the given number of days into years and months.

import java.util.Scanner;
public class D_to_yr_mnth{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the days to be converted into month and years: ");
        int days=sc.nextInt();
        int years=0;
        int month=0;
        years=days/365;
        month=(days%365)/30;
        System.out.println(years+" Years "+month+" months");
    }
}
