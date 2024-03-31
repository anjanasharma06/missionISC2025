package Pattern_Num;
/*
1 2 3 4 5 
2 3 4 5 1
3 4 5 1 2
4 5 1 2 3
5 1 2 3 4 
*/
public class Sq_Num {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print("");
            }
            for(int j=i;j<=5;j++)
            {
                System.out.print( j+" ");
            }
            for(int k=1;k<=i-1;k++)
            {
            System.out.print(k+" ");
            }
            System.out.println();
        
    }
    
}
}
