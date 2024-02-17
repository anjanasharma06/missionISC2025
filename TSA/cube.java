package TSA;

import java.util.Scanner;

public class cube {
    public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of side");
        int s=scanner.nextInt();
        int TSA=0;
        TSA=6*s*s;
        System.out.println("the Total Surface Area is :"+ TSA);

    }
}
