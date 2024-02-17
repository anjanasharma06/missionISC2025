package volume;

import java.util.Scanner;

public class sphere {
    public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of radius ");
        int r=scanner.nextInt();
       
        int vol=0;
        vol=(22*r*r*r*4)/(3*7);
        System.out.println("the volume is :"+ vol  );

    }
}
