package TSA;

import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of length,breadth and heigth");
        int l=scanner.nextInt();
        int b=scanner.nextInt();
        int h=scanner.nextInt();
        int TSA=0;
        TSA=2*(l*b+b*h+h*l);
        System.out.println("the Total Surface Area is :"+ TSA);

    }
}
