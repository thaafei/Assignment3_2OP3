/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (20 marks)
    Write a Java program to convert a decimal number (i.e., int value) to octal number.
    Please DO NOT use any Java provided subroutines or any third party subroutines to do the conversion.
    You should write your own code to convert a decimal number to octal number.

    Decimal number: The decimal numeral system is the standard system for denoting integer and non-integer numbers. It is also called base-ten positional numeral system.
    Octal number: The octal numeral system is the base-8 number system, and uses the digits 0 to 7.


 * INPUT: a user input decimal number x
 * OUTPUT: an octal number y converted from x

* Hint: For a decimal number x=1256, the corresponding octal number is y=2350.
 */

import java.util.Scanner;

public class Q2_Decimal2Octal {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); //initializing scanner
        System.out.print("Input an integer: ");
        int input = sc.nextInt(); // gets input for integer

        if (input<8){ // if decimal is less than 8, octal number is the same as the decimal
            System.out.println("Octal number of "+input+" is "+input);
        }

        else { //if input is >=8, then do the else statement
            int currentDec = input; // sets the current decimal as the input
            String remains = " "; //string to store the remainder, aka the octal number

            while (currentDec>7){ //loops until the current decimal is less then 8
                remains =  String.valueOf(currentDec%8)+remains; //adds the remainder of the current decimal divided by 8 to the front of the string to store remainders
                currentDec=currentDec/8; //resets the current decimal number
            }
            remains= currentDec+remains; //adds the current decimal to the remainder string
            System.out.println("Octal number of "+input+" is "+remains); //prints the output
        }
    }
}
