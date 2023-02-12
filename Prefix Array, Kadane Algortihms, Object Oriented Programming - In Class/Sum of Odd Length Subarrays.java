/*

Sum of Odd Length Subarrays

medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of positive integers A of size N. The power of an array is defined as sum of all elements in it. Calculate the sum of powers of all possible odd - length subarrays.
A subarray is a contiguous subsequence of the array.
Input
First line contains an integer N.
Next line contains N space separated integers denoting elements of array.

Constraints
1 <= N <= 1000
1 <= Ai <= 10^5
Output
Print the sum of powers of all possible odd - length subarrays.*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long sumOddLengthSubarrays(long[] arr) {
        long result = 0;

		// i: j is the range of a sub-array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length; j += 2) {
				// iterate over sub-array
                for (int k = i; k < j; k++) {
                    result += arr[k];
                }
            }
        }

        return result;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        long[] arr = new long[num];

        for(int i=0; i<num; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(sumOddLengthSubarrays(arr));
                      // Your code here
    }
}