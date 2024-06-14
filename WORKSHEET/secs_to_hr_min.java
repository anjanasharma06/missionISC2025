package WORKSHEET;

//WAP to convert the given number of seconds to Hours and Minutes.

import java.util.Scanner;

public class secs_to_hr_min {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the seconds to be converted into hours and minutes : ");
        int seconds=sc.nextInt();
        double Hr=0;
        double Min=0;
        Hr=seconds/3600;
        Min=(double)(seconds%3600)/60;
        System.out.println(Hr+" HOURS "+Min+" MINUTES");
}
}
