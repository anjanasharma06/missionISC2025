package Pattern_Star;
/* 
      * 
    * * * 
  * * * * * 
* * * * * * * 
  * * * * * 
    * * * 
      *
 */
public class diamond_ {
    public static void main(String[] args) {
        int a=1;
        int b=5;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=a;j++)
            {
                System.out.print("* ");
            }
            a=a+2;
            System.out.println();
        }
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=b;j++)
            {
                System.out.print("* ");
            }
            b=b-2;
            System.out.println();
        }
    }
}
