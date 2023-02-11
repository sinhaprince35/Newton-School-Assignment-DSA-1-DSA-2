/*
Smallest String There Is
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a positive integer N, construct a string of length N such that no two adjacent characters are the same. Among all possible strings, find the lexicographically minimum string.
Note: You can use only lowercase characters from 'a' to 'z'.
Input
The first and only line of input contains an integer N.

Constraints:
1 <= N <= 105
Output
Print the required string.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();       
       for(int i=0;i<n;i++){
          System.out.print((char)('a'+i%2));                     
        } 
  }
}