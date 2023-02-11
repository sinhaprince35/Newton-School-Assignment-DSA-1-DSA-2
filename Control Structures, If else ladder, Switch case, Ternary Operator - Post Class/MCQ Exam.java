/*

MCQ Exam

easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara has an MCQ exam containing 100 questions this sunday but she isn't prepared. She came to know that in her exam
- >P number of Questions will have A as the correct option
- >Q number of Questions will have B as the correct option
- >R number of Questions will have C as the correct option
- >S number of Questions will have D as the correct option
Sara doesn't know the order of the questions. If Sara filled the MCQs optimally (same option for each question) using the above information what will be the maximum marks she can get.
Input
The input contains 4 integers P, Q, R, and S.

Constraints:-
0 <= P, Q, R, S <= 100

Note:- P + Q + R + S will always be 100
Output
Print the maximum marks Sara can get.
Example
Sample Input:-
8 10 20 62

Sample Output:-
62

*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner Scn = new Scanner(System.in);
         int p = Scn.nextInt();
         int q = Scn.nextInt();
         int r = Scn.nextInt();
         int s = Scn.nextInt();

         if(p >= q && p >= r && p >= s) {
            System.out.println(p);
         }else if (q >= r &&  q >= s && q >= p){
            System.out.println(q);
         }else if(r >= s && r >= q && r >= p){
            System.out.println(r);
         }else{
            System.out.println(s);
         }

    }
}