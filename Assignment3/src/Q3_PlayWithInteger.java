/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (20 marks)
    Write a Java program that accepts an integer (n, 0 <= n <= 9) and computes the value of n+nn+nnn.

 * INPUT: a user input integer n
 * OUTPUT: the value of n+nn+nnn.

* Hint: For n=2, the output is 2+22+222=246
 */

import java.util.Scanner;

public class Q3_PlayWithInteger {
    static int StoI(String x) { //method to change string to int
        return Integer.parseInt(x); //returns int from string x
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //initializing scanner

        System.out.print("Input an integer: ");
        int input = sc.nextInt(); // gets input for integer

        String var = String.valueOf(input); //changes input into a string
        String var2 = var+var; //creates nn
        String var3 = var+var+var; //creates nnn

        System.out.println(StoI(var)+StoI(var2)+StoI(var3)); //prints the value of n+nn+nnn, passes strings to method to change into int

    }

}
