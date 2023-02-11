/*

Insert Operator

easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a sequence of numbers of size N. You have to find if there is a way to insert + or - operator in between the numbers so that the result equals K.
Input
The first line of input contains two integers N and K. The next line of input contains N space- separated integers depicting the values of the sequence.

Constraints:-
1 <= N <= 20
-10^15 <= K <= 10^15
0 <= Numbers <=10^13
Output
Print YES if possible else print NO.
*/

#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

static int InsertOp(int n,long k,long arr[],int i,long sum)
	{
		if(i==n)
		{
			if(sum==k)
			return 1;
			return 0;
		}
		if((InsertOp(n,k,arr,i+1,sum+arr[i]))==1)
		return 1;
		return InsertOp(n,k,arr,i+1,sum-arr[i]);
			
	}



int main() {
    int n;
    long k;
    cin>>n>>k;
    long arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    int ans=InsertOp(n,k,arr,0,0);
					 if(ans==1){
    cout << "YES" << endl;
     } 
    else{
    cout << "NO " << endl;
        }
	// Your code here
    return 0;
}