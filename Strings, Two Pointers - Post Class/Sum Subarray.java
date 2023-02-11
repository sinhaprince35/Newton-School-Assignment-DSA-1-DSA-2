/*
Sum Subarray
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array Arr of N integers. A subarray is good if the sum of elements of that subarray is greater than or equal to K. Print the length of good subarray of minimum length.
Input
First line of input contains N and K.
Second line of input contains N integers representing the elements of the array Arr.

Constraints
1 <= N <= 100000
1 <= Arr[i] <= 100000
1 <= K <= 1000000000000
Output
Print the length of good subarray of minimum length.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
                         Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			long k=sc.nextLong();

			int arr[]=new int[n+1];
			for(int i=1;i<=n;i++){
				arr[i]=sc.nextInt();
			}
			int j=1;
			long s=0;
			int ans=n;
			for(int i=1;i<=n;++i){
				while(s<k && j<=n){
					s+=arr[j];
					++j;
				}
				if(s>=k){
					ans=Math.min(ans,j-i);
				}
				s-=arr[i];
			}
			System.out.print(ans);
	}
}