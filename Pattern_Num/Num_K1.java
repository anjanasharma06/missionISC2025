package Pattern_Num;
/*  5 4 3 2 1 
    4 3 2 1
    3 2 1
    2 1
    1
    1
    2 1
    3 2 1
    4 3 2 1
    5 4 3 2 1     */
public class Num_K1 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
           
            for(int k=5-i+1;k>=1;k--)
            {
                System.out.print(k+" ");
            }
        
        System.out.println();
        }
        for(int i=1;i<=5;i++)
        {
           
            for(int k=i;k>=1;k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    
}
