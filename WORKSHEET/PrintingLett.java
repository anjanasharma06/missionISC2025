package WORKSHEET;

//WAP to accept a character between a to j and print next 4 characters.

import java.util.Scanner;
public class PrintingLett {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character between a to j and print next 4 characters.: ");
        char letter=sc.next().charAt(0);
        int dig=(int) letter;
        for(int i=0;i<=4;i++)
        {
            System.out.print((char)dig+++",");    
        }
        System.out.println();
    }
}