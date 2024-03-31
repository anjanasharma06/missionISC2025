package Pattern_Star;
/*  * * * * *   
    * * * *
    * * *
    * *
    *
    * *
    * * *
    * * * *
    * * * * *    */
public class K_star {
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)// ROWS
        {
            for(int j=1;j<=5-i+1;j++) //COLUMNS
            {
                System.out.print("* ");// STARS
            }
           System.out.println();
        }
        for(int k=1;k<=4;k++)       
        {
            for(int l=1;l<=k+1;l++)       // i=1,j=2 **
                                         //  i=2,j=3 ***    
            {                           //   i=3,j=4 ****     
                 System.out.print("* ");
                
            }
            System.out.println();
        }
    }
}