package Java_Statement;

public class count_Dig {
    public static void main(String[] args) {
        int n=243;
        int c=0;
        int sum =0;
        while(n>0)
        { 
           sum=n%10;
            c++;
            n=n/10;
        }
        System.out.println("Total no. of digits present :"+c);
    
    
}
}