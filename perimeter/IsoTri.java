package perimeter;

import java.util.Scanner;

public class IsoTri {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of sides and hypotenus");
        int s=scanner.nextInt();
        int h=scanner.nextInt();
        int peri=0;
        peri=(2*s)+h;
        System.out.println("the perimeter is :"+ peri );

    }
}
