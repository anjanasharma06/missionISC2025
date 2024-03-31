package Pattern_Num;
/*   1
    21
   321
  4321
 54321 */
public class Right_Tri {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
    
}
