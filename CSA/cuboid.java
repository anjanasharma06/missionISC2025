package CSA;

import java.util.Scanner;

public class cuboid {
     public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of length,breadth and heigth");
        int l=scanner.nextInt();
        int b=scanner.nextInt();
        int h=scanner.nextInt();
        int CSA=0;
        CSA=2*h*(l+b);
        System.out.println("the Curve Surface Area is :"+ CSA);

    }
}
