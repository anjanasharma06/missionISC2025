package WORKSHEET;
// WAP to print the square and cube of a given number.

import java.util.Scanner;

public class Sq_Cube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value to be square and cube: ");
        int value=sc.nextInt();
        int square=0;
        int cube=0;
        square=(int)Math.pow(value,2);
        cube=(int)Math.pow(value,3);
        System.out.println("the square:"+square);
        System.out.println("the cube:"+cube);
    }
    
}
