package Pattern_Star;
/*      *
 *     ***
 *    *****
 *   *******
 *  *********
 */
public class triangle1 {
    public static void main(String[] args) {
        int a=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=a;j++)
            {
                System.out.print("*");
            }
            a=a+2;
            System.out.println();
        }
    }
    
}
