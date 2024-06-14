package WORKSHEET;

//WAP to print the ASCII code for a given digit

import java.util.Scanner;
public class ASCII {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value : ");
        int value=sc.nextInt(); 
        System.out.println((char)value);
    }
}
