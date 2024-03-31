package Pattern_Star;
/*      * * * * * * * 
          * * * * *
            * * *
              *
            * * *
          * * * * *
        * * * * * * *    */
public class Sand_Glass {
    public static void main(String[] args) {
        int a=7;
        
        for(int i=1;i<=4;i++)// OUTER LOOP FOR ROWS
        {
            for(int j=1;j<=i-1;j++)//INNER LOOP FOR COLUMNS
            {
                System.out.print("  ");//PRINTING THE SPACES
            }
            for(int j=1;j<=a;j++) //LOOP FOR PUTTING THE NO. OF STARS
            {
                System.out.print("* ");
                
            }                               
            a=a-2;// SUBTRACTING THE STARS 
            System.out.println();         
        }
        int b=3;//BASE
        for(int l=1;l<=3;l++) // ROWS
        {
            for(int n=1;n<=3-l;n++)
            {
                System.out.print("  ");// PRINTING SPACES
            }
            for(int m=1;m<=b;m++)
            {
                System.out.print("* ");//STARS
            }
            b=b+2;//ADDING STARS
            System.out.println();
        }
    }
}
