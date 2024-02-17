package volume;

import java.util.Scanner;

public class cube {
     public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of side");
        int s=scanner.nextInt();
       
        int vol=0;
        vol=s*s*s;
        System.out.println("the volume is :"+ vol  );

    }
}
