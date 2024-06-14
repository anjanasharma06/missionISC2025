package BASICS;

import java.util.Scanner;

public class AreaParall {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of breadth and height");
        int b=scanner.nextInt();
        int h=scanner.nextInt();
        int area=0;
        area=(b*h);
        System.out.println("the area is :"+ area );

    }
}
