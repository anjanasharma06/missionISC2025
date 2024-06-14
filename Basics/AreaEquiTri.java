package BASICS;

import java.util.Scanner;

public class AreaEquiTri {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of side");
        int s=scanner.nextInt();
        double area=0.0;
        area=(1.732*s*s)/4;
        System.out.println("the area is :"+ area );

    }
}
