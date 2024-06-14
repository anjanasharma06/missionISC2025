package BASICS;

 import java.util.*;
public class AreaCircle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of radius");
        int r=scanner.nextInt();
        int area=0;
        area=(22*r*r)/7;
        System.out.println("the area is :"+ area );

    }

}
