
package perimeter ;

 import java.util.*;
public class circle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of radius");
        int r=scanner.nextInt();
        int peri=0;
        peri=(2*22*r)/7;
        System.out.println("the perimeter is :"+ peri  );

    }

}
