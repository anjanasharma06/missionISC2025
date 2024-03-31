package Pattern_Num;
/*   
        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1 
 */
public class Num_Tri {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
                for(int l=i-1;l>=1;l--)
                {
                    System.out.print(l+" ");
                }
                System.out.println();
        }
            
            }
        }

    

