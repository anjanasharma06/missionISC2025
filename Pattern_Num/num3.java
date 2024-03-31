package Pattern_Num;
/*
1 
2 1
3 2 1
4 3 2 1
5 4 3 2 1
 */
public class num3 {
    public static void main(String[] args) {
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
