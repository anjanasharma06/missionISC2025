package Pattern_Num;
/* 1 
   1 2
   1 2 3
   1 2 3 4
   1 2 3 4 5
   1 2 3 4
   1 2 3
   1 2
   1 */
public class Left_Pascal {
    public static void main(String[] args) {
        for(var i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
            System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int k=1;k<=4;k++)
        {
            for(int l=1;l<=4-k+1;l++)
            {
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
    
}
