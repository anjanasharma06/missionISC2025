package perimeter;

import java.util.Scanner;

public class parallelo {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of length and breadth");
        int l=scanner.nextInt();
        int b=scanner.nextInt();
        int peri=0;
        peri=2*(l+b);
        System.out.println("the perimeter is :"+ peri );

    }
}
