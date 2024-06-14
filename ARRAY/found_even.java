package ARRAY;
/*WAP to store 10 numbers in an array and display all the even
number present in the array. */
import java.util.Scanner;

public class found_even {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE no.");
        
        int arr[]=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
       
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]/2==0)
            System.out.println(arr[j]);
               else
               System.out.println();
        }
      
    
    } 
}
