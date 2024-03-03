
package loop;
// Sum of the odd digits and even digits
import java.util.*;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int odd_sum = 0;
        int even_sum = 0;
        while (num != 0) {
            int digits = num % 10;
            if (digits % 2 == 0) {
                even_sum += digits;
            } else {
                odd_sum += digits;
            }

            num = num / 10;

        }
        System.out.println("Sum of odd digit:" + odd_sum);
        System.out.println("Sum of even digit:" + even_sum);

    }
}
