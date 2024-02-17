package Basic;

import java.util.Scanner;

public class AreaRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of diagonal1 and diagonal2");
        int d1=scanner.nextInt();
        int d2=scanner.nextInt();
        int area=0;
        area=(d1*d2)/2;
        System.out.println("the area is :"+ area );

    }
}
