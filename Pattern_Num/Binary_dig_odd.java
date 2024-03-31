package Pattern_Num;
/*
1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1 
*/
public class Binary_dig_odd{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(j%2==0)

                System.out.print(0+" " );
                else
                System.out.print(1+" " );  
            }
            System.out.println();
        }
    }
    
}
