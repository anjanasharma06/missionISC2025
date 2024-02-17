package volume;

import java.util.Scanner;

public class cuboid {
     public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of length, breadth and heigth");
        int l=scanner.nextInt();
        int b=scanner.nextInt();
        int h=scanner.nextInt();
        int vol=0;
        vol=l*b*h;
        System.out.println("the volume is :"+ vol  );

    }
}
