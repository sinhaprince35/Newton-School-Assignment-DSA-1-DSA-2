/*
Rev Strings
easy
asked in interviews by 47 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a string your task is to reverse the given string.
Input
The first line of the input contains a string.

Constraints:-
1 <= string length <= 100
String contains only lowercase english letters
Output
The output should contain reverse of the input string.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
                      // Your code here
         Scanner j=new Scanner(System.in);
                      String s=j.nextLine();
                      String ans="";
                      for(int i= s.length()-1;i>=0;i--){
                          ans+=s.charAt(i);
                           }
                      System.out.println(ans);
    }

    }