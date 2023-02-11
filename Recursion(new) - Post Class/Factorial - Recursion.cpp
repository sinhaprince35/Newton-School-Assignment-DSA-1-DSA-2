/*
Factorial - Recursion

easy
asked in interviews by 16 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Find factorial of a given number N.
Input
User Task
Since this is a functional problem, you don't have to worry about the input. You just have to complete the function Factorial() which contains the given number N.

Constraints:
1 <= N <= 15
Output
Return the factorial of the given number.*/

#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int Factorial(int N);
int main() {
    int N;
    cin>>N;
    cout<<Factorial(N);
	// Your code here
    return 0;
}

int Factorial(int N)
{
    if(N==0)
    {
        return 1;
    }
    return N*Factorial(N-1);
}