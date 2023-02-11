/*
Odd characters
easy
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string(1-indexed). Print all the characters of the string at odd positions.
Input
The first line of the input contains a string S. String contains only lowercase english letters.

Constraints:-
1 <= |S| <= 100
Output
The output should contain the character's at odd positions seperated by space.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        for(int i=0; i<str.length(); i++){
            
            if(i%2==0){
                System.out.print(str.charAt(i)+" ");
            }
        }
                     
    }
}