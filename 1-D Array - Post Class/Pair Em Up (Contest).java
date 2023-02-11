/*

Pair Em Up (Contest)
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N elements where N is even. You have to pair up the elements into N/2 pairs such that each element is in exactly 1 pair. You need to find minimum possible X such that there exists a way to pair the N elements and for no pair sum of its elements is greater than X.
Input
First line contains N.
Second line contains N space separated integers, denoting array.

Constraints:
1 <= N <= 100000
1 <= elements of the array <= 1000000000
Output
Print a single integer, minimum possible X.
Example
Sample Input
4
3 1 1 4

Sample Output
5

Explanation: we can pair (1, 3) and (1, 4) so all pairs have sum less than or equal to 5. */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      int n;
					  Scanner sc = new Scanner(System.in);
					  n = sc.nextInt();
					  long[] arr = new long[n];
					  for(int i = 0; i < n; i++){
						  arr[i] = sc.nextLong();
					  }
					  Arrays.sort(arr);
					  long max_sum = Integer.MIN_VALUE;
					  for(int i = 0; i < n/2; i++){
						  long sum = arr[i] + arr[n-1-i];
						  max_sum = Math.max(max_sum, sum);

					  }
					  System.out.print(max_sum);
                      
	}
}