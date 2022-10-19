/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 4 (20 marks)
    Write a Java program to print integer numbers between 1 to a user input integer n, which are divisible by 3, 5 and by both.

 * INPUT: a user input integer n
 * OUTPUT: all the integer numbers between 1 and n that are either divisible by 3 or by 5 or by both.

* Hint: For n=16, the output should be as follows.
    Divided by 3 -> 3, 6, 9, 12, 15.
    Divided by 5 -> 5, 10, 15.
    Divided by 3 and 5 -> 15.
 */

import java.util.Scanner;

public class Q4_FindNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); //initializing scanner

        System.out.print("Enter your integer:");
        int n = sc.nextInt(); // gets input for integer

        System.out.print("\nDivided by 3: "); //prints divided by 3
        for ( int i = 1; i<=n;i++){ //starting from 1, increases till n
            if (i%3 == 0){ //only prints if i%3 is 0
                System.out.print(i+" ");
            }
        }
        System.out.print("\nDivided by 5: ");

        for ( int i = 1; i<=n;i++){
            if (i%5 == 0){ //only prints if i%5 is 0
                System.out.print(i+" ");
            }
        }
        System.out.print("\nDivided by 3 and 5: ");

        for ( int i = 1; i<=n;i++){
            if (i%3 == 0 && i%5==0){ //only prints if i%5 AND i%3 is 0
                System.out.print(i+" ");
            }
        }
    }
}
