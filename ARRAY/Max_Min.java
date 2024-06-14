
package ARRAY;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the value");
     int arr[]=new int [5];

     for(int i=0;i<arr.length;i++){

        arr[i]=sc.nextInt();
     }
     int max=arr[0];
     int min=arr[0];
      for(int j=0;j<arr.length;j++)
     {
     if(arr[j]>max)
     {
            max=arr[j];
     }
            if(arr[j]<min)
            {
            min=arr[j];
            }
        }
     System.out.println("max: "+max);
     System.out.println("min: "+min);
     
    }
}
