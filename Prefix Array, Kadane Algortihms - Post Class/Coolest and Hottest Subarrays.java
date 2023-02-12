/*

Coolest and Hottest Subarrays

medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
The coolness of the subarray of an array is the sum of elements in the subarray. The coolest subarray is the subarray having the maximum coolness, while the hottest subarray is the one having minimum coolness (obviously it can be negative). The coolest and the hottest subarrays are always non-empty.

Tono believes that cool and hot are happy together. The happiness of the array is the absolute difference between the coolness of its coolest and its hottest subarray.

Given an array A consisting of N elements, find its happiness.
Input
The first line of the input contains an integer N.
The next line contains N singly spaced integers A[1], A[2],...A[N]

Constraints
1 <= N <= 200000
-1000000000 <= A[i] <= 1000000000
Output
Output a single integer, the happiness of the array.
(The output may not fit into 32 bit integer datatype, use long long integer datatype instead). 
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static long subArray (long [] arr)
    {
        long maxValue = arr[0], maxEnd = arr[0];
        long minValue = arr[0], minEnd = arr[0];
        long sum = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            maxEnd = Math.max(arr[i], maxEnd + arr[i]);
            maxValue = Math.max(maxEnd, maxValue);
            minEnd = Math.min(arr[i], minEnd + arr[i]);
            minValue = Math.min(minEnd, minValue);
            sum += arr[i]; 
        }
        return Math.abs(maxValue - minValue);
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextLong();
        }
        System.out.println(subArray(arr));
    }
}