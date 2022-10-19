/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 5 (20 marks)
    Write a program in Java to display (i.e. print) the pattern like right angle triangle with a number.

 * INPUT: an integer number n
 * OUTPUT: print a right angle triangle corresponding to n

 * Example1: for n=3, the right angle triangle should be:
    1
    12
    123

 * Example2: for n=5, the right angle triangle should be:
    1
    12
    123
    1234
    12345

 */

import java.util.Scanner;

public class Q5_DisplayNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //initializing scanner

        System.out.print("Enter your integer:");
        int n = sc.nextInt(); // gets input for integer

        for (int i = 1; i<=n;i++){ //loops until it reaches the user's inputted number
            for (int j = 1;j<=i;j++){ //loops from 1 and increase till the current value of i
                System.out.print(j); //prints out j
            }
            System.out.println(""); //starts new line
        }
    }
}
