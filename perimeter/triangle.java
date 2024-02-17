
package perimeter;

 import java.util.*;
public class triangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a,b and c");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int peri=0;
        peri=a+b+c;
        System.out.println("the perimeter is :"+ peri );

    }

}
