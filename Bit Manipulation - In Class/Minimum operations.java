/*

Minimum operations

medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara is learning bits manipulation today and she is stuck on a problem and asks for your help.
Problem:-
Given an integer N. Your task is to change the integer to 0 by performing the following operations:-
1. Change the rightmost digit(0th index). i. e you can change the rightmost digit to 1 if it is 0 or 0 if it is 1.
2. Change the ith bit if (i-1)th bit is 1 and all bits right to (i-1) is 0. For eg:- you can change the left most bit of these numbers:- 1100, 110, 110000.

Your task is to find the minimum operation to make the number 0.
Input
The input contains a single integer N.

Constraints:-
0 <= N <= 1000000000
Output
Print the minimum number of operations required
Example
Sample Input:-
3

Sample Output:-
2

Explanation:-
3- >11(binary representation)
01;- Change the leftmost bit using the second operation
00:- Change the rightmost bit using the first operation

Sample Input:-
14

Sample Output:-
11

Explanation:-
14 - > 1110
1111 - > using 1st operation
1101 - > using 2nd operation
1100 - > using 1st operation
0100 - > using 2nd operation
0101 - > using 1st operation
0111 - > using 2nd operation
0110 - > using 1st operation
0010 - > using 2nd operation
0011 - > using 1st operation
0001 - > using 2nd operation
0000 - > using 1st operation
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(minimumOneBitOperations(N, 0));
    }
    public static long minimumOneBitOperations(long n, long res)
    {
       
      
        if (n == 0)
            return res;
             long b = 1;
        while ((b << 1) <= n)
            b = b << 1;
            return minimumOneBitOperations((b >> 1) ^ b ^ n, res + b);
    }
}