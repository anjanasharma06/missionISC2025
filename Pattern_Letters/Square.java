package Pattern_Letters;
/*
A A A A A 
B B B B B
C C C C C
D D D D D
E E E E E 
*/
public class Square {
    public static void main(String[] args) {
        int s=65;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print((char)s+" ");
            }
            s++;
            System.out.println();
        }
    }
}
