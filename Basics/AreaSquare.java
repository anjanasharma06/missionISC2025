package BASICS;

import java.util.Scanner;

public class AreaSquare {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of side");
        int s=scanner.nextInt();
        int area=0;
        area=s*s;
        System.out.println("the area is :"+ area );

    }
}
