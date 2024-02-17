package volume;

import java.util.Scanner;

public class cone {
    public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of radius and heigth");
        int r=scanner.nextInt();
        int h=scanner.nextInt();
        int vol=0;
        vol=(22*r*r*h)/(3*7);
        System.out.println("the volume is :"+ vol  );

    }
}
