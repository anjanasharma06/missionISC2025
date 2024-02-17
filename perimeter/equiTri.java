package perimeter;

import java.util.Scanner;

public class equiTri {
public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of sides");
        int s=scanner.nextInt();
        int peri=0;
        peri=3*s;
        System.out.println("the perimeter is :"+ peri  );

    }
}
