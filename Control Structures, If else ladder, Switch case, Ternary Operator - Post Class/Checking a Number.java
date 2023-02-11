/*

Checking a Number

easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Write a program to check whether a number is positive, negative or zero using switch case.
Input
The first line of the input contains the number

Constraints
-109 ≤ n ≤ 109
Output
Print the single line wether it's "Positive", "Negative" or "Zero"
Example
Sample Input :
13

Sample Output :
Positive

Sample Input :
-13

Sample Output :
Negative

*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
         Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int status = checkStatus(number);
        switch(status){
            case 0:
                System.out.print("Negative");
                break;
            case 1:
                System.out.print("Positive");
                break;
            default:
                System.out.print("Zero");
                break;


        }
    }

    public static int checkStatus(int number){
        if(number>0){
            return 1;
        }
        else if(number<0){
            return 0;
        }
        else{
            return -1;
        }
    }
}