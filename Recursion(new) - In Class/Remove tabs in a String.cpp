/*

Remove tabs in a String

easy
asked in interviews by 2 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Write a recursive program to remove all tabs or spaces from a string.
Input
The first line contains the string s.

Constraints:
0
Output
Prints the string after removing all the tabs and spaces.*/

#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

string fun1(string s,int n);
int main() {
    string s1;
    getline(cin,s1);
    int n = s1.length();
    n=n-1;

    fun1(s1,n);

    //char charstr[]=s1;
	// Your code here
    return 0;
}
string fun1(string s, int n)
{
    if(n<0)
    {
        cout<<s;
        return s;
    }
    if(s[n]==' ')
    {
        s = s.substr(0,n) + s.substr(n+1);
        return fun1(s,n-1);
    }
    else
    {
        return fun1(s,n-1);
    }
}