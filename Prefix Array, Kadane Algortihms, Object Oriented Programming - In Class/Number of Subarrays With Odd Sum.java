/*

Number of Subarrays With Odd Sum

easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A of integers, find the number of subarrays with an odd sum.
Input
First line contains an integers N.
Next line contains N space separated integers denoting elements of array.

Constraints
1 <= N <= 10^5
1 <= Ai <= 10^5
Output
Print the number of subarrays with an odd sum. */

import java.io.*;
import java.util.*;
class Main{
	static long countOddSum(long ar[], long n)
	{
		long temp[] = { 1, 0 };
		long result = 0, val = 0;
		for (int i = 0; i <= n - 1; i++) {
		val = ((val + ar[i]) % 2 + 2) % 2;
			temp[(int)val]++;
		}
		result = temp[0] * temp[1];
		return (result);
	}
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[] ar = new long[num];
        for(int i=0; i<num; i++){
            ar[i]=sc.nextLong();
        }
		long n = ar.length;
		System.out.println(countOddSum(ar, n));
	}
}