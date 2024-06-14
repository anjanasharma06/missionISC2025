package WORKSHEET;

//WAP to convert the given number of days into weeks and months.

import java.util.Scanner;
public class D_to_week_mnth {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the days to be converted into weeks and month : ");
        int Days=sc.nextInt();
        int week=0;
        int month=0;
        int days=0;
        week=Days/7;
        days=Days%7;
        month=(days%7)/30;
        System.out.println(week+" weeks "+month+" months "+days+" days");
}
}
