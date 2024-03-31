package Pattern_Letters;
/*
A B C D E 
F G H I 
J K L
M N
O
 */
public class Letter_Rev_Tri {
    public static void main(String[] args) {
        int s=65;
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<=5;j++)
            {
                System.out.print((char)s+" ");
                s++;
            }
           
            System.out.println();
        }
    }
}
