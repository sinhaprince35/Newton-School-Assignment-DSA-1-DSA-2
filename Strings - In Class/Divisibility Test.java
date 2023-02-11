/*
Divisibility Test
easy
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a big number in form of a string A of characters from 0 to 9.

Check whether the given number is divisible by 30 .
Input
The first argument is the string A.

Constraints
1 ≤ |A| ≤ 105
Output
Return "Yes" if it is divisible by 30 and "No" otherwise.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        String number=sc.nextLine();
        
        if((number.charAt(number.length()-1)=='0')){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}