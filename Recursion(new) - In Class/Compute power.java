/*

Compute power

easy
Problem Statement
You are given two numbers n and p. You need to find n raised to the power p.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function RecursivePower that takes the integer n and p as a parameter.

Constraints:
1 <= T <= 10
1 <= n, p <= 9
Output
Return n^p.*/

static int Power(int n,int p)
{
      if(p==0)
      {
            return 1;
      }
      return n*Power(n,p-1);
      // Your code here
}