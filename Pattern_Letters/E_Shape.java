package Pattern_Letters;
/*
E E E E E 
E
E E E E E
E
E E E E E */
public class E_Shape {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
        int s=69;
            for(int j=1;j<=5;j++)
            {
                if(i%2!=0)
                System.out.print( (char)s+" ");
            } 
            if(i%2==0){
            System.out.print((char)s+" ");
            }
            System.out.println();
            
        }
    }
}
