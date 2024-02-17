package CSA;

import java.util.Scanner;

public class cube {
    public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of side");
        int s=scanner.nextInt();
        int CSA=0;
        CSA=4*s*s;
        System.out.println("the Curve Surface Area is :"+ CSA);

    } 
}
