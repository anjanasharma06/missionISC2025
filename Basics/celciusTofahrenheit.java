package BASICS;

 import java.util.*;
public class celciusTofahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value to convert celcius to fahrenheit");
        int val=scanner.nextInt();
        int con=0;
        con=((val*9/5)+32);
        System.out.println("the value is :"+ " "+con+"°F");//FOR DEGREE sign alt+0176

    }

}
