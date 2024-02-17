package TSA;

import java.util.Scanner;

public class sphere {
     public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of radius");
        int r=scanner.nextInt();
        int TSA=0;
        TSA=(4*22*r*r)/7;
        System.out.println("the Total Surface Area is :"+ TSA);

    }
}
