package Pattern_Num;
/*
5 4 3 2 1 
5 4 3 2
5 4 3
5 4
5 
*/
public class Left_RevTri {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            int k=5;
            for(int j=1;j<=5-i+1;j++)
            {
                System.out.print(k--+" ");
            }
            System.out.println();
        }
    }
    
}
