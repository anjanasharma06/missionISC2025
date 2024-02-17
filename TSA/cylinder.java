package TSA;

import java.util.Scanner;

public class cylinder {
      public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of radius and heigth");
        int r=scanner.nextInt();
        int h=scanner.nextInt();
        int TSA=0;
        TSA=(2*22*r*(r+h))/7;
        System.out.println("the Total Surface Area is :"+ TSA);

    }
}
