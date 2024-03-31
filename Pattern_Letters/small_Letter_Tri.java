package Pattern_Letters;
/*    
        a 
      b c
    d e f
  g h i j
k l m n o
 */
public class small_Letter_Tri {
    public static void main(String[] args) {
        int s=97;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)s+" ");
                s++;
            }
           
            System.out.println();
        }
    }
}
