package WORKSHEET;

/*WAP to find the area of a triangle on a given base length and height.
 Also calculate the area for a circle on a given diameter. */

import java.util.Scanner;

public class Tri_Cir {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of breadth and height");
        int b=scanner.nextInt();
        int h=scanner.nextInt();
        System.out.println("Enter the value of diameter");
        int diameter=scanner.nextInt();
        int area1=0;
        int area2=0;
        area1=(b*h)/2;
        area2=(22*(diameter/2)*(diameter/2))/7;
        System.out.println("the area of triangle is :"+ area1 );

        System.out.println("the area of circle is :"+ area2 );

     }
}
