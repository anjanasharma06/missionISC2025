package Pattern_Letters;
/*
A 
B C 
D E F
G H I J
K L M N O 
*/
public class Letters_Tri {
    public static void main(String[] args) {
        int s=65;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)s+" ");
                s++;
            }
           
            System.out.println();
        }
    }
}
