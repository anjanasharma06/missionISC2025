package volume;

import java.util.Scanner;

public class prism {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of (area of base) and heigth ");
        int b=scanner.nextInt();
        int h=scanner.nextInt();
        int vol=0;
        vol=(b*h);
        System.out.println("the area is :"+ vol );

    }
}
