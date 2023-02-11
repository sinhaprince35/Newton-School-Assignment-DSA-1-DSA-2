/* Student Grades
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given marks of a student in 5 subjects. You need to find the grade that a student would get on the basis of the percentage obtained. Grades computed are as follows:
If the percentage is >= 80 then print Grade ‘A’
If the percentage is <80 and >=60 then print Grade ‘B’
If the percentage is <60 and >=40 then print Grade ‘C’
else print Grade ‘D’
Input
The input contains 5 integers separated by spaces.

Constraints:
1 ≤ marks ≤ 100
Output
You need to print the grade obtained by a student.
Example
Sample Input:
75 70 80 90 100

Sample Output:
A*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int marks1=sc.nextInt();
        int marks2=sc.nextInt();
        int marks3=sc.nextInt();
        int marks4=sc.nextInt();
        int marks5=sc.nextInt();
        int total_marks=(marks1+marks2+marks3+marks4+marks5)/5;
        if (total_marks>=80 && total_marks<=100)
        {
            System.out.println('A');
        }
        else if (total_marks<80 && total_marks>=60)
        {
            System.out.println('B');
        }
        else if (total_marks<60 && total_marks>=40)
        {
            System.out.println('C');
        }
        else 
        {
            System.out.println('D');
        }

    }
}