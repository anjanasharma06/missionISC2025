package Pattern_Num;
/* 
5 
5 4
5 4 3
5 4 3 2
5 4 3 2 1 */
public class num2 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        { 
            for(int k=5;k>=5-i+1;k--)
            {
                System.out.print(k+" ");
            }
        System.out.println();
        }
    }
    
}
