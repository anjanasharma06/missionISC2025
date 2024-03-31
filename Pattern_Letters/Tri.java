package Pattern_Letters;
/*
A 
A B
A B C
A B C D
A B C D E
 */
public class Tri {
    public static void main(String[] args) {
       
        for(int i=1;i<=5;i++)
        {
            int s=65;
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)s+" ");
                s++;
            }
           
            System.out.println();
        }
    }
}
