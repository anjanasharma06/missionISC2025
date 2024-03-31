package Pattern_Letters;
/* 
        A 
      B C 
    D E F
  G H I J
K L M N O
  P Q R S
    T U V
      W X 
        Y
 */
public class Pascal_Tri {
    public static void main(String[] args) {
        int s=65;
        int n=80;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)s+" ");
                s++;
            }
            System.out.println();
        }

        for(int k=1;k<=4;k++)
        {
        for(int j=1;j<=k;j++)
        {
            System.out.print("  ");
        }
        for(int j=k;j<=4;j++)
        {
            System.out.print((char)n+" ");
            n++;
        }
        System.out.println();
    }
}
}
