package Pattern_Num;
/*5 4 3 2 1 
    4 3 2 1
      3 2 1
        2 1
          1  */
public class Right_Rev {
    public static void main(String[] args) {
        {
            for(int i=1;i<=5;i++)
            {
               
                for(int j=1;j<=i-1;j++)
                {
                    System.out.print("  ");
                }
                for(int k=5-i+1;k>=1;k--)
                {
                    System.out.print(k+" ");
                }
            
            System.out.println();
            }
        }
    }
}
