package Pattern_Num;
/*
1   2   3   4   5   
  2   3   4   5   
    3   4   5   
      4   5
        5
      4   5   
    3   4   5
  2   3   4   5
1   2   3   4   5   
 */
public class Mirror_Num {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print("  ");
            }
            for(int j=i;j<=5;j++)
            {
                System.out.print( j+"   ");
            }
            System.out.println();
        }
        for(int k=2;k<=5;k++)
        {
            for(int j=1;j<=5-k;j++)
            {
                System.out.print("  ");
            }
            for(int l=5-k+1;l<=5;l++)
            {
                System.out.print(l+"   ");
            }
            System.out.println();
        }
    }
}
