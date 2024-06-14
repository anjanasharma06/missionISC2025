package RECURSION;
/*

* 
* *
* * *
* * * * 
* * * * *
* * * * * *
* * * * * * * 
* * * * * * * *
* * * * * * * * *
* * * * * * * * * *

 */
    public class RightAngledTriangle {
        public static void main(String[] args) {
        printTriangle(10, 1);
        }
        public static void printTriangle(int rows, int currentRow) {
        if (currentRow > rows) {
        return;
        }
        printStars(currentRow);
        System.out.println();
        printTriangle(rows, currentRow + 1);
        }
        public static void printStars(int count) {
        if (count == 0) {
        return;
        }
        System.out.print("* ");
        printStars(count - 1);
        }
       }

