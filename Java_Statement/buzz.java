package Java_Statement;

 import java.util.*;
 public class buzz {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NO.");
        int n=sc.nextInt();

        buzz ob=new buzz();// creating object
        boolean BuzzNum=ob.isBuzz(n);

        if(BuzzNum==true)
        System.out.println("Buzz no.");
        else
        System.out.println("Not a Buzz no.");

    }
        public boolean isBuzz(int num){
           if(num<1)
           {
           return false;
           }

            if(num%10==7||num%7==0){
            return true;
            }
            else 
            return false;

    }
}



