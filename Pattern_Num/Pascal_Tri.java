package Pattern_Num;
/*        1   
        1   1
      1   2   1
    1   3   3   1
  1   4   6   4   1

 */
public class Pascal_Tri {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 0; j <= n - i; j++) 
            {
                System.out.print("  ");
            }
            int c = 1;
            for (int k = 1; k <= i; k++)
             {
                System.out.print(c + "   ");
                c = c * (i- k) / k;
            }

            System.out.println();

        }

    }
    }

