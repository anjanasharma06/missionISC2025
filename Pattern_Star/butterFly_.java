package Pattern_Star;
/*

*                 * 
* *             * * 
* * *         * * * 
* * * *     * * * * 
* * * * * * * * * * 
* * * *     * * * * 
* * *         * * *
* *             * * 
*                 *
 */
public class butterFly_ {
    public static void main(String[] args) {
        int a=8,b=2;
        for(int i=1;i<=5;i++)//top
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
                for(int l=1;l<=a;l++)
                {
                    System.out.print("  ");
                }
                a=a-2;
                for(int k=1;k<=i;k++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for(int i=1;i<=4;i++)//bottom
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print("* ");
            }
                for(int l=1;l<=b;l++)
                {
                    System.out.print("  ");
                }
                b=b+2;
                for(int k=1;k<=5-i;k++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            
                                                                                                                                                                                                                                                                                                                                                        

            }
            
        }
    

