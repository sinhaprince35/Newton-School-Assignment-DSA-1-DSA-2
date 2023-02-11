/*
Print Pattern

easy
Problem Statement
Print a sequence of numbers starting with N, without using loop, in which A[i+1] = A[i] - 5, if A[i]>0, else A[i+1] = A[i] + 5 repeat it until A[i]=N.

Note:- Once you change a operation you need to continue doing it.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function PrintPattern() that takes the integer N and the integer curr (curr = N) and bool flag (flag = true) as a parameter.

Constraints:
1<=T<=10
0 < N < 1000
Output
Print the pattern with space-separated integers.*/

static void printPattern(int n, int m, boolean flag)
    {
         
       
        System.out.print(m + " ");
        if (flag == false && n == m)
            return;
 
        if (flag) {
 

            if (m - 5 > 0)
                printPattern(n, m - 5, true);
 
            else 
                printPattern(n, m - 5, false);
        }
 
        else 
            printPattern(n, m + 5, false);
    }